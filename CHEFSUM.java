/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CHEFSUM
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int n=0,minind=0;
		for(int k=0;k<t;k++){
		    n = s.nextInt();
		    long min = 9999999999999L;
		    long[] a = new long[n];
		    long[] pre = new long[n];
		    long[] suf = new long[n];
		    for(int j=0;j<n;j++){
		        a[j] = s.nextLong();
		        if(j==0){
		            pre[j] = a[j];
		        }
		        else{
		            pre[j] = pre[j-1]+a[j];
		        }
		    }
		    suf[n-1] = a[n-1];
		    for(int l=n-2;l>=0;l--){
		        suf[l] = suf[l+1]+a[l];
		    }
		    for(int i=0;i<n;i++){
		        if(min > (pre[i]+suf[i])){
		            min = pre[i]+suf[i];
		            minind = i;
		        }
		    }
		    System.out.println(minind+1);
		}
	}
}
