package General_Preparation;

import java.util.Scanner;

import org.testng.annotations.Test;

public class P_02_Print_String_In_Reverse_Order {
	
	@Test
	public void P_2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a text:: ");
		String input = sc.nextLine();
		
		System.out.print("Reversed String:: ");
		for(int i = input.length()-1; i>=0; i--) {			
			System.out.print(input.charAt(i));
		}
		
		System.out.println("");
		
	}

}
