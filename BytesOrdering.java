/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
// 
	public static String typify (int num)
	{
		int KILO=1000;
		int MEG=1000000;
		int GIG=1000000000;
		char suffix=' ';
			if(num <1000)
				return num+" B";
		if(num>=GIG)
			suffix='G';
		
		else if(num>=MEG)
			suffix='M';
		else if(num>=KILO)
			suffix='K';
		String ans="";
		int rem;
		switch(suffix)
		{
			case 'G':
					int gig=num/GIG;
					 rem= round (num%GIG,GIG/10);
					ans= gig+"."+rem+"G";
					break;
					
			case 'M':
					int meg=num/MEG;
					 rem= round (num%MEG,MEG/10);
					ans= meg+"."+rem+"M";
					break;
			case 'K':
					int kil=num/KILO;
					 rem= round (num%KILO,KILO/10);
					ans= kil+"."+rem+"K";
					break;
		}
		
		return ans;
	}

	public static int round (int num, int divisor)
	{
		int rounded =num/divisor;
		return Math.round(rounded);
	}

    // read in text, replacing all consecutive whitespace with a single space
    // then compute longest repeated substring
    public static void main(String[] args) {
        String s = "abcdefabcabcffgswertyabc";
        s = s.replaceAll("\\s+", " ");
        System.out.println(typify(1400));
        
        
    }
}
