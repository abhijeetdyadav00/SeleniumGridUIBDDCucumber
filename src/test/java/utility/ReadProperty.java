package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//////user.dir->This builds the full path to your config.properties file, relative to your project root folder.


public class ReadProperty {

	public static String getPropData(String dataToBeRead) throws IOException {
		String path=System.getProperty("user.dir")+ "//src//test//resources//config.properties";
		FileInputStream fis=new FileInputStream(path);
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty(dataToBeRead);
//		System.out.println(browserValue);
		return value;
	}
	
	
	
	
	
	
		
	
	
	
//	public static void main(String[] args) throws IOException {
//		System.out.println(getPropData("browser"));
//		System.out.println(getPropData("testSiteUrl"));
//	}
	
	
	
	
	
	
}
