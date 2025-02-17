import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
        double width;
        do {
            System.out.println("Please enter the width of the rectangle.");
            Scanner sc = new Scanner(System.in);
            width = sc.nextInt();
        }while (width > 0);
        double length;
        do {
            System.out.println("Please enter the length of the rectangle.");
            Scanner sc1 = new Scanner(System.in);
            length = sc1.nextInt();
        }while (length > 0);
    }
}