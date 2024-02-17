import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        String trash;

        // fahrenheit = (celsius * 9/5) + 32

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the temp for Celsius: ");

        if (in.hasNextDouble()) {
            celsius = in.nextDouble();
            in.nextLine();

            fahrenheit = ((celsius * 1.8) + 32);

            System.out.printf("The temp in Fahrenheit is: " + fahrenheit);

        } else {
            System.out.println("You entered an invalid value");
        }
    }
}
