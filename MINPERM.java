/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class MINPERM
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int temp=0;
		for(int l=0;l<t;l++){
		    int n = s.nextInt();
		    int[] a = new int[n+1];
		    for(int k=1;k<(n+1);k++){
		        a[k] = k;
		    }
		    if(n%2 == 0){
		        for(int i=1;i<(n+1);){
		            temp = a[i];
		            a[i] = a[i+1];
		            a[i+1] = temp;
		            i = i+2;
		        }
		    }
		    else{
		        for(int i=1;i<(n-2);){
		            temp = a[i];
		            a[i] = a[i+1];
		            a[i+1] = temp;
		            i = i+2;
		        }
		        temp = a[n-2];
		        a[n-2] = a[n-1];
		        a[n-1] = a[n];
		        a[n] = temp;
		    }
		    for(int k=1;k<(n+1);k++){
		        System.out.print(a[k]+" ");
		    }
		    System.out.println();
		}
	}
}
