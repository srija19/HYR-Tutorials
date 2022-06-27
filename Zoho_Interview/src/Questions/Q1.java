package Questions;

public class Q1 {

	//Remove duplicate characters from the input string and print the output
	
	public static void main(String[] args) {
		String input = "zoho";
		int temp=0;
	//	String in = "o";
		for(int i = 0; i<input.length(); i++) {			
			char single = input.charAt(i);
			char rough = input.charAt(temp);
			if(single==rough)
			{
				System.out.print(input.charAt(i));
			}	
			else{
				System.out.print("");
			}
			temp++;
		}

	}

}
