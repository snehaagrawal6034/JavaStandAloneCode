package TryCatch;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
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
            List<String> list = asList("arbit", "Sdsd");
            list.stream();
            File file = new File("src/main/java/arbit.txt");
            InputStream inputStream = null;
            try {
                inputStream = new FileInputStream(file);
                throwSomeException();
                inputStream.read();
            } finally {
                if (inputStream != null) {
                    try {
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
