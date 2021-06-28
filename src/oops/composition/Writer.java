package oops.composition;

import java.io.FileNotFoundException;

public interface Writer {

   void write(String content, String file) throws FileNotFoundException;
}
