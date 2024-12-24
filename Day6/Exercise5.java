package Day6;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter data");
		String data = sc.nextLine();
		//String data = "welcome to full stack development";
		data = data.toLowerCase();
		
		int[] count = {
				0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
				};
		char ch = ' ';
		int index;
		for(int i=0;i<data.length();i++) {
			ch = data.charAt(i);
			if(ch >='a' && ch <='z') {
				index = (int)(ch -97);
				count[index]++;
			}
		}
		for(int i=0;i<26;i++) {
			if(count[i] > 0)
			System.out.println("["+(char)(i+65)+"]--->"+count[i]);
		}
	}

}