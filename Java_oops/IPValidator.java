package Java_oops;

public class IPValidator {

	public static void main(String[] args) {
		
		String input = "172.16.254.1";
		input.replace('.', ' ');
		String[] data=input.split(" ");
		
		int num = 0;
		boolean isValid = true;
		if(data.length !=4) isValid=false;
		else {
			for(int i=0;i<data.length;i++) {
				num = Integer.parseInt(data[i]);
				if((num<0)||(num>255)){
					isValid = false;
					break;
				}
				else {
					isValid = false;
					break;
				}
		}

	}
		if(isValid == true) {
			System.out.println("Valid IPV4 Address");
		}else {
			System.out.println("Not a Valid IPV4 address");
		}
	}
}                                                 
