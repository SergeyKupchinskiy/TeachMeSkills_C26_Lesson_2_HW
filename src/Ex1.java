import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Введите B");
        Scanner scan = new Scanner(System.in);
        int B = scan.nextInt();
        System.out.println("Введите C");
        Scanner scany = new Scanner(System.in);
        int C = scany.nextInt();
        int A = ((4*(B + C -1))/2);
        System.out.println("A = " + A);
    }

}
