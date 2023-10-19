package orangehrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Orange {
	@Test
	public void LoadPage() throws InterruptedException {
	
		System.setProperty("webdriver.gecko.driver","C:\\Users\\justin\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(3000);
	    driver.manage().window().maximize();
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();
	new WebDriverWait(driver,50).until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText("Add Employee")))).click();
	    driver.findElement(By.name("firstName")).sendKeys("jesmin");
	    driver.findElement(By.name("lastName")).sendKeys("thereza");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
	}

}
