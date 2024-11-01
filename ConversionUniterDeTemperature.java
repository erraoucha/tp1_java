import java.util.Scanner; // Import the Scanner class

public class ConversionUniterDeTemperature{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Temperature en degres Celsius : ");
        int degresCelsius = scanner.nextInt();
        int degresFahrenheit = (int) ((9.0 / 5) * degresCelsius + 32); // Conversion

        System.out.print(degresCelsius + " degres Celsius equivalent a " + degresFahrenheit + " degres Fahrenheit.");

        scanner.close();
    }
}
