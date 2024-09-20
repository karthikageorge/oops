package excel_package;

import java.io.FileInputStream;//is a class used to read data from a file
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read {
	static FileInputStream f;//globally declared a class FileInputStream and f is a object
	static XSSFWorkbook w;//to work with excel we use  a class XSSFWorkbook to read, write,cal
	static  XSSFSheet sh;//to work with excel sheet we use class XSSFSheet repersenting a single sheet within an excel sheet
public static String getStringData(int a,int b) throws IOException {
	f= new FileInputStream("C:\\Users\\mathew\\Documents\\Excelread.xlsx");
	w= new XSSFWorkbook(f);//open work book
	sh= w.getSheet("Sheet1");//open sheet open
	Row r=sh.getRow(a);//row is a interface,sheet(row)
	Cell c=r.getCell(b);//cell is interface
	return c.getStringCellValue();
}
public static String getIntegerData(int a,int b) throws IOException {
	f= new FileInputStream("C:\\Users\\mathew\\Documents\\Excelread.xlsx");
	w= new XSSFWorkbook(f);//open work book
	sh= w.getSheet("Sheet1");//open sheet open
	Row r=sh.getRow(a);//row is a interface,sheet(row)
	Cell c=r.getCell(b);//cell is interface
	int x= (int)c.getNumericCellValue();//type casting converting c into numeric and store to x
	return String.valueOf(x);//to read the value x as string
}
}
