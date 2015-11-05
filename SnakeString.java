package com.test;

public class SnakeString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(snakeGenerator("Hello World"));
	}


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
}
