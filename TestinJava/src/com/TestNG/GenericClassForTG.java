package com.TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GenericClassForTG {
	
	public  String getData(String data) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("E:\\TestingJava\\TestinJava\\TestData.property");
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(data);
	}
	
	
}
