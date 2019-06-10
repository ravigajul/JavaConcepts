import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String strDataPath;
		strDataPath=System.getProperty("user.dir")+"/src/Data/TestData.properties";
	
		//Write Data to Properties file
		OutputStream output;
		try {
			output = new FileOutputStream(strDataPath);
			Properties prop = new Properties();
			prop.setProperty("FirstName", "Ravi");
			prop.setProperty("MiddleName", "Kumar");
			prop.setProperty("LastName", "Gajul");
			
			prop.store(output, "test");
			System.out.println(prop);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Reading from the properties file
		strDataPath=System.getProperty("user.dir")+"/src/Data/TestData.properties";
		InputStream input;
		try{
			input = new FileInputStream(strDataPath);
			Properties inputprop = new Properties();
			inputprop.load(input);
			System.out.println(inputprop.getProperty("FirstName"));
			System.out.println(inputprop.getProperty("LastName"));
		
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
	
		
		
		
	}

}
