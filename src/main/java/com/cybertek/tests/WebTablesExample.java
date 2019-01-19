package com.cybertek.tests;

import com.cybertek.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WebTablesExample  extends TestBase {

    /*
     *
     */


    @Test
    public void printWholeTable() {
        login();
        WebElement table = driver.findElement(By.id("ctl00_MainContent_orderGrid"));
        System.out.println(table.getText());

    }

    public void login() {
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");

        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));

        username.sendKeys("Tester");

        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));

        password.sendKeys("test" + Keys.ENTER);


    }

    @Test
    public void printAllHeaders() {
        login();
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//th"));

        for (WebElement header : headers) {
            System.out.println(header.getText());
        }
    }
    /*
     *
     *
     */


    @Test
    public void printRow() {
        login();
        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));


        System.out.println("number of rows: " + allRows.size());

        for (WebElement header : allRows) {
            System.out.println(header.getText());
        }

        //print the nth

        System.out.println("printing row " + 3);
        System.out.println(allRows.get(2).getText());
    }

    @Test
    public void printTableSize() {
        login();

        List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));

        System.out.println("number of rows: " + allRows.size());

        List<WebElement> allHeaders = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[1]/th"));
        System.out.println("number of cols: " + allHeaders.size());

    }

    /*
     *
     * print
     *
     * */

    @Test
    public void printRow2() {
        login();
        WebElement row = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[9]"));
        System.out.println(row.getText());

    }

    @Test
    public void printAllCellsInOneRow() {
        login();
        List<WebElement> cells = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]/td"));
        for (WebElement header : cells) {
            System.out.println(header.getText());
        }
    }

    @Test
    public void printByCoordinates(){
        login();
        WebElement cell = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[6]/td[11]"));
        System.out.println(cell.getText());

        System.out.println(getCell(6, 11).getText());
    }

    public WebElement getCell(int row, int col) {
        String xpath = "//table[@id='ctl00_MainContent_orderGrid']/tbody/tr["+row+"]/td["+col+"]";
     return driver.findElement(By.xpath(xpath));
    }


    @Test
    public void printColumn(){

        login();
        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[7]"));

        for (WebElement header:allNames) {
            System.out.println(header.getText());

        }

    }

    /*
    find the select checkbox for a given name
     */

    @Test
    public void selectCheckbox(){
        login();
        WebElement checkbox = driver.findElement(By.xpath("//td[.='Steve Johns']/../td[1]/input"));
        System.out.println(checkbox.isSelected());
        checkbox.click();
        System.out.println(checkbox.isSelected());


    }

    /*
    verify that name 'someone' exists in the names column
    verify that city 'anytown' exists in the cities column
     */

    @Test
    public void test() {
        login();
        int nameIndex = getClumnIndex("Name");
        System.out.println(nameIndex);

        boolean found = false;

        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[" + nameIndex + "]"));
        for (int i = 0; i < allNames.size(); i++) {
            if (allNames.get(i).getText().equals("Mark Smith")) {
                found = true;
                break;

            }
        }
        Assert.assertTrue(found);


        int cityIndex = getClumnIndex("City");
        List<WebElement> allCities = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td["+cityIndex+"]"));
        for (int i = 0; i < allCities.size(); i++){
            if(allCities.get(i).getText().equals("Whitestone, British")) {
                found = true;
                break;
            }
            }
        Assert.assertTrue(found);

    }

    public int getClumnIndex(String column){
        List<WebElement> allHeader = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[1]/th"));

        for (int i = 0; i < allHeader.size(); i++){
            if(allHeader.get(i).getText().equals(column)){
                return i+1;
            }
        }
        return 0;
    }


}






