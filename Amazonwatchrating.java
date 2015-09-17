package QAquestion;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver; 
import org.openqa.selenium.support.ui.ExpectedCondition; 
import org.openqa.selenium.support.ui.Wait; 
import org.openqa.selenium.support.ui.WebDriverWait; 

public class Amazonwatchrating 
{
	public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        String Url = "http://www.amazon.com";
        
        driver.get(Url);
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Apple watch Sports 42mm space Gray Aluminium case with Black Sports band");
        driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input")).click();
        driver.findElement(By.xpath("//*[@id='refinements']/div[2]/ul[1]/li[4]/ul/li/a/span")).click();
        driver.findElement(By.xpath("//*[@id='result_0']/div/div[2]/div[1]/a/h2")).click();
        String rating = driver.findElement(By.xpath("//*[@id='acrPopover']/span[1]/a/i[2]")).toString();
        System.out.println(rating);
        driver.close();
        
        System.exit(0);
    }
 
}

	

