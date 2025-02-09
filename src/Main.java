import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter your choice (C for Fahrenheit to Celsius and F for Celsius to Fahrenheit) : ");
        unit = scanner.next().toUpperCase();

        System.out.print("Enter the temperature : ");
        temp = scanner.nextDouble();

        newTemp = (unit.equals("C")) ? (temp*9/5)+32 : (temp-32)*5/9;

        System.out.printf("%.1f %s",newTemp,unit);


        scanner.close();

    }
}