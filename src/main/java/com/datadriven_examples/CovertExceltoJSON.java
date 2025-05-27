package com.datadriven_examples;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CovertExceltoJSON {

    public static List<Employee> readDataFromExecel(String filePath, String sheetName){

        List<Employee> employees = new ArrayList<>();

        try(Workbook workbook = new XSSFWorkbook(new File(filePath))) {
            Sheet sheet =workbook.getSheet(sheetName);

            for (int i =1 ; i<=sheet.getLastRowNum(); i++){
                Row row = sheet.getRow(i);
                String name = row.getCell(0).getStringCellValue();
                int age = (int) row.getCell(1).getNumericCellValue();
                employees.add(new Employee(name, age));
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return employees;
    }

    public  static  void writeToJson(List<Employee> employees, String jsonPath){
        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.writeValue(new File(jsonPath), employees);
            System.out.println("Json file has been written");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        String excelPath = "exmples.xlsx";
        String sheetName = "Employee_Data";
        List<Employee> employees = readDataFromExecel(excelPath, sheetName);
        writeToJson(employees, "employee.json");
    }
}
