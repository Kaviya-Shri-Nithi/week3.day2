package week3.day2;

import java.util.Arrays;
import java.util.List;

public class FindIntersectionUsingCollections {
	
	public static void main(String[] args) {
		
		Integer[] arr= new Integer[]{3,2,11,4,6,7};
		Integer[]arr1= new Integer[]{1,2,8,4,9,7};
		
		List<Integer> mylist=Arrays.asList(arr);
		List<Integer> mylist1=Arrays.asList(arr1);
		
		for(int i=0;i<mylist.size();i++)
		{
			for(int j=0;j<mylist1.size();j++) 
			{
				
				if(mylist.get(i)==mylist1.get(j))
				{
				System.out.println(mylist1.get(j))	;
				}
			}
		}
		

	}


}
