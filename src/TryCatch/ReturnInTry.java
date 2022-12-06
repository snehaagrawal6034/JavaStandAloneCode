package TryCatch;

public class ReturnInTry {
    public static void main(String[] args)  {
        try{
            return;
        }

        finally{
            System.out.println("In Finally ");
        }
    }
}
