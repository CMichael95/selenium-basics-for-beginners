package eu.michaelclement.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UrlReader {
    public static String getUrl(URLs url) {
        Properties properties = new Properties();

        try(FileInputStream fileInputStream = new FileInputStream("src/test/resources/urls.properties")) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties.getProperty(url.getValue());
    }
}
