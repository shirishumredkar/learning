import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class VehicleDemo  {

	public static void main(String[] args) {
		
		Vehicle car = new Vehicle("Car",4589);
		Vehicle truck = new Vehicle("Truck",8546);
		
		
		try {
			FileOutputStream ofp = new FileOutputStream("output.dat");
			try(ObjectOutputStream oos = new ObjectOutputStream(ofp))
		     {
		    	 oos.writeObject(car);
		    	 oos.writeObject(truck);
		    	 System.out.println("Object Written onto the file");
		     } 
		 
			System.out.println("*************************************************************");
			System.out.println("Starting Reading the file");
			
			FileInputStream fis = new FileInputStream("output.dat");
			try(ObjectInputStream ois = new ObjectInputStream(fis))
			{
				Vehicle v1 = (Vehicle) ois.readObject();
				Vehicle v2 = (Vehicle) ois.readObject();
				System.out.println(v1);
				System.out.println(v2);
				
				System.out.println("Reading the file Completed");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		

	}

}
