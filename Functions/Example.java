class Person {
    String name;
    int age;
    String vehicle;
    String food;

    void Vehicle() {
        System.out.println(name + " is driving " + vehicle);
    }

    void Food() {
        System.out.println("While eating " + food);
    }
}


public class Example {
    public static void main(String[] args) {
        Person x = new Person();
        x.name = "Noob";
        x.age = 21;
        x.food = "EggRoll";
        x.vehicle = "Car";

        Person y = new Person();
        y.name = "Bot";
        y.age = 20;
        y.food = "IceCream";
        y.vehicle = "Bike";

        System.out.println(x.name + " is " + x.age + " years old");
        x.Vehicle();
        x.Food();

        System.out.println();

        System.out.println(y.name + " is " + y.age + " years old");
        y.Vehicle();
        y.Food();
    }
}