package logical;

import java.util.Scanner;

public class Evennum {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
         
        System.out.println("enter  1st number ");   
        int a =scan.nextInt();
           
           System.out.println( "enter 2nd number ");
           int b =scan.nextInt();
           
           for (int i=a;i<=b;i++)
           {
        	   if(i%2==0) 
        	   {
        		   System.out.println( i+"even ");
        	   }
           }
	}

}

