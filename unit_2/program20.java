
abstract class Animal {
   
    abstract void sound();
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks.");
    }
}


public class program20 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}