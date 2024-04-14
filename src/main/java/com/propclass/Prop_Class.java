package com.propclass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Prop_Class {
	
	
	public static void prop_Test() {
		
		try {
			
			FileReader read = new FileReader("/Users/mohamedmustafa/eclipse-workspace/MavenLearning/src/test/resources/TestData/config.properties");
			Properties prop = new Properties();
			prop.load(read);
			String user = prop.getProperty("username");
			System.out.println(user);
//			String pwd = prop.getProperty("password");
//			System.out.println(pwd);
//			String url = prop.getProperty("url");
//			System.out.println(url);
			
			
		} catch (FileNotFoundException e) {
              e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		prop_Test();
	
	}
	
	
	
	
	
	
	
	
	
	
	

}
