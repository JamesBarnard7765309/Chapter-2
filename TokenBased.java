import java.util.Scanner;

public class TokenBased {
    public static void main(String[] args) {
        Scanner consoleInput = new Scanner(System.in);
        System.out.println("Enter one word");
        String oneWord = consoleInput.next();
        consoleInput.nextLine();
        System.out.println("Enter any long sentence: ");
        String longSentence = consoleInput.nextLine();

        System.out.println(oneWord);
        System.out.println(longSentence);
    }

}
