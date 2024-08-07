package vickyproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class FileProp {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\MJ\\eclipse-workspace\\list\\vickyproject\\src\\test\\resources\\File.properties");
		try {
		FileInputStream f1 = new FileInputStream(f);
		Properties prop = new Properties();
		prop.load(f1);
		String url = prop.getProperty("url");
		String user = prop.getProperty("username");
		String pass = prop.getProperty("password");
		String env = prop.getProperty("env");
		
		
		System.out.println(url);
		System.out.println(user);
		System.out.println(pass);
		System.out.println(env);
		
		FileOutputStream f2 = new FileOutputStream(f);
		prop.setProperty("env", "Qa");
		prop.setProperty("user", "Abirami");
		prop.setProperty("meeting", "timing");
		prop.save(f2, "ENVIRONMENT MODIFIED");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
