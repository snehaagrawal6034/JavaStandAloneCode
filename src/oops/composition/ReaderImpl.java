package oops.composition;

// 1. composition prefer over extending/inheritance
// 2. both classes/interfaces can be composed and can create object using new
public class ReaderImpl implements Reader {

    public String read(String file) {
        // read from file and return content
        System.out.println("I am reading");
        return "";
    }

}
