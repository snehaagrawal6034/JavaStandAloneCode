package TryCatch.CheckedException;

class TestExceptionPropagation2{
    void m() throws Exception {
        throw new Exception();//checked exception
    }
    void n() throws Exception {
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handeled");}
    }
    public static void main(String args[]){
        TestExceptionPropagation2 obj=new TestExceptionPropagation2();
        obj.p();
        System.out.println("normal flow");
    }
}