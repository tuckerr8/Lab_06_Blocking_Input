import java.util.Scanner;
public class MetricConverter {
    public static void main(String[] args) {
        double meters;
        double miles;
        double feet;
        double inches;
        String trash = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a measurement in meters: ");

        if(scanner.hasNextDouble()){
            meters = scanner.nextDouble();
            scanner.nextLine();

            if (meters >= 0){
                miles = meters * 0.000621371192;
                feet = meters * 3.2808399;
                inches = meters * 39.3700787;

                System.out.printf("\nMiles: %.4f\n", miles);

                System.out.printf("Feet: %.4f\n", feet);

                System.out.printf("Inches: %.4f",inches);

            }else{
                System.out.printf("You must enter a correct value.");
            }
        }else{
            trash = scanner.nextLine();
            System.out.println("You entered an invalid value: " + trash);
        }
    }
}
