class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Colour of pen used :");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;
    String gender;

    Student () {
        System.out.println("Constructor called");
    }
    public void info() {
        System.out.println("Name = "+this.name);
        System.out.println("Age = "+this.age);
        System.out.println("Gender = "+this.gender);
    }
}

class animals {

    String animal1;
    String animal2;

    public void pets() {
        System.out.println("pet1 = "+ this.animal1);
        System.out.println("pet2 = "+this.animal2);
    }

    public void pokemon() {
        System.out.println("pokemon1 = "+ this.animal1);
        System.out.println("pokemon2 = "+this.animal2);
    }

    animals (String animal1 ,String animal2) {
        this.animal1 = animal1;
        this.animal2 = animal2;
    }
    animals (animals s3) {
        this.animal1 = s3.animal1;
        this.animal2 = s3.animal2;
    }
    animals(){

    }
}

public class OOPS {
    public static void main(String args[]) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write();
        
        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen1.printColor();
        pen2.printColor();

        Student stats = new Student();
        stats.name  = "Ritam";
        stats.age = 19;
        stats.gender = "Male";
        stats.info();

        animals a1 = new animals("Dog","Cat");

        animals a2 = new animals();
        a2.animal1 = "monke";
        a2.animal2 = "doge";

        animals a3 = new animals(a2);
        a3.pokemon();
        a1.pets(); 
    }
}