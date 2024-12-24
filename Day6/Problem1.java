package Day6;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of records u want to execute:-");
		int n=sc.nextInt();
		int dollar,size;
		int[] heights;// = {30, 10, 22, 30, 40, 50, 79};
		for(int i=1;i<=n;i++) {
			System.out.println("Enter total no of Buildings");
			size =sc.nextInt();
			
			heights=new int[size];
			
			System.out.println("amount in dollar");
			dollar = sc.nextInt();
			System.out.println("Enetr All "+size+"Buildings Heights");
			
			for(int k=0;k<size;k++) {
				heights[k]=sc.nextInt();
				}
			int max = heights[0],count=1;
			
			for(int m=1;m<size;m++) {
				if(heights[m]>max) {
					max = heights[m];
					count++;
				}
			}
			System.out.println("Results---->"+dollar * count);
		}
	}
}