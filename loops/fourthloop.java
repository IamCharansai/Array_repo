package loops;

public class fourthloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8917,rem,z=1,t;
		//8
		//3999
		//7
		//4069
		t=n;
		while(n!=0) {
			n=n/10;
			z=z *10;
		}
		z=z/10;
		n=t;
		while(n!=0) {
			rem=n/z;//8917/1000-----8
			n=n%z;//917
			z=z/10;
			System.out.println(rem);
			
		}

	}

}
