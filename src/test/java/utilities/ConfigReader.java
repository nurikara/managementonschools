package utilities;


import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {

    //    Bu sinif configuration.properties file'i okumak icin kullanilir.
//    property file'i okumak icin property objesi olustururuz.
    private static Properties properties;

    //Herseyden once calismasi icin static block icerisinde, olusturmus oldugum properties dosyasini tanimlar
    //ve atamasini yapariz. FileInputStream ile dosya yolunu akisa aliriz.
//    static block : ilk calisir
    static {
//        data cekmek istedigim dosyaninin path i
        String path = "configuration.properties";
        try {
//            configuration.property dosyasini acar
            FileInputStream fileInputStream = new FileInputStream(path);
//            properties objesini instantiate ediyoruz
            properties = new Properties();//objeyi olusturduk atamasini gerceklestirdik!
//            configuration.property dosyasindaki datalari yükler
            properties.load(fileInputStream);//fis'in okudugu bilgileri properties'e yukler
//            file input stream'i kapatilir
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //    ConfigReader.getProperty("browser"); -> chrome
//    ConfigReader.getProperty("amazon_url"); -> https://www.amazon.com
//    ConfigReader.getProperty("username"); -> ali
    public static String getProperty(String key) {//String bir deger dondurmesi icin String bir parametre atariz
        String value = properties.getProperty(key);
        return value;
    }
}







