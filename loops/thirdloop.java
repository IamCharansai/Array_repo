package loops;

public class thirdloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=8917,rem,nn=0;
		//8
		
		int d = 1000;
		
		if(n<10)d=1;
		else if (d<100) d=10;
		else if (d<1000)d=100;
		
		int z=1;
		int t=n;
		while(1==1) {
			n=n/10;
			z=z*10;
			if(n==0)break;
		}
		z=z/10;
		n=t;
	//z --10000
		while(1==1) {
			rem = n/z;
			n=n%z;
			z=z/10;
			
			System.out.println(rem);
			if(n==0)break;
		}
	}

}
