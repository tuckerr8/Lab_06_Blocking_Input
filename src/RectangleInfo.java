import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
        double length;
        double width;
        double area;
        double perimeter;
        double diagonal;
        boolean done = false;
        String trash;

        //area = length * breadth
        //perimeter = 2 * length + 2 * breadth
        //diagonal = SquareRoot( length * length + breadth * breadth)

        Scanner in = new Scanner(System.in);

        do{
            System.out.println("Enter the length of the rectangle: ");

            if(in.hasNextDouble()) {
                length = in.nextDouble();
                in.nextLine();

                System.out.println("Enter the width of the rectangle: ");

                if(in.hasNextDouble()){
                    width = in.nextDouble();
                    in.nextLine();

                    diagonal = Math.sqrt(length * length + width * width);

                    area = length * width;

                    perimeter = 2 * length + 2 * width;

                    System.out.printf("The area of the rectangle %.2f%n", area);
                    System.out.printf("The perimeter of the rectangle %.2f%n", perimeter);
                    System.out.printf("The diagonal of the rectangle %.2f%n", diagonal);

                } else{
                    trash = in.nextLine();
                    System.out.println("You entered an invalid with" + trash + "value");
                    System.exit(0);
                }

                done = true;

            } else{
                trash = in.nextLine();
                System.out.println("You entered an invalid value: " + trash);
                System.exit(0);
            }
        }while(!done);

    }
}
