package DesignPatterns.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

public class InputStreamInvoke {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("");
        new GZIPInputStream(new BufferedInputStream(inputStream));
    }
}
