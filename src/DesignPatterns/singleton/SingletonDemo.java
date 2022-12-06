package DesignPatterns.singleton;

public class SingletonDemo {
        private static SingletonDemo single_instance = null;
        int i;
        private SingletonDemo()
        {
            i=90;
        }
        public static SingletonDemo getInstance()
        {
            if(single_instance == null)
            {
                single_instance = new SingletonDemo();
            }
            return single_instance;
        }

        public static void main(String args[]) {
            SingletonDemo first = SingletonDemo.getInstance();
            System.out.println("First instance integer value:" + first.i);
            first.i = first.i + 90;
            SingletonDemo second = SingletonDemo.getInstance();
            System.out.println("Second instance integer value:"+second.i);
        }
    }
