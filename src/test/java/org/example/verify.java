package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class verify {
    @Test
    void test2(){
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        System.out.println("Welcome to test world to open url");
        driver=new ChromeDriver();
        driver.get("https://www.kluniversity.in");
        driver.quit();
    }
}
