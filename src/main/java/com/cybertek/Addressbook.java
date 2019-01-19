package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addressbook {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement username = driver.findElement(By.id("session_email"));
        username.sendKeys("kexesobepu@zsero.com");

        WebElement password = driver.findElement(By.id("session_password"));
        password.sendKeys("password" + Keys.ENTER);

        WebElement currentUserName = driver.findElement(By.className("navbar-text"));

        if(currentUserName.getText().equals("kexesobepu@zsero.com")){
            System.out.println("Pass | The user name has displayed");
        }else{
            System.out.println("Fail | The user name has not displayed");
        }
         if(driver.getTitle().contains("sign in")){
             System.out.println("Failed ~~ title contains 'Sign in'");
         }else{
             System.out.println("Pass ~~ title does not contain 'Sign in'");
         }

         Thread.sleep(2000);

         driver.quit();





    }
}
