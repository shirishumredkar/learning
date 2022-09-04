
public class AnimalDetails {

	public static void main(String[] args) {
		
		Crocodile crn = new Crocodile(10.3f,50.3f,"reptile","cold",true,true);
		crn.showInfo();
		Ele ele = new Ele(10.3f,50.3f,"fish","hot",'Y',true);
		ele.showInfo();
		Eagle ege = new Eagle(10.3f,50.3f,"bird","better",true,true);
		ege.showInfo();
		
	}

}
