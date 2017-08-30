/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ELEVSTRS
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int n=0,v1=0,v2=0;
		for(int k=0;k<t;k++){
		   float t1=0,t2=0;
		   n = s.nextInt();
		   v1 = s.nextInt();
		   v2 = s.nextInt();
		   t1 = ((float)((Math.sqrt(2))*n)/(v1));
		   t2 = ((float)(2*n)/(v2));
		   if(t1<t2){
		       System.out.println("Stairs");
		   }
		   else{
		       System.out.println("Elevator");
		   }
		}
	}
}
