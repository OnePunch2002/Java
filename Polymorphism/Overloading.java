/*

When two or more methods in the same class have the same
name but different parameters, it’s called Overloading.

Overloading implements Compile time polymorphism.

*/

class Test {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name , int age) {
        System.out.println(name + " " + age);
    }
} 


public class Overloading {
    public static void main(String[] args) {
        Test s1 = new Test();
        s1.name = "Noob";
        s1.age = 69;

        s1.printInfo(s1.name , s1.age );
    }
}
