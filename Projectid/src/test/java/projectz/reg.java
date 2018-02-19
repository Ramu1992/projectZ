package projectz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class reg {
	WebDriver driver;

	public void regopen() throws Throwable {

		FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "\\src/main/java/config.properties");
		Properties pro = new Properties();
		pro.load(fs);
		pro.getProperty("url");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(pro.getProperty("url"));
	

	
		driver.findElement(By.xpath("//*[@id='login_form']/table/tbody/tr[7]/td/a")).click();
		driver.findElement(By.cssSelector("#username")).sendKeys("pradeep");
		driver.findElement(By.cssSelector("#password")).sendKeys("9959109918");
		driver.findElement(By.cssSelector("#re_password")).sendKeys("9959109918");
		driver.findElement(By.cssSelector("#full_name")).sendKeys("pradeep u");
		driver.findElement(By.cssSelector("#email_add")).sendKeys("pradeep.u9@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("#captcha-form")).click();
		driver.findElement(By.cssSelector("#tnc_box")).click();
		driver.findElement(By.cssSelector("#Reset")).click();
		
	}

	public static void main(String[] args) throws Throwable {

		reg r = new reg();
		r.regopen();
		//r.sineup();
		//r.regapp();

	}

}
