import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class ListDemo {

	public static void main(String[] args) {
		System.out.println("*******************************************");
		// Array 
		int[] ary = { 10,20,30,40 }	;	
		for ( int arylist : ary)
		{
			System.out.println(arylist);
		}
		
		System.out.println("*******************************************");
		//ArrayList
		ArrayList<String> arylist = new ArrayList<>();
		arylist.add("Shirish");
		arylist.add("Rashu");
		arylist.add("Rahul");
		Iterator<String> iter = arylist.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		System.out.println("*******************************************");
		//LinkedList
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Shirish");
		ll.add("Rashu");
		ll.add("Rahul");
		Iterator<String> iterll = ll.iterator();
		while(iterll.hasNext())
		{
			System.out.println(iterll.next());
		}
		
		System.out.println("*******************************************");
		//Only List ArrayList
		List<String> all = new LinkedList<>();
		all.add("Shirish");
		all.add("Rashu");
		all.add("Rahul");
		Iterator<String> iterall = all.iterator();
		while(iterall.hasNext())
		{
			System.out.println(iterall.next());
		}
		
		System.out.println("*******************************************");
		//Only List LinkedList
		List<String> lll = new LinkedList<>();
		lll.add("Shirish");
		lll.add("Rashu");
		lll.add("Rahul");
		Iterator<String> iterlll = lll.iterator();
		while(iterlll.hasNext())
		{
			System.out.println(iterlll.next());
		}
		
	}

}
