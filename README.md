# Armstong-Number-or-not?
Here's an explanation of your `ArmstrongNumber` program that you can use for your GitHub README or comments:

---

### **Armstrong Number Program Explanation**

This Java program checks whether a given number is an **Armstrong number** (also known as a **Narcissistic number**). An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits. For simplicity, this program specifically checks for **3-digit Armstrong numbers**.

#### **Steps in the Program:**

1. **Input**: The program prompts the user to input a number.

2. **Store Original Number**: The original number is saved in the variable `originalNumber` for later comparison with the calculated sum.

3. **Digit Extraction and Cube Calculation**:
    - The program extracts the digits of the number one by one using the modulo operation (`% 10`).
    - For each extracted digit, the program calculates its cube (since this program checks for 3-digit Armstrong numbers).
    - The sum of these cubes is accumulated in the `sum` variable.

4. **Comparison**: After all digits are processed, the program compares the sum of the cubes with the original number. If they are equal, the number is an Armstrong number.

5. **Output**: The program prints whether the number is an Armstrong number or not based on the comparison.

6. **Close Scanner**: Finally, the `Scanner` object is closed to prevent resource leakage.

#### **Key Logic:**

- For example, if you enter `153`, the program:
  - Breaks it into digits `1`, `5`, and `3`.
  - Computes the cubes: `1^3 = 1`, `5^3 = 125`, `3^3 = 27`.
  - The sum of cubes is `1 + 125 + 27 = 153`, which is equal to the original number. Hence, it prints that `153` is an Armstrong number.

#### **Code:**

```java
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, rem, sum = 0;

        System.out.printf("Enter the number: ");
        number = input.nextInt();

        int originalNumber = number;

        // While loop to break down the number into digits and calculate the sum of cubes
        while (number > 0) {
            rem = number % 10; // Extract the last digit
            sum = sum + (int) Math.pow(rem, 3); // Cube the digit and add to sum
            number = number / 10; // Remove the last digit
        }

        // Check if the sum of cubes is equal to the original number
        if (sum == originalNumber) {
            System.out.println("The number is an Armstrong number.");
        } else {
            System.out.println("The number is not an Armstrong number.");
        }

        input.close(); // Close the scanner to free resources
    }
}
```

#### **How the Program Works:**
1. The user is prompted to enter a number.
2. The program calculates the sum of cubes of the digits.
3. If the sum equals the original number, it prints that the number is an Armstrong number; otherwise, it states that it's not.

#### **Example of Armstrong Number:**
- **153** is an Armstrong number:
  - `1^3 + 5^3 + 3^3 = 153`
  
#### **Example of Non-Armstrong Number:**
- **123** is NOT an Armstrong number:
  - `1^3 + 2^3 + 3^3 = 1 + 8 + 27 = 36` (not equal to 123)

#### **Applications**:
This program is helpful for demonstrating basic concepts such as digit manipulation, loops, and condition checking in Java. It can be extended to handle numbers with more digits, but for now, it checks for 3-digit Armstrong numbers.

---

This explanation should give a clear understanding of the purpose and functionality of the program when included in your GitHub repository. You can copy this explanation into your `README.md` or use it as inline comments in the code.
