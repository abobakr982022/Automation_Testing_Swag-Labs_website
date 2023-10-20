package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Dimension dimension = new Dimension(414,896);
        //driver.get("https://qacart.com/start");
        driver.navigate().to("D:\\softwarePk\\JAVA\\Selenium\\QACartSeleniumcourse\\src\\test\\resources\\index.html");
        //driver.manage().window().setSize(dimension);
        driver.navigate().refresh();
        Thread.sleep(2000);
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println("url & titles "+url + title);
        driver.quit();
    }
}
