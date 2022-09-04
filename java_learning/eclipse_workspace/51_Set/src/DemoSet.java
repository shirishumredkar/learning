import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoSet {

	public static void main(String[] args) {
		
		Set<String> st = new HashSet<>();
		st.add("Shirish");
		st.add("Rashmi");
		st.add("Rahul");
		st.add("Shirish");
		
		Set<String> stl = new LinkedHashSet<>();
		stl.add("Shirish");
		stl.add("Rashmi");
		stl.add("Rahul");
		stl.add("Shirish");
		
		Set<String> stt = new TreeSet<>();
		stt.add("Shirish");
		stt.add("Rashmi");
		stt.add("Rahul");
		stt.add("Shirish");
		
		System.out.println("**************************************************");
		Iterator<String> iter = st.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		System.out.println("**************************************************");
		Iterator<String> iterlinked = stl.iterator();
		while(iterlinked.hasNext())
		{
			System.out.println(iterlinked.next());
		}
		
		System.out.println("**************************************************");
		Iterator<String> itertree = stt.iterator();
		while(itertree.hasNext())
		{
			System.out.println(itertree.next());
		}


	}

}
