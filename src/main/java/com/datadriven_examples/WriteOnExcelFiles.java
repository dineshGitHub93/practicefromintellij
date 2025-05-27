package com.datadriven_examples;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteOnExcelFiles {

    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet();

        XSSFRow row = sheet.createRow(0);
        row.createCell(0).setCellValue("Name");
        row.createCell(1).setCellValue("Age");

        row = sheet.createRow(1);
        row.createCell(0).setCellValue("Kunja");
        row.createCell(1).setCellValue(1);

        FileOutputStream fis = new FileOutputStream("examples.xlsx");
        workbook.write(fis);
        fis.close();
        workbook.close();

    }
}
