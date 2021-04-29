package TryCatch;
import java.io.*;

public class CheckedExceptionProp {
        void method()throws IOException{
            throw new IOException("device error");
        }
    }
