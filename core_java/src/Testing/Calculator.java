package Testing;

import java.util.Scanner;

public class Calculator {
	public int fact(int a) {
		int f=5;
		for(int i=1;i<a;i++) {
			f=f*i;
		}
		return f;
	}
	
	
	/*public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		Calculator c=new Calculator();
		int fact=c.fact(a);
		System.out.println(fact);
	}*/
	

}
