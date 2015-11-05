package com.test;
/**
 * This has directly to do with Defensive Copying.
 * When returning a mutable object from a class ALWAYS return a defensive copy 
 * Rationale: http://www.javapractices.com/topic/TopicAction.do?Id=15
 * @author vmahadevanveeramani
 *
 */
class Mouse{
	
	private Point p ;
	private int x;
	private int y;
	public void click(int x, int y){
		
	 this.x=x;
	 this.y=y;
	}
	
	public Point getLastClick(){
		p= new Point(x,y);
		return p;// this exposes p to be modified from outside the class. 
		//return new Point(x,y);
	}
}
class Point {

	int x;
	int y;
	
	Point(int x, int y){
		this.x= x;
		this.y=y;
	}
	@Override
	public String toString(){
		return(" x "+ this.x+ " y "+this.y);
	}
}

public class ApDyTest {
	
	public static void main(String... args){
	Mouse m= new Mouse();
	m.click(3,4);
	Point res = m.getLastClick();
	System.out.println(" Res "+res);
	res.x=5;
	System.out.println("Mod res"+m.getLastClick());

	}
}

