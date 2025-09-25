import java.util.Scanner;

public class UnitConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n=== Unit Converter ===");
            System.out.println("1. Temperature Conversion");
            System.out.println("2. Length Conversion");
            System.out.println("3. Weight Conversion");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    convertTemperature(scanner);
                    break;
                case "2":
                    convertLength(scanner);
                    break;
                case "3":
                    convertWeight(scanner);
                    break;
                case "4":
                    running = false;
                    System.out.println("Exiting the converter. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private static void convertTemperature(Scanner scanner) {
        System.out.println("\n--- Temperature Conversion ---");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Celsius to Kelvin");
        System.out.println("3. Fahrenheit to Celsius");
        System.out.println("4. Fahrenheit to Kelvin");
        System.out.println("5. Kelvin to Celsius");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.print("Choose an option: ");

        String option = scanner.nextLine();
        System.out.print("Enter the value: ");
        try {
            double value = Double.parseDouble(scanner.nextLine());
            double result;
            switch (option) {
                case "1":
                    result = (value * 9/5) + 32;
                    System.out.printf("%.2f Celsius = %.2f Fahrenheit%n", value, result);
                    break;
                case "2":
                    result = value + 273.15;
                    System.out.printf("%.2f Celsius = %.2f Kelvin%n", value, result);
                    break;
                case "3":
                    result = (value - 32) * 5/9;
                    System.out.printf("%.2f Fahrenheit = %.2f Celsius%n", value, result);
                    break;
                case "4":
                    result = (value - 32) * 5/9 + 273.15;
                    System.out.printf("%.2f Fahrenheit = %.2f Kelvin%n", value, result);
                    break;
                case "5":
                    result = value - 273.15;
                    System.out.printf("%.2f Kelvin = %.2f Celsius%n", value, result);
                    break;
                case "6":
                    result = (value - 273.15) * 9/5 + 32;
                    System.out.printf("%.2f Kelvin = %.2f Fahrenheit%n", value, result);
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
        }
    }

    private static void convertLength(Scanner scanner) {
        System.out.println("\n--- Length Conversion ---");
        System.out.println("1. Miles to Kilometers");
        System.out.println("2. Kilometers to Miles");
        System.out.println("3. Meters to Kilometers");
        System.out.println("4. Kilometers to Meters");
        System.out.print("Choose an option: ");

        String option = scanner.nextLine();
        System.out.print("Enter the value: ");
        try {
            double value = Double.parseDouble(scanner.nextLine());
            double result;
            switch (option) {
                case "1":
                    result = value * 1.60934;
                    System.out.printf("%.2f Miles = %.2f Kilometers%n", value, result);
                    break;
                case "2":
                    result = value / 1.60934;
                    System.out.printf("%.2f Kilometers = %.2f Miles%n", value, result);
                    break;
                case "3":
                    result = value / 1000;
                    System.out.printf("%.2f Meters = %.2f Kilometers%n", value, result);
                    break;
                case "4":
                    result = value * 1000;
                    System.out.printf("%.2f Kilometers = %.2f Meters%n", value, result);
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
        }
    }

    private static void convertWeight(Scanner scanner) {
        System.out.println("\n--- Weight Conversion ---");
        System.out.println("1. Kilograms to Pounds");
        System.out.println("2. Pounds to Kilograms");
        System.out.print("Choose an option: ");

        String option = scanner.nextLine();
        System.out.print("Enter the value: ");
        try {
            double value = Double.parseDouble(scanner.nextLine());
            double result;
            switch (option) {
                case "1":
                    result = value * 2.20462;
                    System.out.printf("%.2f Kilograms = %.2f Pounds%n", value, result);
                    break;
                case "2":
                    result = value / 2.20462;
                    System.out.printf("%.2f Pounds = %.2f Kilograms%n", value, result);
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
        }
    }
}