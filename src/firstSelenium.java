import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.*;

@SuppressWarnings("deprecation")
public class firstSelenium {
	public static void main(String[] args) throws InterruptedException{
			  System.setProperty("webdriver.firefox.bin","D:\\selenium\\selenium\\Mozilla Firefox\\firefox.exe");
			  WebDriver driver=new FirefoxDriver(); 
			 String TestUrl="http://www.baidu.com";
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get(TestUrl);
				driver.findElement(By.id("kw")).sendKeys("张韶涵");
				driver.findElement(By.xpath(".//*[@id='su']")).click();
				driver.findElement(By.xpath(".//*[@id='1']/h3/a/em")).click();
				Thread.sleep(5000);
				String title=driver.getTitle();
				System.out.println(title);
				assertTrue("title不正确",title.equals("张韶涵（华语流行乐女歌手、影视演员）_百度百科"));
				
				}
			
}
