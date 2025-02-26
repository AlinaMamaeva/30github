import java.util.Scanner;

public class while3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to see the message?");

        String answer = sc.nextLine();

        while (answer.equalsIgnoreCase("yes")) {
            System.out.println("Happy Career and Life");


            System.out.println("Do you want to see the message?");
            answer = sc.nextLine();

            System.out.println("Error");
            answer =sc.nextLine();

        }

    }
}
