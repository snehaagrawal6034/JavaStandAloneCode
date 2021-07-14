package oops.composition;

import java.io.FileNotFoundException;

//Use case implemented for Composition
//1. When super-class behavior changes, sub-class functionality can be broken without any modification on its part.
//2. Java does not support multiple inheritances is one reason for favoring composition over inheritance in Java.
//It makes your job simple to have them as private members, and this is called Composition.
//Although both Composition and Inheritance allow you to reuse code,
//one of Inheritance’s disadvantages is that it breaks encapsulation.
//If the subclass depends on the action of the superclass for its function,it suddenly becomes fragile.
//When super-class behavior changes, sub-class functionality can be broken without any modification on its part.
public class ReaderWriter implements Reader, Writer {
    private final Reader reader;
    private Writer writer;

    // DI
    public ReaderWriter(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }

    @Override
    public String read(String file) {
        return reader.read(file);
    }

    @Override
    public void write(String content, String file) throws FileNotFoundException {
        writer.write(content, file);
    }

    public static void main(String[] args) {
        ReaderWriter readerWriter = new ReaderWriter(new ReaderImpl(), new WriterImpl());
    }
}
