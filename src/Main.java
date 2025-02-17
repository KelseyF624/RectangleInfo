import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        do {
            System.out.println("Please enter the width of the rectangle.");
            Scanner sc = new Scanner(System.in);
            double width = sc.nextInt();
        }while (width > 0);
        do {
            System.out.println("Please enter the length of the rectangle.");
            Scanner sc1 = new Scanner(System.in);
            double length = sc1.nextInt();
        }while (length > 0);
    }
}