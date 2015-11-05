package com.test;

public class BaseClass extends IBase {

	String name="BaseName";
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BaseClass b= new BaseClass();
		IBase ib=b;
		System.out.println(b.name);
		System.out.println(ib.name);
		b.setCount();
		System.out.println(b.getCount());
	}

	void setCount(){
		cnt++;
	}
	int getCount(){
		return cnt;
	}
}
