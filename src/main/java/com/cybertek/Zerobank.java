package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zerobank {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" http://zero.webappsecurity.com/login.html");

        WebElement username = driver.findElement(By.id("user_login"));
        WebElement password = driver.findElement(By.id("user_password"));
        WebElement signinBtn = driver.findElement(By.name("submit"));
        username.sendKeys("username");
        password.sendKeys("password");
        signinBtn.click();

    }
}
