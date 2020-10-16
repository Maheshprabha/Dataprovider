package com.testjson;



import org.testng.annotations.Test;

import com.atmecs.utils.ReadJsonFile;

@SuppressWarnings({ "unused", "unused", "unused" })
public class ReadData extends ReadJsonFile{
	
	ReadJsonFile readdata = new ReadJsonFile();
	@Test
	public void readData() {
	ReadJsonFile.readDataFile();
}
}
	


