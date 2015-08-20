/**

Print out the snake string representation given an input
EPI 7.9
**/

//Key here is to identify the order in which the words are printed. 
// 1,5, 9 are printed first
//0,2,4,6,8
//3,7 printed last

static String snakeGenerator (String in) {

StringBuilder result = new StringBuilder();
//print first row
int idx =1;
while(idx<in.length()){

	result.append(in.charAt(idx));
	idx+=4;
}

idx =0;
while(idx<in.length()){

        result.append(in.charAt(idx));
        idx+=2;
}	


idx =3;
while(idx<in.length()){

        result.append(in.charAt(idx));
        idx+=4;
}	


return result.toString();
}

