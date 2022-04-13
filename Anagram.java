package week3.day2;

import java.util.Arrays;

public class Anagram {

			public static void main(String[] args) {
				
				String text1="stops";
				String text2="potss";
				if(text1.length()==text2.length()) 
				{
					char[] Ch1=text1.toCharArray();
					char[] Ch2=text2.toCharArray();
					Arrays.sort(Ch1);
					Arrays.sort(Ch2);
					
						if(Arrays.equals(Ch1, Ch2))
						{
					System.out.println("Anagram");
				}
						else 
						{
					System.out.println("NotAnagram");
				} 
		}else {
			System.out.println("Not Anagram");
		}
		}

				}
				
