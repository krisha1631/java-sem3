
interface Animal {
    void eat();
}


interface Bird {
    void fly();
}


class Bat implements Animal, Bird {
    public void eat() {
        System.out.println("Bat eats fruits.");
    }

    public void fly() {
        System.out.println("Bat can fly.");
    }
}


public class program18 {
    public static void main(String[] args) {
        Bat b = new Bat();

        b.eat();
        b.fly();
    }
}