package com.cybertek;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TVshow {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("http://google.com");
        WebElement input = driver.findElement(By.name("q"));

        input.sendKeys("music download" + Keys.ENTER);


        WebElement mylink = driver.findElement(By.partialLinkText("Free Music Downloads"));


mylink.click();

    }
}
