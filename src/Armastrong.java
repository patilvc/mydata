import java.util.Scanner;

public class Armastrong {

	
	public static void main(String[] args) {
		
		int a,arm=0,C,rem;
		
		System.out.print( "enter any no =  ");
	
		
		Scanner vc = new Scanner(System.in);
		a = vc.nextInt();
		C=a;
		while (a>0) 
		{ 
			rem=(a%10);
			arm =(rem*rem*rem )+arm;
			a =a/10;
		}
		if (C==arm) 
		
			System.out.print( " its armstrong no ");
		
		else 
		System.out.print
		( " its not a armstrong no ");
		}
	}



