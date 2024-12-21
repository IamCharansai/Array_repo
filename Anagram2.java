package Arrays;

import java.util.Scanner;

public class Anagram2 {

	public static void main(String[] args) {
		// listen
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 strings");
		String str1 = sc.next();
		String str2 = sc.next();
		sc.close();
		char eachCh = ' ';
		boolean isAnagram = true;
		if(str1.length()==str2.length()) {
			for(int i=0;i<=str1.length();i++) {
				eachCh=str1.charAt(i);
				if(isCharthere(str2,eachCh) == false) {
					isAnagram = false;
					break;
				}//if
			}//for
		}//if
			else {
				isAnagram = false;
			}
			
			if(isAnagram == true) System.out.println("Yes it is Anagram");
			else System.out.println("Not Anagram");


}

	private static boolean isCharthere(String str2, char eachCh) {
		char localCh = ' ';
		for(int i=0;i<str2.length();i++) {
			localCh = str2.charAt(i);
			if(localCh == eachCh) {
		return true;
	}}
		return false;}}
