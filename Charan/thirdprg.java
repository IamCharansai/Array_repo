package Charan;

import java.util.Scanner;

public class thirdprg {

	public static void main(String[] args) {
	
		Scanner xy = new Scanner(System.in);
		System.out.println("enter char value");
		char ch = xy.next().charAt(0);
		
		if ((ch>='a')&&(ch<='z')) {
			System.out.println("lowercase alphabet bro");
		}
		else if ((ch>='A')&&(ch<='Z')) {
			System.out.println("Uppercase alphabet broo");
		}
		else {
			System.out.println("Not an alphabet bro");
		}
		
	}

}
