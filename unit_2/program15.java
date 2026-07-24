// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}


class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}


class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing.");
    }
}

public class program15 {
    public static void main(String[] args) {

        Dog d = new Dog();
        Cat c = new Cat();

        System.out.println("Dog Details:");
        d.eat();
        d.bark();

        System.out.println();

        System.out.println("Cat Details:");
        c.eat();
        c.meow();
    }
}