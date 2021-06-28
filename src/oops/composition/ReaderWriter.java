package oops.composition;

import java.io.FileNotFoundException;

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
