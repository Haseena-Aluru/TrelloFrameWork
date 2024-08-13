package datadriventest;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Fbdata {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("./src/test/resource/fbdata.properties1");
		
		   Properties pobj =new Properties();
		   pobj.load(file);
		    String browsername =pobj.getProperty("browsername");
		    if(browsername.equals("Chrome"))
		    {
		    	driver=new ChromeDriver();
		    	
		    }
		    else if(browsername .equals("edge")) {
		    	driver=new EdgeDriver();
		    }
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		    driver.get(pobj.getProperty("url"));
		    driver.findElement(By.id("email")).sendKeys(pobj.getProperty("Email"));
		    driver.findElement(By.id("pass")).sendKeys(pobj.getProperty("password"));
		    driver.findElement(By.name("login")).submit();
		    driver.manage().window().minimize();
		    driver.quit();

		    
		
	}

}
