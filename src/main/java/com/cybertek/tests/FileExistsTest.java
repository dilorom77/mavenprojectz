package com.cybertek.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileExistsTest {

    @Test
    public void test(){

        String current = System.getProperty("user.dir");

        System.out.println(current);





        String userFolder = System.getProperty("user.home");

        System.out.println(userFolder);

        String path = userFolder + "/downloads/a.xlsx";

        System.out.println(path);

         Assert.assertTrue(Files.exists(Paths.get(path)));

    }

}
