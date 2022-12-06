package TryCatch;

public class ErrorThrow {

    public static void main(String[] args)  {
        try{
            badMethod();
            System.out.println("A");
        }
        catch(Exception e){
            System.out.println("In Catch");
        }

        finally{
            System.out.println("In Finally ");
        }
    }

    private static void badMethod() {
        throw new Error();
    }
}
