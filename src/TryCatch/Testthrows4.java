package TryCatch;

import java.io.IOException;

class Testthrows4{
    public static void main(String args[])throws IOException {//declare exception
        CheckedExceptionProp m=new CheckedExceptionProp();
        m.method();

        System.out.println("normal flow...");
    }
}
