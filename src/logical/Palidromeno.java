package logical;

import java.util.Scanner;

public class Palidromeno {

	public static void main(String[] args) {
		
		int n,s=0,c,r;
		System.out.println("Enter any no =   ");
		Scanner vc= new Scanner (System.in);
		n=vc.nextInt();
		c=n;
		while (n>0) {
			
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if (c==s) {
			
			System.out.println(" palidrome no ");
		}
		else 
			System.out.println(" not a palidrome no ");
	}

}
