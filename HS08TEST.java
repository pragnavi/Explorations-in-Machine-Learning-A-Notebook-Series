import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args)
	{
    int amt=0;
    float bal=0;
    Scanner scan = new Scanner(System.in);
    amt = scan.nextInt();
    bal = scan.nextFloat();
    if(((amt%5) == 0) && (((bal-(float)amt) > 0.5) || ((bal-(float)amt) == 0.5))){
        System.out.printf("%.2f",((bal-(float)amt)-0.50));
    }
    else{
      System.out.printf("%.2f",bal);
    }
	}
}
