package TryCatch.CheckedException;

import java.io.IOException;

public class TestThrows2 {
//    void method(){
//        try{
//            throw new IOException("device error");
//        } catch(Exception e){
//
//        }

    void method() throws IOException{
        throw new IOException("device error");
    }

    public static void main(String args[]){
        try{
            TestThrows2 m=new TestThrows2();
            m.method();
        }catch(Exception e){System.out.println("exception handled");}

        System.out.println("normal flow...");
    }
}
