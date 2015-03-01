/**
In a given large text file find the shortest distance between any two words. Words can be repeated. 
In : as was is the as the Yahoo you me was the end 
Words was the -> 0.
you , the ->2.


Approach two boolean variables for the words and a variable for the shortest distance so far. 
Relative order does not matter!

**/
int minDistance(String in, String wordA, String wordB) {


	boolean foundA= false;
	boolean foundB = false;
	int minDist =INTEGER.MAX_VALUE;
	int dist =0;;
	
	int posA=0;
	int posB =0;

	int start =0;

	String[] ins = in.split("//s+");
	
	
	for(int i=0;i<ins.length; i++) {
		
		String curr = ins[i];
		if( !curr.equals(wordA) && !curr.equals(wordB) && !foundA  &&!foundB )// A and B havent been seen and current word is neither of them 
			continue; // so skip. 
		else if ( curr.equals(wordA) ) {
		
			//if B has already been seen . then this could be a mindist.
			if(foundB){
				dist=Math.abs(posB-i);
				if(dist < minDist) 
					minDist= dist;
			}
			else{ // we havent found B and so no need to update minDist.
				foundA= true;
				posA =i;
			}
		}
		else if ( curr.equals(wordB) ) {

			  //if A  has already been seen . then this could be a mindist.
                        if(foundA){
                                dist=Math.abs(posA-i);
                                if(dist < minDist) 
                                        minDist= dist;
                        }
                        else{ // we havent found A  and so no need to update minDist.
                                foundB= true;
                                posB =i;
                        }
		}
		
	} 

	return minDist;
}
		

}
