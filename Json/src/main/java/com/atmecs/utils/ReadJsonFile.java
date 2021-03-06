package com.atmecs.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJsonFile {
	@SuppressWarnings("unchecked")
	public static void readDataFile(){
    {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
         
        try (FileReader reader = new FileReader("./src/test/resources/testdata/readdata.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONArray employeeList = (JSONArray) obj;
            System.out.println(employeeList);
             
            //Iterate over employee array
            employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}    
	
	private static void parseEmployeeObject(JSONObject employee) 
    {
      //Get employee object within list
      JSONObject employeeObject = (JSONObject) employee.get("employee");
       
      //Get employee name
      String employeeName = (String) employeeObject.get("employeeName");    
      System.out.println(employeeName);
       
      //Get employee designation
      String employeeDesignation = (String) employeeObject.get("employeeDesignation");  
      System.out.println(employeeDesignation);
       
      //Get employee salary
      int employeeSalary = (int) employeeObject.get("employeeSalary");    
      System.out.println(employeeSalary);
  }

}
