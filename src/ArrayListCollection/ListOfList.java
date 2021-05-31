package ArrayListCollection;

import java.util.ArrayList;
import java.util.List;

public class ListOfList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<List<String>> list=new ArrayList<List<String>>();
		List<String> list1=new ArrayList<String>();
		List<String> list2=new ArrayList<String>();
		List<String> list3=new ArrayList<String>();
		
		list1.add("Deepak From list 1");
		list1.add("Shweta From list 1");
		list1.add("Mithun From list 1");
		list2.add("Deepak From list 2");
		list2.add("Shweta From list 2");
		list3.add("Mithun From list 3");
		list3.add("Deepak From list 3");
		
		
		list.add(list1);
		list.add(list2);
		list.add(list3);

		for(int i=0;i<list.size();i++)
		{ 
			for(int j=0;j<list.get(i).size();j++)
			{
				System.out.println(list.get(i).get(j));
			}
		}
	
	}

}
