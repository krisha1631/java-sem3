class program8 {
    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);

        if(num % 2 == 0) {
            System.out.println(num + " is an Even number");
        }
        else {
            System.out.println(num + " is an Odd number");
        }
    }
}