package com.utils;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
    public static FileInputStream fileInput;
    public static XSSFWorkbook workbook;
    public static XSSFSheet sheet;
    public static XSSFRow row;
    public static XSSFCell cell;

    public static int getRowCount(String excelPath, String sheetName) throws IOException {
        fileInput = new FileInputStream(excelPath);
        workbook = new XSSFWorkbook(fileInput);
        sheet = workbook.getSheet(sheetName);
        int rowCount = sheet.getLastRowNum();
        workbook.close();
        fileInput.close();
        return rowCount;
    }

    public static int getCellCount(String excelPath, String sheetName, int rowNum) throws IOException {
        fileInput = new FileInputStream(excelPath);
        workbook = new XSSFWorkbook(fileInput);
        sheet = workbook.getSheet(sheetName);
        row = sheet.getRow(rowNum);
        int cellCount = row.getLastCellNum();
        workbook.close();
        fileInput.close();
        return cellCount;
    }

    public static String getCellData(String excelPath, String sheetName, int rowNum, int colNum) throws IOException {
        fileInput = new FileInputStream(excelPath);
        workbook = new XSSFWorkbook(fileInput);
        sheet = workbook.getSheet(sheetName);
        row = sheet.getRow(rowNum);
        cell = row.getCell(colNum);
        DataFormatter formatter = new DataFormatter();
        String data = formatter.formatCellValue(cell);
        workbook.close();
        fileInput.close();
        return data;
    }
}