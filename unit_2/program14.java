
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

class C extends B {
    void print() {
        System.out.println("This is class C");
    }
}

public class program14 {
    public static void main(String[] args) {
        C obj = new C();

        obj.show();
        obj.display();
        obj.print();
    }
}

