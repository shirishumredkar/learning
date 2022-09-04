
public class PublicEnum {
	
	public static void main (String args[])
	{
	EnumPub ep = EnumPub.FIRST;
		switch(ep) {
		case FIRST:
			System.out.println("Enum Value FIRST Matched");
			break;
		case SECOND:
			System.out.println("Enum Value SECOND Matched");
			break;
		/*case NINTH:
			System.out.println("Enum Value SECOND Matched");
			break;	*/
		default:
			System.out.println("Enum Value DEFAULR Matched");
			break;
		}
	}
}

