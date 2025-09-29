import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Choose your party:");
        System.out.println("D) Democrat");
        System.out.println("R) Republican");
        System.out.println("I) Independent");
        System.out.print("Enter your choice (D/R/I): ");

        String input = in.nextLine().trim();
        String choice = input.isEmpty() ? "" : input.substring(0,1).toUpperCase();

        if (choice.equals("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (choice.equals("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (choice.equals("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get Other.");
        }
    }
}
