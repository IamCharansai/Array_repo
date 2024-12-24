package pattern;

public class pattern1 {
	public static void main(String[] args) {
		/*
		 * 1
		 * 1 2
		 * 1 2 3
		 * 1 2 3 4
		 * 1 2 3 4 5
		 * 
		 * 
		 * 
		 */
		for(int r=1;r<=5;r++) {
			for(int c=1;c<=r;c++) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}

}