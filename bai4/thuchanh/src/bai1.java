import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celisius;
        int choice;

        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsius: "+FahrenheittoCelsius(fahrenheit));
                    break;
                case 2:
                    System.out.println("Enter Celsius: ");
                    celisius = scanner.nextDouble();
                    System.out.println("Celsius to Fahrenheit: "+CelsiustoFahrenheit(celisius));
                    break;
                case 0:
                    System.exit(0);
            }
        }while (choice!=0);
    }
    public static double FahrenheittoCelsius(double fahrenheit){
        double celsius = (5.0/9)*(fahrenheit-32);
        return celsius;
    }
    public static double CelsiustoFahrenheit(double celsius){
        double fahrenheit = (9.0/5)*celsius+32;
        return fahrenheit;
    }
}
