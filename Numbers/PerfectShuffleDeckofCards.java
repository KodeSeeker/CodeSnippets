
/**
WAP to shuffle a deck of cards perfectly.  Where each card has equal probablity to be chosen.

You are given a random number generator to aid in this.
**/

public int[] perfectShuffle( int[] cards)
{
	if (cards==null)
		return null;

	for (int i=0; i<cards.length;i++)
	{
		int k= rand( 0,i);// generate a random number in the range 0,i
		//swap the cards at k and i.
		int tmp= cards[k];
		cards[k]= cards[i];
		cards[i]= tmp;
	}
	
	return cards;
}
