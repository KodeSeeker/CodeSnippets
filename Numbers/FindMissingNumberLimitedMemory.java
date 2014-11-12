/**
 * Idea is to use a bitfield to compactly represent each number
 * Ctci Pg 346.
 * 
 **/
 
 public int missingNumber()
 {
     long numofInts= INTEGER.MAX_VALUE+1;
     boolean[] bitField= new new boolean [numofInts/8];
     for(int i: inStream.nextInt())
     {
         bitField[i/8] | = 1 << (i%8);//sets the ith bit in the ith boolean.
     }
 }
 
 //check fo missing num
 for (int i=0;i<bitField.length;i++)
 {
     //check for each bit
     for(int j=0 j< 8;j++)
     {
         
         if(bitField[i] & (1<<j)===0)
         {
             System.out.print( (i*8)+j);
         }
     }
 }
