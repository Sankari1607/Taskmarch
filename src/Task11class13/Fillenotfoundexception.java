package Task11class13;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Fillenotfoundexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrintWriter pw;
		try {
			pw = new PrintWriter("jtp.txt");  //may throw exception
			pw.println("saved");
			}
		//providing the checked exception handler
		
		catch(FileNotFoundException e) {
			System.out.println(e);
			
		}
		System.out.println("File Saved Successfully");
		
	}

}
