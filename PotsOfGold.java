/**
Pots of gold game: Two players A & B. There are pots of gold arranged in a line, each containing some gold coins (the players can see how many coins are there in each gold pot - perfect information). They get alternating turns in which the player can pick a pot from one of the ends of the line. The winner is the player which has a higher number of coins at the end. The objective is to "maximize" the number of coins collected by A, assuming B also plays optimally. A starts the game.

The idea is to find an optimal strategy that makes A win knowing that B is playing optimally as well. How would you do that? 
**/

public int max_coin( int[] coins , int start, int end)
{

	//assume the players pick off the end of an array.
	//each time a player has the option to either pick from the start of the array or the end of the array
	
	//exit condition
	if(start >end)
		return 0;

	//added to remove recursive calls.
	CustomStartEndObject ob= new CustomStartEndObject(start,end);
	if map.containsKey(ob)
		return map.get(ob);//returns the index if its already been looked at
	// end add
	
	int pick_from_start= coins[start] + Math.min(max_coin(coins,start+1,end-1),max_coin(coins,start+2,end));//  pick the coin from start and 
														//	take the minimum for B based on whether the last or the first is less.
	int pick_from_end= coins[end]+Math.min(max_coin(coins,start+1,end-1),max_coin(coins,start,end-2));//  pick the coin from end
														//take the minimum for B based on whether the last or the first is less..
	//return the max of above 2 so that it maximizes A's result.

	int max_coin_valueforA=Math.max(pick_from_start,pick_from_end);
	//populate map to prevent recursive call.
	CustomStartEndObject lookupob= new CustomStartEndObject(start,end);
	map.put(lookupOb,max_coin_valueforA);


	return max_coin_valueforA;
}

