import java.util.*;
import java.lang.*;
import java.io.*;
class ATM{
  public static void main(String args[]){
    int amt=0;
    float bal=0;
    Scanner scan = new Scanner(System.in);
    amt = scan.nextInt();
    bal = scan.nextFloat();
    if(((amt%5) == 0) && (((bal-(float)amt) > 0) || ((bal-(float)amt) == 0))){
        System.out.printf("%.2f",((bal-(float)amt)-0.50));
    }
    else{
      System.out.printf("%.2f",bal);
    }
  }
}
