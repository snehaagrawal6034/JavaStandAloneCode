package TryCatch;

import java.io.File;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TryWithResources {
        public static void main(String[] args) {
            File file = new File("src/TryCatch/tryWithResources1.java");
            try(FileInputStream fileInputStream = new FileInputStream(file)) {
                fileInputStream.read();
                throwSomeException();

            } catch (Exception ignored) {
                System.out.println("ere");
            }
        }

        private static void throwSomeException() {
            throw new RuntimeException();
        }
    }