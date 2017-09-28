import java.util.*;
import java.lang.*;
import java.io.*;
class FLOW006{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    for(int i=0;i<t;i++){
      int sum=0;
      int n = s.nextInt();
      while(n>0){
         sum = sum+(n%10);
         n = n/10;
      }
      System.out.println(sum);
    }
  }
}
