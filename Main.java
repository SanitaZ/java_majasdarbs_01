import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String client_name = scan.nextLine();

        System.out.println("Enter your age: ");
        Integer client_age = scan.nextInt();

        System.out.println("Enter your hight in meters: ");
        String client_hight = scan.next();

        System.out.println("Do you like programming (answer with Yes or No): ");
        String answer = scan.next();




        String name = "Sanita";
        int age = 36;
        double height = 1.62;
        int days = 365;
        int heightInCm = 100;
        boolean answerYes = answer.equalsIgnoreCase("Yes");


        System.out.println();

        System.out.println("Customer questionnaire");
        System.out.println("Customer name: " + name);
        System.out.println("Customer age: " + age);
        System.out.println("Customer hight (m): " + height);
        System.out.println("Do you like programming (answer with Yes or No): " + (answerYes ? "Yes" : "No"));


        System.out.println("Customer age in days: " + (age * days));
        Integer ageInDays = scan.nextInt();

        System.out.println("Customer height in cm: " + (height * heightInCm));
        Integer Height_cm = scan.nextInt();


























    }
}