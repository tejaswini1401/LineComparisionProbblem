import java.util.Scanner;

public class LineLength {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the coordinates for the first line:");
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        double distance1 = calculateDistance(x1, y1, x2, y2);

        System.out.println("Enter the coordinates for the second line:");
        System.out.print("Enter x3: ");
        double x3 = sc.nextDouble();
        System.out.print("Enter y3: ");
        double y3 = sc.nextDouble();

        System.out.print("Enter x4: ");
        double x4 = sc.nextDouble();
        System.out.print("Enter y4: ");
        double y4 = sc.nextDouble();

        double distance2 = calculateDistance(x3, y3, x4, y4);

        System.out.println("The length of the first line is: " + distance1);
        System.out.println("The length of the second line is: " + distance2);

        if (distance1 == distance2) {
            System.out.println("Both lines are of equal length.");
        } else {
            System.out.println("The lines are of different lengths.");
        }

        sc.close();
    }

    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
