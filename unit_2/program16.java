// Abstract class
abstract class Animal {


    abstract void sound();


    void eat() {
        System.out.println("Animal is eating.");
    }
}


class Dog extends Animal {


    void sound() {
        System.out.println("Dog barks.");
    }
}


public class program16 {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();      // Calls normal method
        d.sound();    // Calls implemented abstract method
    }
}