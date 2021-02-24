import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AutomationTesting {

	public static void main(String[] args) throws IOException {
		File loc = new File("E:\\Selenium Workspace\\MavenSample\\Excel\\AUTesting.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet sheet = w.getSheet("Datas");
		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();
				if(cellType==1) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				}if(cellType==0) {
					if(DateUtil.isCellDateFormatted(cell)) {
						
						String newDateFormat = new SimpleDateFormat("dd/MM/yy").format(cell.getDateCellValue());
						System.out.println(newDateFormat);						
					}
					else {					
						String ncv = String.valueOf((long) cell.getNumericCellValue());
						System.out.println(ncv);
				}
				}
			}
		}

		
		

	}

}
