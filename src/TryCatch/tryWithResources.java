package TryCatch;

import java.io.File;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class tryWithResources {
        public static void main(String[] args) {
            File file = new File("src/main/java/arbit.txt");
            try(FileInputStream fileInputStream = new FileInputStream(file)) {
                throwSomeException();
                fileInputStream.read();
            } catch (Exception ignored) {
            }


        }

        private static void throwSomeException() {
            throw new RuntimeException();
        }
    }