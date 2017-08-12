/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class RainbowArray
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int i=0,k=0,flag=0;
        int [] ar = new int[7];
		for(k=0;k<t;k++){
		    for(int p=0;p<7;p++){
                ar[p] = 0;
            }
            flag=0;
		   int n = scan.nextInt();
		   if(n<13){
		       flag = 1;
		   }
		   int a[] = new int[n];
		   int arr[] = new int[n];
		   for(i=0;i<n;i++){
		       a[i] = scan.nextInt();
		       if(a[i]<1 || a[i]>7){
		           flag = 1;
		       }
		   }
		   if(flag != 1){
		   for(int l=0;l<n;l++){
          ar[a[l]-1] = 1;
       }
       for(int h=0;h<7;h++){
         if(ar[h] == 0){
           flag = 1;
           break;
         }
       }
       for(int y=0;y<n;y++){
           arr[y] = a[y];
       }
       Arrays.sort(arr);
        i=0;
         while(a[i] != arr[n-1]){
             if(a[i] > a[i+1]){
                 flag = 1;
                 break;
             }
            else{
                i++;
            }
         }
       if(flag != 1){
         for(int m=0;m<n;m++){
  		      if(a[m] != a[n-m-1]){
  		          flag = 1;
  		          break;
  		      }
          }
		    }
      }
      if(flag != 1){
          System.out.println("yes");
        }
     else
         System.out.println("no");
		}// your code goes here
	}
}
