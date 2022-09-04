import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class FileOper
{
	public void writeFile()
	{
		File file = new File("dummy.txt");
		try(BufferedWriter bf = new BufferedWriter(new FileWriter(file,false)))
		{
			bf.write("Shirish");
			bf.newLine();
			bf.write("Rashmi");
			bf.newLine();
			bf.write("Aaditya");
			bf.close();
		} catch (IOException e) {
				e.printStackTrace();
		}
	}
	
	public void readBufferFile()
	{
		File file = new File("dummy.txt");
		
			try(BufferedReader br = new BufferedReader(new FileReader(file))) {
				
				String line;
				while((line = br.readLine()) != null)
				{
				 System.out.println(line);
				}
			   } catch (IOException e) {
	 				e.printStackTrace();
		   	}
	
	}
	
	public void readScannerFile()
	{
		File file = new File("dummy.txt");
		
		try(Scanner sc = new Scanner(new FileReader(file))) {
			while(sc.hasNext())
			{
				System.out.println(sc.next());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


public class DemoFileOperations {

	public static void main(String[] args) {
		
		FileOper fo = new FileOper();
		fo.writeFile();
		System.out.println("********************************************************");
		fo.readBufferFile();
		System.out.println("********************************************************");
		fo.readScannerFile();

	}

}
