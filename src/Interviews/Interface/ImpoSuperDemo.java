package Interviews.Interface;

    public class ImpoSuperDemo implements ClickListener1, ClickListener2 {

        /*  1. Class can implement multiple interface but it has to override the methods if any in common else
         * use InterfaceName.super.methodname */
        //  2. Default methods inside interface provides method implemetation - Jave 8

        @Override
        public String onClick1(String abc, String xyz) {
            System.out.println("returning strings of ClickListener1");
            return null;
        }

        @Override
        public String onClick2(String abc, String xyz) {
            System.out.println("returning strings of ClickListener2");
            return null;
        }

        @Override
        public void arbit() {
            // this is inside object
            ClickListener1.super.arbit();
            ClickListener2.super.arbit();
            System.out.println("this is here");
        }

        public static void main(String[] args) {
            ClickListener2 a =new ImpoSuperDemo();
            a.arbit();
            a.onClick2("str1","str2");

            ClickListener1 b =new ClickListener1(){
                public String onClick1(String abc, String xyz) {
                    System.out.println("returning interface val");
                    return null;
                }
            };

            // Here overidden method of anonymous inner class(which is the above method) will be called, not the method
            // of ImpoSuperDemo class
            b.onClick1("str1","str2");

            a.onClick2("str1","str2");
        }
    }

    @FunctionalInterface
    interface ClickListener1 {
        String ABC = "1";
        String onClick1(String abc, String xyz);
        default void arbit() {
            System.out.println("ClickListener1: i ma here");
        }
    }

    interface ClickListener2 {
        String onClick2(String abc, String xyz);
        default void arbit() {
            System.out.println("ClickListener2: you are there");
        }

        default  void arbit2() {
            System.out.println("this is arbit2");
        }
    }

    interface ClickListener3 {
    }

