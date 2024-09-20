package excel_package;

import java.io.IOException;

public class Excel_Main {

	public static void main(String[] args) throws IOException {
		System.out.println(Excel_Read.getStringData(0, 1));//to get string in excel
		System.out.println(Excel_Read.getIntegerData(0, 0));//to get integer in excel

	}

}
