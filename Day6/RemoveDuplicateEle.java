package Day6;

import java.util.Scanner;

public class RemoveDuplicateEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//welcome to full stack development
		//welcom t fu stak
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter data");
		String data = sc.nextLine();
		data = data.toUpperCase();
		int[] count = {
				0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
				};
		char ch = ' ';
		int index;
		String result = "";
		for(int i=0;i<data.length();i++) {
			ch = data.charAt(i);
			if(ch >='A' && ch <='z') {
				index = (int)(ch -65);
				count[index]++;
				if(count[index] == 1) {
					result = result + ch;	
				}
			}
		}
	System.out.println("result------>"+result);
	}

}
		
	


