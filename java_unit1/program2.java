import java.util.Scanner;

class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Your name is: " + name);

        sc.close();
    }
}