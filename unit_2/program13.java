
class A {
    void show() {
        System.out.println("This is class A");
    }
}

class B extends A {
    void display() {
        System.out.println("This is class B");
    }
}

public class program13 {
    public static void main(String[] args) {
        B obj = new B();

        obj.show();
        obj.display();
    }
}

