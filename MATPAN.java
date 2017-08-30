/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MATPAN
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int p=0;
		int[] a = new int[26];
		int[] ar = new int[26];
		int sum=0;
		for(int k=0;k<t;k++){
		   sum = 0;
		   for(int i=0;i<26;i++){
		   ar[i] = 0;
		   }
		   for(int j=0;j<26;j++){
		       a[j] = s.nextInt();
		   }
		   String st = s.next();
		   for(int i=0;i<st.length();i++){
		       p = ((int)st.charAt(i))-97;
		       ar[p] = 1;
		   }
		   for(int i=0;i<26;i++){
		       if(ar[i] == 0){
		           sum = sum+a[i];
		       }
		   }
		   System.out.println(sum);
		}
	}
}
