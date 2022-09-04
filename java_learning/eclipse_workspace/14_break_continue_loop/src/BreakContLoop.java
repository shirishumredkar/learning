
public class BreakContLoop {

	public static void main(String[] args) {
		int i=0;
		while(i<10)
		{
			if (i == 5)
			{
			System.out.println("Value of i is "+i);
			break;
			}
			i++;
		}
		
		i=0;
		while(i<10)
		{
			i++; 
			if (i == 5)
			{
			continue;
			}
			System.out.println("Value of i is "+i);
			
		}

	}

}
