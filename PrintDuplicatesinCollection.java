package week3.day2;

import java.util.Arrays;
import java.util.List;

public class PrintDuplicatesinCollection {
	
	public static void main(String[] args) 
	{
	
	Integer[] arr= new Integer[]{3,2,11,4,6,7,2,3};
	
	
	List<Integer> mylist=Arrays.asList(arr);
		
	for(int i=0;i<mylist.size();i++)
	{
		for(int j=i+1;j<mylist.size();j++) {
			
			if(mylist.get(i)==mylist.get(j))
			{
			System.out.println(mylist.get(j))	;
			}
		}
	}
}

}
