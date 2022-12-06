package files.FileReadingInDifferentFormat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVFileReader {

    public List<Credentials> getToken()throws Exception{
        BufferedReader reader= new BufferedReader(new FileReader("src/test/resources/system.csv"));
        String line;
        List<Credentials> credentials = new ArrayList<>();
        boolean firstRow = true;
        while ((line=reader.readLine()) != null) {
            if(firstRow) {
                firstRow = false;
                continue;
            }
            String[] userNamePwd = line.split(",");
            credentials.add(new Credentials(userNamePwd[0], userNamePwd[1]));
        }
        return credentials;
    }

    public static void main(String[] args) throws Exception {
        CSVFileReader CSVFileReader = new CSVFileReader();
        System.out.println(CSVFileReader.getToken());
    }

    public static class Credentials {
        public String userName;
        public String password;

        public Credentials(String userName, String password) {
            this.userName = userName;
            this.password = password;
        }

        @Override
        public String toString() {
            return "Credentials{" +
                    "userName='" + userName + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }
}
