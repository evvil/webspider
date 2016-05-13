package view;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Created by Evilina on 2016/5/4.
 */
public class SeleniumTest {

    private static final Logger logger = LoggerFactory.getLogger(SeleniumTest.class);

    public void startFirefox() {

        logger.info("firefox start");
        System.setProperty("webdriver.firefox.bin",
                "D:\\Program Files\\MyFirefox_v2.6.6_x64\\firefox\\firefox.exe");
        WebDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("http://www.baidu.com");
        WebElement webElement = firefoxDriver.findElement(By.xpath("//*[@id=\"su\"]"));
        logger.info(webElement.getAttribute("value"));
    }
}
