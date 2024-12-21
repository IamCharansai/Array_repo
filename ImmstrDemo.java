package Arrays;

public class ImmstrDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//readonly
		//immutable
		
		String data1 = "Hi";
		String data2 = "Hi";
		
		if(data1==data2) {
			System.out.println("Same");
			}
		else {
			System.out.println("Not");
		}
		
		
		
		String data3 = new String ("Hi");
		String data4 = new String ("Hi");
		
		if(data3==data4) {
			System.out.println("From new Same");
			}
		else {
			System.out.println("From new Not");
		
		}
	}

	}
