import java.util.Scanner;

public class AMSTRONGNUMBER {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, rem, sum = 0;

        System.out.printf("Enter the number: ");
        number = input.nextInt();

        int originalNumber = number;

        while (number > 0) {
            rem = number % 10;
            sum = sum + (int) Math.pow(rem, 3); // Cube the digit and cast to int
            number = number / 10;
        }

        if (sum == originalNumber) {
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }

        input.close();
    }
}
