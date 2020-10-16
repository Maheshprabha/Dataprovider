package com.testjson;

import org.testng.annotations.Test;

import com.atmecs.utils.JsonFile;


public class TestJsonFile {
	public static JsonFile jsonFile = new JsonFile();
	
	@SuppressWarnings("static-access")
	@Test
    public void writeJson() throws Exception
	//public static void main(String[] args) throws Exception
	{
		
		jsonFile.create("./src/test/resources/testdata/employee.json");
		//jsonFile.read("./src/main/resources/testdata/employee.json");
		
	}
}

	//public static void main(String[] args) {
		///Json/src/test/resources/testdata/employee.json
	



