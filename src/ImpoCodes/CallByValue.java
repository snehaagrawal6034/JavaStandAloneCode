package ImpoCodes;

public class CallByValue {
    public static void main(String[] args) {
        CallByValue callByValueDemo = new CallByValue();
        Container container1 = new Container(5);
        Container container2 = new Container(2);

        callByValueDemo.swapValueAlternate(container1, container2);
        System.out.println("container1 " + container1);
        System.out.println("container2 " + container2);

        callByValueDemo.swapValue(container1, container2);
        System.out.println("container1 " + container1);
        System.out.println("container2 " + container2);
    }


    private void swapValue(Container container1, Container container2) {
        int temp = container1.value;
        container1.value = container2.value;
        container2.value = temp;
    }

    private void swapValueAlternate(Container container1, Container container2) {
        Container temp = container1;
        container1 = container2;
        container2 = temp;
    }

    private void changeInt(int i) {
        i = 7;
    }

    public static class Container {
        private int value;

        public Container(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Container{" +
                    "value=" + value +
                    '}';
        }
    }
}
