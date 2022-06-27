package General_Preparation;

import java.util.Scanner;

import org.testng.annotations.Test;

//Print given string in one by one order
public class P_01_Print_String_In_One_by_One_Order {
	
	@Test
	public void P1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a text: ");
		String input = sc.nextLine();
		for(int i = 0; i<input.length(); i++) {
			System.out.println(input.charAt(i));
		}
		
	}

}
