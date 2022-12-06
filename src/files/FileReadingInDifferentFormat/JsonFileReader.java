package files.FileReadingInDifferentFormat;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class JsonFileReader {

    public String readJsonFile() throws IOException {
        File file = new File("src/test/resources/system.json");
        FileInputStream fis = new FileInputStream(file);
        byte[] data = new byte[(int) file.length()];
        fis.read(data);
        fis.close();

        return new String(data, "UTF-8");
    }

    public static void main(String[] args) throws IOException {
        // readJsonFile, do gson deserailization - https://www.baeldung.com/gson-deserialization-guide

        JsonFileReader jsonFileReader = new JsonFileReader();
        System.out.println(jsonFileReader.readJsonFile());
    }
}
