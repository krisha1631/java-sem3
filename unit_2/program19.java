
class Animal {
    void sound() {
        System.out.println("Animal makes a sound.");
    }
}


class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}


public class program19 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}