package ArrayListCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListSynchronisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nameList=Collections.synchronizedList(new ArrayList<String>());
		nameList.add("java");
		nameList.add("python");
		nameList.add("Ruby");
		
		//to traverse the lit we need explicit keyword synchronized
		synchronized (nameList) {
			
			Iterator<String> itr=nameList.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}
		
		System.out.println("===========================CopyOnWriteArrayList============================");
		
		CopyOnWriteArrayList<String> emplist=new CopyOnWriteArrayList<String>();
		emplist.add("deepak");
		emplist.add("sweta");
		emplist.add("yadav");
		System.out.println(emplist);
 
	}

}
