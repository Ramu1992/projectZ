package projectz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test
	public void SampleTest() throws Throwable
	{
		System.out.println("Helloooooooooo");
		FileInputStream	fs= new FileInputStream(System.getProperty("user.dir")+"\\src/main/java/config.properties");
		Properties pro =new Properties();
		pro.load(fs);
		System.out.println(pro.getProperty("url"));
	}

}
