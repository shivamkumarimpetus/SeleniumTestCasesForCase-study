package signupofcasestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class SignUp_Test {
	
	
	public static void main(String[] args) {
		// WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\shivam.kumar\\Desktop\\ChromeDriver\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://localhost:4200/signup");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/app-root/app-signup/section/div/div/div/div/div/div/div[1]/form/div[1]/div/input")).sendKeys("kumarineelam612212@gmail.com");
		driver.findElement(By.xpath("/html/body/app-root/app-signup/section/div/div/div/div/div/div/div[1]/form/div[2]/div/input")).sendKeys("1234567812");
		driver.findElement(By.xpath("/html/body/app-root/app-signup/section/div/div/div/div/div/div/div[1]/form/div[4]/input")).click();
		driver.findElement(By.xpath("/html/body/app-root/app-signup/section/div/div/div/div/div/div/div[1]/form/div[5]/button")).click();
		driver.findElement(By.id("/html/body/app-root/app-signup/section/div/div/div/div/div/div/div[1]/form/div[5]/button")).click();
		}
}
