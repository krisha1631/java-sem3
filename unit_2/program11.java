
interface A {
    void sound();
}


class B implements A {
    public void sound() {
        System.out.println("Dog barks");
    }
}


public class program11 {
    public static void main(String[] args) {
        B obj = new B();
        obj.sound();
    }
}