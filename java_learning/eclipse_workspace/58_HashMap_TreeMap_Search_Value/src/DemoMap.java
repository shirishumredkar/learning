import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DemoMap {

	public static void main(String[] args) {
		
		Map<Integer,String> mp = new HashMap<>();
		mp.put(1, "Shirish");
		mp.put(2, "Rashmi");
		mp.put(3, "Aaditya");
		mp.put(4, "Rashmi");
		
		for(Entry<Integer, String> data : mp.entrySet())
		{
			if ("Rashmi".equals(data.getValue()))
			{
			System.out.println("Hash Map Key: "+ data.getKey()+" Hash Map Value: "+data.getValue());
	    	}
		}	
	
	}

}
