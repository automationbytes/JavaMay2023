package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public Properties properties;

    public String getConfigProperty(String key){
        properties = new Properties();
        FileInputStream file = null;
        try {
            file = new FileInputStream("src/test/resources/Config.properties");
            properties.load(file);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(key);
    }

}
