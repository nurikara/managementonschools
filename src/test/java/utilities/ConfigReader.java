package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties properties;


    static {
        String dosyayolu="Configuration.properties";
        properties=new Properties();
        try {
            FileInputStream fis=new FileInputStream(dosyayolu);
            properties.load(fis);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static java.lang.String getProperty(String key){



        return properties.getProperty(key);
    }


}
