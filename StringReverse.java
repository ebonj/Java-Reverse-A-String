import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) 
	{
		String inpt = "";
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word and I will reverse it for you: \n");
		inpt = input.nextLine();
		
		inpt = reverse(inpt);
		System.out.println("Reversed you typed in: \n" + inpt);
		input.close();		

	}
	
	public static String reverse(String rev1)
	{
		if(rev1 == null || rev1.isEmpty())
		{
			System.out.println("Come on and type something! You didn't type anything. :( \n");
			return rev1;
		}
		
		String reverseString = "";
		
		for(int i = rev1.length() -1; i>=0; i--)
		{
			reverseString = reverseString + rev1.charAt(i);
		}
		return reverseString;
		
	}

}
