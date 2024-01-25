package task13_class16;

import java.nio.file.Files;
import java.nio.file.Path;
import java.rmi.AccessException;
import org.apache.poi.hssf.usermodel.HSSWorkbook;
import org.apache.poi.ss.usermodel.workbook;


public class Excel_ApachePOI {

	public static void main(String[] args) throws AccessException {
		// TODO Auto-generated method stub
		
		Path path = Path.of("sheet.xlsx");
		Files.createFile(path);
		Files.writeString(path, "");
		
		
	}

}
