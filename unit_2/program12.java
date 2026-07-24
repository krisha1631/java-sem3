
interface Animal {
    void eat();
}


interface Dog extends Animal {
    void bark();
}


class Puppy implements Dog {

    public void eat() {
        System.out.println("Dog is eating.");
    }

    public void bark() {
        System.out.println("Dog is barking.");
    }
}


public class program12 {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
    }
}