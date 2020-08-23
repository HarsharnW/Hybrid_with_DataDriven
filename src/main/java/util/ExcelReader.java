package util;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {

    public static String read(String filePath,int rowNumber,int columnNumber) {
        XSSFWorkbook workbook;
        XSSFSheet sheet;
        XSSFCell cell;
        String data = null;

        File file = new File(filePath);         //Give the file path
        try {
            FileInputStream fileInputStream = new FileInputStream(file);        //FileInputStream will read the content from file & put it to memory
            workbook = new XSSFWorkbook(fileInputStream);               // assign the data of memory var fileINputStream to workbook

            sheet = workbook.getSheetAt(0);                           // way 2

            cell = sheet.getRow(rowNumber).getCell(columnNumber);
            data = cell.toString();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
