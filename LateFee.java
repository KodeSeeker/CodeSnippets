package com.test;

import java.util.Scanner;

public class LateFee {

	public static void main (String... args){
		 int retDay,retMonth,retYear;
		 int dueDay,dueMonth, dueYear;
		 Scanner in = new Scanner(System.in);
		 retDay = 5;
		 retMonth=5;
		 retYear = 2014;
		 dueDay=23;
		 dueMonth=2;
		 dueYear=2014;
		 
		 System.out.println(computeFine(retDay, retMonth, retYear, dueDay, dueMonth, dueYear));
		
	      
		 
	}
	
	
	
static int computeFine(int retDay, int retMonth, int  retYear, int dueDay, int dueMonth, int dueYear){
		
	if(dueYear > retYear)
			return 0;
	else if (dueYear == retYear){
			if(dueMonth >retMonth){
				return 0;
			}
			else if(dueMonth == retMonth && dueDay >retDay){
				return 0;
			}
			else if( dueMonth == retMonth){
				if(retDay>dueDay)
					return (retDay-dueDay)*15;
				else if(retDay == dueDay)
					return 0;		
            }
			else {
                 return 500 *(retMonth-dueMonth);
            }
		}   
	else {
            return 10000;
        }
		return 0;
}



}
