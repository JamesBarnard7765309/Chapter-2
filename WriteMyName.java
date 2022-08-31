public class WriteMyName {
    public static void main(String[] args) {


        java.util.Scanner consoleInput = new java.util.Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = consoleInput.next(); //token
        System.out.println("Enter your last name: ");
        String lastName = consoleInput.next();

        String greeting = "Hello, ";

        String output = greeting + firstName + " " + lastName;
        System.out.println(output);
    }
}
