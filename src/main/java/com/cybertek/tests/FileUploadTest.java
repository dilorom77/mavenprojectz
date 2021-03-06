package com.cybertek.tests;

import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTest extends TestBase {

    @Test
    public void test(){
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement chooseFile = driver.findElement(By.id("file-upload"));

       String path = "/Users/dilorommulladjonova/Downloads/a.xlsx";

       chooseFile.sendKeys(path);

       driver.findElement(By.id("file-submit")).click();

        Assert.assertTrue(

       driver.findElement(By.xpath("//*[.='File Uploaded!']")).isDisplayed());

    }
}
