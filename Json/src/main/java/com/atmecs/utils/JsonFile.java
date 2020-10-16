package com.atmecs.utils;

import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonFile {

	@SuppressWarnings("unchecked")
	public static void create(String filename) throws Exception {

		JSONObject sampleObject = new JSONObject();
		String s = "";
		Scanner sc = new Scanner(System.in);
		int id, salary;
		String name, address, designation;
		do {
			System.out.println("Enter the employee Id :");
			id = sc.nextInt();
			sampleObject.put("empId", id);
			System.out.println("Enter the employee Name :");
			name = sc.next();
			sampleObject.put("empName", name);
			System.out.println("Enter the employee Address :");
			address = sc.next();
			sampleObject.put("empAddress", address);
			System.out.println("Enter the employee Designation :");
			designation = sc.next();
			sampleObject.put("empDestination", designation);
			System.out.println("Enter the employee Salary :");
			salary = sc.nextInt();
			sampleObject.put("empSalary", salary);
			JSONArray employeeList = new JSONArray();
			employeeList.add(sampleObject);

			System.out.println("continue(y/n)");
			s = sc.next();

			Files.write(Paths.get(filename), sampleObject.toJSONString().getBytes());
		} while (s.equals("y"));
		sc.close();

	}

	public static void read(String fileName)
	{
		JSONParser parser = new JSONParser(); 
		try 
		{ 
			System.out.println("Reading JSON file from Java program"); 
			FileReader fileReader = new FileReader(fileName); 
			JSONObject json = (JSONObject) parser.parse(fileReader); 
			String id = (String) json.get("empId"); 
			String des = (String) json.get("empDestination"); 
			System.out.println("employeeId: " + id); 
			System.out.println("empDes: " + des); 
//			System.out.println("price: " + price);
//			JSONArray characters = (JSONArray) json.get("characters"); 
//			Iterator i = characters.iterator(); 
//			System.out.println("characters: "); 
//			while (i.hasNext()) 
//			{ 
//				System.out.println(" " + i.next()); 
//				} 
		} 
		catch (Exception ex)
		{
			ex.printStackTrace(); 
			}
		}

		
}
