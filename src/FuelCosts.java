import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        double gallonsOfGas = 0;
        double fuelEfficiency = 0;
        double pricePerGallon = 0;
        boolean done = false;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Enter the gallons in the tank: ");

            if(scanner.hasNextDouble()){
                gallonsOfGas = scanner.nextDouble();
            }else {
                if(gallonsOfGas < 0){
                    System.out.println("Please enter a correct value");
                }
            }

            System.out.println("Enter the fuel efficiency in miles per gallon: ");

            if(scanner.hasNextDouble()){
                fuelEfficiency = scanner.nextDouble();
            }else{
                if(fuelEfficiency < 0){
                    System.out.println("Please enter a correct value");
                }
            }

            System.out.println("Enter the price per gallon: ");

            if(scanner.hasNextDouble()){
                pricePerGallon = scanner.nextDouble();
                done = true;
            }else{
                if(pricePerGallon < 0){
                    System.out.println("Please enter a correct value");
                }
            }
        }while(!done);

        double costPer100Miles = (100 / fuelEfficiency) * pricePerGallon;
        double milesWithGas = gallonsOfGas * fuelEfficiency;

        System.out.println("The cost per 100 miles is $" + costPer100Miles);
        System.out.println("Your vehicle can go " + milesWithGas + " miles with the gas in your tank.");

    }
}
