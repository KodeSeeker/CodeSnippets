package com.test;

public class FormatTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String time = "07:05:45PM";
		String time2 = "12:05:45PM";
		String time3 = "07:05:45AM";
		String time4 = "12:05:45AM";
		System.out.println(formatTime(time4));
		
		
	}

	static String formatTime( String inTime){
		
		int hours =0;
		String mins;
		String secs;
		String[] inStrings = inTime.split(":");
		hours =Integer.parseInt(inStrings[0]);
		if(inStrings[inStrings.length-1].endsWith("PM") && hours <12){
		
			hours+=12;
			hours%=24;
		}
		else if(inStrings[inStrings.length-1].endsWith("AM") && hours == 12){
			hours=0;
		}
		mins = inStrings[1];
		secs =inStrings[2].substring(0,inStrings[2].length()-2);
		String hoursString="";
		if (hours <10){
			hoursString= "0"+hours;
		}
	return hoursString+ ":"+mins+":"+secs;
	}
}
