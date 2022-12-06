package TryCatch;

import java.io.*;
import java.util.List;

import static java.util.Arrays.asList;


import static java.util.Arrays.asList;

public class TryWithFinally {

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFile() throws IOException {
//            File file = new File("src/main/java/arbit.txt");
        File file = new File("src/TryCatch/arbit.txt");
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            throwSomeException();
            inputStream.read();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (inputStream != null) {
                try {
                    System.out.println("I am in finally");
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void throwSomeException() {
        throw new RuntimeException();
    }
}
