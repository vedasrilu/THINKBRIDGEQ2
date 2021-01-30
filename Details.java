
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Details {

    public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// open the given url using driver get method
		driver.get("http://jt-dev.azurewebsites.net/#/SignUp");
		
		driver.findElement(By.xpath("//*[@id='language']/input[1]"));
		
		// find the elements in webpage using id, xpath and send them values
		driver.findElement(By.id("name")).sendKeys("champ");
	    driver.findElement(By.id("orgName")).sendKeys("champwhj");
	    driver.findElement(By.id("singUpEmail")).sendKeys("vedasrilu.143@gmail.com");
	    
	    // find the elements using css selector
	    WebElement c= driver.findElement(By.cssSelector("span[class='black-color ng-binding']"));
	    c.click();
	  
	    WebElement submit= driver.findElement(By.cssSelector("div[class='form-group custom-form-group']"));
	    submit.click();
	  
	    // using get text method to capture the text message in webpage after successful submission of data
	    driver.findElement(By.cssSelector("span[class='ng-binding']")).getText();
	  
	    // user can see a message in the webpage which says " A welcome email has been sent. Please check your email".
	  // end
	}
}

