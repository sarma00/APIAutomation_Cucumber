package com.trivago.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetAPIProperties {
	FileInputStream fis; 
	Properties prop;
	
	public void setUpFile(){
		try{
			fis = new FileInputStream("resources/config/application.properties");
			prop = new Properties();
			prop.load(fis);
		} catch(FileNotFoundException fnfE){
			System.err.println("Sorry!! Config file not found.." + fnfE);
		} catch (IOException ie) {
			System.out.println("Error reading config file.." + ie);
		}
		
	}
	
	public String getURLforCase1(){
		String endUrl = "";
		setUpFile();
		endUrl=prop.getProperty("appURL")+prop.getProperty("case1_path");
		return endUrl;
	}
	
	public String getTempUrlforCase2(){
		String tmpUrl2="";
		setUpFile();
		tmpUrl2=prop.getProperty("appURL")+prop.getProperty("case2_path");
		return tmpUrl2;
	}
	
	public String getURLforCase3(){
		String endUrl = "";
		setUpFile();
		endUrl = prop.getProperty("appURL")+prop.getProperty("case3_path");
		return endUrl;
	}
	
	public String getURLforCase4(){
		String endUrl="";
		setUpFile();
		endUrl = prop.getProperty("appURL")+prop.getProperty("case4_path");
		return endUrl;
	}
}
