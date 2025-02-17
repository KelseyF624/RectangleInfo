import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
        double width;
        do {
            System.out.println("Please enter the width of the rectangle.");
            Scanner sc = new Scanner(System.in);
            width = sc.nextInt();
        }while (width <= 0);
        double length;
        do {
            System.out.println("Please enter the length of the rectangle.");
            Scanner sc1 = new Scanner(System.in);
            length = sc1.nextInt();
        }while (length <= 0);
        double area = width * length;
        double perimeter = 2 * width * length;
        double diagonalLength = Math.sqrt(area * area / perimeter);
        System.out.println("The area of the rectangle is " + area);
        System.out.println("The perimeter of the rectangle is " + perimeter);
        System.out.println("The diagonal length of the rectangle is " + diagonalLength);
    }
}