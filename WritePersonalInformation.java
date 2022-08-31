import java.util.Scanner;
public class WritePersonalInformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your ID");
        int id = sc.nextInt(); //token based

        System.out.println("Enter your full name ");
        String fullName = sc.nextLine(); // non-token based
        sc.nextLine();
        System.out.println("Enter your street number of your address");
        int streetNumber = sc.nextInt();

        System.out.println("Enter today's humidity rate between 0 and 1");
        double humidity = sc.nextDouble();

        System.out.println("ID: " + id);
        System.out.println("Full Name: " + fullName);
        System.out.println("Street Number: " + streetNumber);
        System.out.println("Humidity: " + humidity);

    }
}
