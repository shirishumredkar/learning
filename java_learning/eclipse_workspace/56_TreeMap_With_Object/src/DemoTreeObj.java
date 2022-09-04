import java.util.Map.Entry;
import java.util.TreeMap;
class Learn implements Comparable<Learn>
{
	private String section;
	private String lecture;

	public Learn(String section, String lecture) {
		this.section = section;
		this.lecture = lecture;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getLecture() {
		return lecture;
	}

	public void setLecture(String lecture) {
		this.lecture = lecture;
	}

	@Override
	public String toString() {
		return "Learn [section=" + section + ", lecture=" + lecture + "]";
	}

	@Override
	public int compareTo(Learn o) {
		
		return section.concat(lecture).compareTo(o.section.concat(o.lecture));
		}

	
	
}


public class DemoTreeObj {

	
	public static void main(String[] args) {
		
		TreeMap<Learn,String> hs = new TreeMap<>();
		hs.put(new Learn("S01","L03"),"Generics");
		hs.put(new Learn("S01","L01"),"Files Under Java");
		hs.put(new Learn("S02","L03"),"Network Programming");
		hs.put(new Learn("S01","L07"),"OOPS");
		hs.put(new Learn("S01","L05"),"Methods");
		hs.put(new Learn("S01","L03"),"Expressions");
		
		for(Entry<Learn,String> iter : hs.entrySet() )
		{
			System.out.println("Key : "+iter.getKey()+" Value : "+iter.getValue());
		}
		

	}

}
