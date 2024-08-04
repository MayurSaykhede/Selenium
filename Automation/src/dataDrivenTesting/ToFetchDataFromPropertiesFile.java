package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToFetchDataFromPropertiesFile {
	public static void main(String[] args) throws IOException {
		File f = new File(".\\test-data\\demoWebShop.properties"); // With the help of .(dot) we are using relative path 
		FileInputStream fis = new  FileInputStream(f);
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		System.out.println(url);
		System.out.println(prop.getProperty("email"));
		System.out.println(prop.getProperty("password"));
	}

}
