import java.util.Scanner;

public class Ex3 {public static void main(String[] args) {
    System.out.println("Введите трехзначное число");
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int sum = ((n%10) + (n/10)%10 + (n/100)%10);
    System.out.println("Сумма цифр числа = " + sum);
    }
}
