import java.util.Scanner;

public class A01_Input {
    public static void main(String[] args) {
        double width = 0;
        double height = 0;
        double area = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        width = scan.nextDouble();

        System.out.print("Enter the height of the rectangle: ");
        height = scan.nextDouble();

        area = width * height;
        System.out.print("The Area of Rectangle is: " + area);
    };
};

