package week3.day2;

public class ReverseEvenWords {
	public static void main(String[] args) 
	{
	
	String str="I am a software tester";
	String split[] =str.split(" ");
	String reverse=" ";
	
	for(int i=0;i<split.length;i++)
	{  
	
	if((i+1)%2==0) 
	{
	char[] ch=split[i].toCharArray();
	for(int j=ch.length-1;j>=0;j--) 
	{
		reverse=reverse+ch[j];
	
	}
		System.out.print(" "+reverse);
		reverse="";
	}
	else 
	{
		System.out.print(" "+split[i]);
	}
		
    
}  
}  
}
