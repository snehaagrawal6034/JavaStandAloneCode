package files.FileReadingInDifferentFormat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

//TODO
public class ExcelFileReader {

    public List<Credentials> getToken()throws Exception{
        // Decorator pattern
        BufferedReader reader= new BufferedReader(new FileReader("src/test/resources/Book1.xlsx"));
        String line = null;
        List<Credentials> credentials = new ArrayList<>();
        while ((line=reader.readLine()) != null) {
            System.out.println(line);
        }
        return credentials;
    }

    public static void main(String[] args) throws Exception {
        ExcelFileReader excelFileReader = new ExcelFileReader();
        excelFileReader.getToken();
    }

    public static class Credentials {
        public String userName;
        public String password;

        public Credentials(String userName, String password) {
            this.userName = userName;
            this.password = password;
        }
    }
}
