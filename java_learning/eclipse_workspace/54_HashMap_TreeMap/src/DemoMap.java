import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class DemoMap {

	public static void main(String[] args) {
		
		Map<Integer,String> mp = new HashMap<>();
		mp.put(1, "Shirish");
		mp.put(2, "Rashmi");
		mp.put(3, "Aaditya");
		
		// Using For Each Loop
		System.out.println("**********************************************************");
		for(Entry<Integer, String> data : mp.entrySet())
		{
			System.out.println("Hash Map Key: "+ data.getKey()+" Hash Map Value: "+data.getValue());
		}
		
		// Using For Each Loop Using only Key
		System.out.println("**********************************************************");
		for(Integer key:mp.keySet())
		{
			System.out.println("Hash Map Key: "+ key +" Hash Map Value "+mp.get(key));
		}
		
		// Using Iterator
		System.out.println("**********************************************************");
		Iterator<Entry<Integer,String>> iter = mp.entrySet().iterator();
		Entry<Integer, String> key = null;
		while(iter.hasNext())
		{
			key = iter.next();
			System.out.println("Hash Map Key: "+ key.getKey() +" Hash Map Value "+ key.getValue());
		}
		
		
		Map<Integer,String> mpt = new TreeMap<>();
		mpt.put(3, "Shirish");
		mpt.put(2, "Rashmi");
		mpt.put(1, "Aaditya");
		
		// Using For Each Loop
		System.out.println("**********************************************************");
		for(Entry<Integer, String> data : mpt.entrySet())
		{
			System.out.println("Tree Map Key: "+ data.getKey()+" Tree Map Value: "+data.getValue());
		}
		
		// Using For Each Loop Using only Key
		System.out.println("**********************************************************");
		for(Integer keyt:mpt.keySet())
		{
			System.out.println("Tree Map Key: "+ keyt +" Tree Map Value "+mp.get(keyt));
		}
		
		// Using Iterator
		System.out.println("**********************************************************");
		Iterator<Entry<Integer,String>> itert = mpt.entrySet().iterator();
		Entry<Integer, String> keyt = null;
		while(iter.hasNext())
		{
			keyt = itert.next();
			System.out.println("Tree Map Key: "+ keyt.getKey() +" Tree Map Value "+ keyt.getValue());
		}
		
	}

}
