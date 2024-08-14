package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Project1 {
    public static void main(String[] args) throws IOException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        //static locators:id
       /* driver.get("https://www.github.com/login");
        driver.findElement(By.id("login_field")).sendKeys("monika");
        highlight(driver,driver.findElement(By.id("login_field")));

        driver.findElement(By.id("password")).sendKeys("1234");
        highlight(driver,driver.findElement(By.id("password")));

        TakesScreenshot ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("./Screenshot/Image1.png"));*/

        driver.get("https://www.github.com/login");
        driver.findElement(By.id("login_field")).sendKeys("sabithakiran.ch");
        highlight(driver,driver.findElement(By.id("login_field")));

        driver.findElement(By.id("password")).sendKeys("1234");
        highlight(driver,driver.findElement(By.id("password")));

        TakesScreenshot ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file,new File("./Screenshot/Image1.png"));


    }

    public static void highlight(WebDriver driver, WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
    }
}