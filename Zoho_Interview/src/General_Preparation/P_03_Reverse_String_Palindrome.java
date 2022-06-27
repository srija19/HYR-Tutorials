package General_Preparation;

import java.util.Scanner;

import org.testng.annotations.Test;

public class P_03_Reverse_String_Palindrome {
	
	@Test
	public void P_3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a text: ");
		String input = sc.nextLine();
		String t = "";
		for(int i=input.length()-1; i<=0; i--) {
			t=t+input.charAt(i);
		}
		if(input.contains(t)) {
			System.out.println("Given text is palindrome:: " +input);
		}
		else {
			System.out.println("Not a palindrome:: " +input);
		}
		System.out.println("Upper Case:: " +input.toUpperCase());
		System.out.println("Lower Case:: " +input.toLowerCase());
	}

}
