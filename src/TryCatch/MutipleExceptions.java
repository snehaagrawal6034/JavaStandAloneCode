package TryCatch;

public class MutipleExceptions {

    public static void main(String[] args)  {
            try{
                throw new  ArithmeticException();
            }
            catch(Exception e){
                System.out.println("In Catch");
                throw new  ArithmeticException();
            }

            finally{
                System.out.println("In Finally ");
                try{
                    throw new  Exception();
                } catch(Exception e){
                    throw new  ArithmeticException();
//                    System.out.println("Exception catched");
                }

        }
    }
}
