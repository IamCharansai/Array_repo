package Arrays;

public class immDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "Hello";
		StringBuffer str = new StringBuffer("Welcome");
		
		long pT = System.currentTimeMillis();
		for(int i=1;i<=10000;i++) {
			data = data + i;
		}
		long cT = System.currentTimeMillis();
		long diffT = cT - pT;
		
		long pT1 = System.currentTimeMillis();
		for(int i=1;i<=10000;i++) {
			str = str.append(""+i);
		}
		long cT1 = System.currentTimeMillis();
		long diffT1 = cT1 - pT1;
		
		
		
		System.out.println("From String --->"+diffT);
		System.out.println("From StringBuffer --->"+diffT1);
		
		
		
		
	}

}