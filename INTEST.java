/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=0,k=0,cnt=0;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		k = scan.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i] = scan.nextInt();
		    if(a[i] % k == 0)
		        cnt++;
		}// your code goes here
		System.out.println(cnt);
	}
}
