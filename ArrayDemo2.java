package Arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int[]num = {10,2,5,49,57,5,7};
		int max =  num[0],min = num[0];
		
		for(int a=1;a<num.length;a++) {
			if(num[a]>max) {
				max = num[a];
			}
			if(num[a]<min) {
				min = num[a];
			}
		}
		System.out.println("max------>"+max);
		System.out.println("min------>"+min);
	}

}
