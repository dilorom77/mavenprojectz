package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WOPostiveLoginTests {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        String loginTitle = driver.getTitle();

        Assert.assertEquals(loginTitle, "Web Orders Login");


        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));

        username.sendKeys("Tester");

        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));

        password.sendKeys("test");

        WebElement loginBtn = driver.findElement(By.id("ctl00_MainContent_login_button"));

        loginBtn.click();

        String newTitle = driver.getTitle();


        Assert.assertEquals("Web Orders", newTitle);

        String expectedUrl = "http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/";
        String currenturl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, currenturl);






    }

}
