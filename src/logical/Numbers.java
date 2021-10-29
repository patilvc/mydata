package logical;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		
Scanner scan= new Scanner (System.in);

System.out.println("enter maximum number=  ");
int a=scan.nextInt();
System.out.println("enter minimum number=  ");
int b= scan.nextInt();

for (int i=a;i<=b;i++) 
{
	System.out.println(i);
}

	}

}
