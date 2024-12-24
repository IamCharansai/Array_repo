package Day6;

public class Excercise4 {

	public static void main(String[] args) {
		String data = "Welcome to Java World";
		
		data = data.toUpperCase();
		
		int[] count = {
				0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0	
		        };
		int index;
		
		char ch = ' ';
		for (int i=0;i<data.length();i++) {
			ch = data.charAt(i);
			if(ch >='A' && ch <='Z') {
			index = (int)(ch -65);
			count [index]++ ;
				}
		}
		for(int i=0;i<26;i++) {
			if (count[i]>0)
			System.out.println((char)(i+65)+" no of elements------>"+count[i]);
		}
	}

}

