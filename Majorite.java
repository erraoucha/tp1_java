import java.util.Scanner; // import the Scanner class 

public class Majorite {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(" age passe en argument : ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("Vous etes mineur.");
        } else {
            System.out.println("Vous etes majeur.");
        }

        scanner.close();
    }
}