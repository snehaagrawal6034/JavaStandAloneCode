package Comparator.internal;

public class Person {
    private int age;
    private String name;
    private int height;

    public Person(int age, String name, int height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }


    public static void main(String[] args) {
        Person person = new Person(1, "baby", 1);
        System.out.println(person);
    }
}
