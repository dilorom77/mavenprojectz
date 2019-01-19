package com.cybertek.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties;

    static {
        String path = "configuration_properties";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);

            properties = new Properties();
            properties.load(fileInputStream);

            fileInputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static String getProperties(String property){
        return properties.getProperty(property);

    }
}