import java.util.*;


class Named implements Comparable<Named>
{
	private  String name;
	public Named(String nme)
	{
		this.name = nme;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public int compareTo(Named obj) {
        if (name.length() == obj.name.length())
        {
        	return 0;
        }
        else if (name.length() >= obj.name.length())
        {
        	return 0;
        }
        else
        {
		return -1;
        }
		
	}
	
}

public class DemoComp {

	
	public static void main(String[] args) {
		
		List<Named> arg = new LinkedList<>();
		arg.add(new Named("Zimbabwe"));
		arg.add(new Named("Pakistan"));
		arg.add(new Named("India"));
		arg.add(new Named("Bangladesh"));
		
		DemoComp cmp = new DemoComp();
		Collections.sort(arg);
		cmp.toDisp(arg);
		
		
		
	}
	
	public void toDisp(List<Named> lst)
	{
		Iterator<Named> it = lst.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().toString());
		}
				
	}

	
	
}
