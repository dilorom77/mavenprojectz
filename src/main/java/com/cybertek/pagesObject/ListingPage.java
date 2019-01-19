package com.cybertek.pagesObject;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListingPage {

    public ListingPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "fcghchgchgch")

    public WebElement address;

    @FindBy(xpath = "vdskcvscsc")

    public WebElement agent;

    @FindBy(xpath = "bccbdcbmc")

    public WebElement map;
}
