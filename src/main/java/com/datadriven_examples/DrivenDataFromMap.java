package com.datadriven_examples;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;
import java.util.stream.Collectors;

public class DrivenDataFromMap {

    public static void writeDataIntoExcelFromMap(List<Map.Entry<String, Integer>> entries, String fileName){

        try(Workbook workbook = new XSSFWorkbook();
            FileOutputStream fileOut = new FileOutputStream(fileName)) {

            Sheet sheet = workbook.createSheet("Employee_Data");

            Row row = sheet.createRow(0);
            row.createCell(0).setCellValue("Names");
            row.createCell(1).setCellValue("Age");

            int rowNum = 1;

            for(Map.Entry<String, Integer> entry :entries){
                row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(entry.getKey());
                row.createCell(1).setCellValue(entry.getValue());
            }

            workbook.write(fileOut);
            System.out.println("Excel file written successfully!");
        }
        catch (Exception e){
            e.getMessage();
        }
    }

    public static void readDataFromExcel(String fileName){

        try(FileInputStream fis = new FileInputStream(fileName);
        Workbook workbook = new XSSFWorkbook(fis)){

            Sheet sheet = workbook.getSheet("Employee_Data");

            for (int i =0 ; i<=sheet.getLastRowNum(); i++){
                Row row = sheet.getRow(i);
                System.out.println(row.getCell(0)+" || "+row.getCell(1));
            }
            workbook.close();
            fis.close();
        }catch (Exception e){
            e.getMessage();
        }
    }
    public static void main(String[] args) {
        Map<String, Integer> emp_data = new TreeMap<>();
        emp_data.put("Emily Carter", 28);
        emp_data.put("Liam Martinez", 34);
        emp_data.put("Sophia Nguyen", 24);
        emp_data.put("Ethan Walker", 45);
        emp_data.put("Olivia Kim", 31);
        emp_data.put("Noah Patel", 29);
        emp_data.put("Ava Thompson", 38);
        emp_data.put("Lucas Rivera", 42);
        emp_data.put("Isabella Grant", 27);
        emp_data.put("Mason Lee", 50);


        List<Map.Entry<String, Integer>> input = emp_data.entrySet()
                        .stream()
                                .sorted(Map.Entry.comparingByValue())
                                        .collect(Collectors.toList());

        writeDataIntoExcelFromMap(input, "exmples.xlsx");
        readDataFromExcel("exmples.xlsx");

    }
}
