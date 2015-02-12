/**
Given a 12-hour analog clock, compute in degree the smaller angle between the hour and minute hands. Be as precise as you can.
Hour hand moves half a degree per minute. 
Minute hand moves 6 deg per minute. 
**/




public int getAngleBetweenMinuteAndHour(int hours, int mins) {

	int hAngle= 0.5 * (60*h +m);
	int mAngle= 6*m;
	return Math.min(hAngle-mAngle, 360-(hAngle-mAngle));
}

