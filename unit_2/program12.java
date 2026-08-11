
interface B {
    void show();
}

interface C extends B {
    void display();
}

class A implements C {
    public void show() {
        System.out.println("Hello from B");
    }

    public void display() {
        System.out.println("Hello from C");
    }
}

public class program12 {
    public static void main(String[] args) {
        A obj = new A();

        obj.show();
        obj.display();
    }
}


