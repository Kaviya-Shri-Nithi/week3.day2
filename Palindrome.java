package week3.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		String s = "MADAM";
		String rev ="";
		char[] a=s.toCharArray();
		for (int i=s.length()-1;i>=0;i--) 
		{
			rev=rev+a[i];
		}
		if(s.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");

	}

}
