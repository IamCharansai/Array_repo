package Day6;

import java.util.Scanner;

public class Excercise1 {

	public static void main(String[] args) {
		// ascending order / descending order
		// 15 3 5 2 7 1 10
		//Bubble sort
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int[]num=new int[size];
		System.out.println("enter the elements of array");
		for (int m=0;m<size;m++) {
			num[m] = sc.nextInt();
		}
		//int [] num = {15,3,5,2,7,1,10};
		int t;
		for (int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
					t=num[i];
					num[i]=num[j];
					num[j]=t;				
			}//if
		}//j
	}//i
	for(int k=0;k<num.length;k++) {
		System.out.println(num[k]+" ");
	}
}
}
