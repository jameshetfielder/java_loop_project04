import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = 1, num1, num2, total1 = 1, total2 = 1;

        System.out.print("Enter number of objects: ");
        num1 = input.nextInt();
        System.out.print("Enter new group number of objects: ");
        num2 = input.nextInt();
        for (int i = 1; i <= num1; i++){
            total1 *= i;
        }
        for (int i = 1; i <= num2; i++){
            total2 *= i;
        }
        for (int i = 1; i <= (num1 - num2); i++){
            a *= i;
        }
        System.out.print("Result is: " + total1 / (total2 * a));

    }
}