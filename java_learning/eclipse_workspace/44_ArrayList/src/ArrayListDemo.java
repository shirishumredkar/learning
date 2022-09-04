import java.util.*;

public class ArrayListDemo {

	static ArrayList<String> ary = new ArrayList<>();
	
	public void addElement(String name)
	{
		ary.add(name);
	}
	
	public void removeElementbyIndex(int pos)
	{
		ary.remove(pos);
	}
	
	public void removeElementbyName(String name)
	{
		ary.remove(name);
	}
	
	public void updateElement(String prename,String name)
	{
		if (ary.indexOf(prename) != -1)
			{ 
			        int preind = ary.indexOf(prename);
					ary.set(preind, name);
					System.out.println("Name is updated to "+name+" for index position "+preind);
			}
		else
		{
			System.out.println(" Index "+ary.indexOf(prename)+ "Not Found");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		ArrayListDemo ad = new ArrayListDemo();
		ad.addElement("Shirish");
		ad.addElement("Rashu");
		ad.addElement("Rahul");
		ad.addElement("Pooja");
		System.out.println("*********************************");
		System.out.println(ad.ary.get(0));
		System.out.println("*********************************");
		System.out.println(ad.ary);
		System.out.println("*********************************");
		ad.removeElementbyIndex(0);
		System.out.println(ad.ary);
		System.out.println("*********************************");
		ad.removeElementbyName("Pooja");
		System.out.println(ad.ary);
		System.out.println("*********************************");
		ad.updateElement("Rahul", "Rahul Sharma");
		System.out.println(ad.ary);
		
	}

}
