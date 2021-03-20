package ArrayListCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayListLinkedHashSet {

	public static void main(String[] args) 
	{
		ArrayList<Integer> name =new ArrayList<Integer>(Arrays.asList(1,2,3,4,3,4,5,6,6,77,77,777,1,0,0));
	//remove duplicates
	LinkedHashSet<Integer> namelist=new LinkedHashSet<Integer>(name);
	System.out.println(namelist);
	//another way to remove duplicates using stream and distinct
	List<Integer> uniqueList=name.stream().distinct().collect(Collectors.toList());
	System.out.println(uniqueList);
	}
	
}
