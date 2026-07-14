import java.util.Scanner;

class program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        sc.nextLine(); // consume newline

        System.out.print("Enter your address: ");
        String address = sc.nextLine();

        System.out.print("Enter your mobile number: ");
        String mobile = sc.nextLine();

        System.out.println("\nPersonal Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Mobile Number: " + mobile);

        sc.close();
    }
}