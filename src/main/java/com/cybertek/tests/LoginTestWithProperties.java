package com.cybertek.tests;

import com.cybertek.pagesObject.HomePage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.TestBase;
import org.testng.annotations.Test;

public class LoginTestWithProperties extends TestBase {

    @Test
    public void readPropertyTest(){
        driver.get(ConfigurationReader.getProperties("url"));

        HomePage homePage = new HomePage();

        String username = ConfigurationReader.getProperties("username");
        String password = ConfigurationReader.getProperties("password");
        homePage.login(username, password);
    }
}
