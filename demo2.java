package Charan;

public class demo2 {

	public static void main(String[] args) {
		  
	String name = "ramu";
	char ch = name.charAt(0);
	int diff = (int)('d'-'D');
	
	diff = diff<0?-1 * diff:diff;
	
	if(ch>='a' && ch <='z') {
		ch = (char)(ch -diff);
	}
	System.out.println(ch);
	}

}
