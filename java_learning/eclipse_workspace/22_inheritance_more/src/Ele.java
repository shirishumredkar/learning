public class Ele extends Fish{

	protected String releasecurrents ;

	public Ele(float height, float weight, java.lang.String animaltype, java.lang.String bloodtype, char liveinwater,
			boolean hasgill) {
		super(height, weight, animaltype, bloodtype, liveinwater, hasgill);
		releasecurrents = "releasecurrent";
	}

	public void showInfo() {
		System.out.println( "Ele [releasecurrents=" + releasecurrents + ", liveinwater=" + liveinwater + ", hasgill=" + hasgill
				+ ", height=" + height + ", weight=" + weight + ", animaltype=" + animaltype + ", bloodtype="
				+ bloodtype + "]");
	} ;
	
	
	
	
	
	
}
