package files;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesFile {
    public String getToken()throws Exception{
        FileReader reader=new FileReader("src/test/resources/system.properties");

        Properties p=new Properties();
        p.load(reader);

        System.out.println(p.getProperty("accessToken"));
        return p.getProperty("accessToken");
    }

    public static void main(String[] args) throws Exception {
        PropertiesFile propertiesFile = new PropertiesFile();
        propertiesFile.getToken();
    }
}
