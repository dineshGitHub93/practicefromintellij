package com.datadriven_examples;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CovertJSONtoMySQL {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/education";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "tccs";

    public static List<Employee> convertIntoObject(String jsonPath) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        List<Employee> employees =  mapper.readValue(new File(jsonPath), new TypeReference<List<Employee>>() {});
        return  employees;
    }
    public static void updateIntoDB(Employee employee) throws Exception {

    String insertData = "Insert into employees (name, age) values (?,?)";
        Class.forName("com.mysql.jdbc.Driver");
        try(Connection con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            PreparedStatement pstmt = con.prepareStatement(insertData, Statement.RETURN_GENERATED_KEYS)) {

            // Set parameters from the Employee object
            pstmt.setString(1, employee.getName());
            pstmt.setInt(2, employee.getAge());

            // Execute the insert
            int affectedRows = pstmt.executeUpdate();

            System.out.println("Employee inserted: " + employee);

        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static void main(String[] args) throws IOException {


        System.out.println(convertIntoObject("employee.json"));
        convertIntoObject("employee.json").forEach(employee -> {
            try {
                updateIntoDB(employee);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
    }
}
