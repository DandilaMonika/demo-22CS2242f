package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class openurl {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.edgedriver().setup();
        System.out.println("Welcome to test world to open url");
        driver=new EdgeDriver();
        driver.get("https://www.kluniversity.in");
        driver.quit();
    }

}