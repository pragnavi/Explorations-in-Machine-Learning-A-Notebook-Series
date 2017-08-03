/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t=0;
		t = scan.nextInt();
	    int [] a = new int [t];
		for(int i=0;i<t;i++){
		    a[i] = scan.nextInt();// your code goes here
	}
	Arrays.sort(a);
	for(int i=0;i<t;i++){
		    System.out.println(a[i]);// your code goes here
	}
	}
}
