<<<<<<< HEAD
package computer_science_basics.homework_2.Armine_Sargsyan;
import java.util.Scanner;

public class Task3 {
=======
<<<<<<< HEAD:src/main/java/computer_science_basics/homework_2/solutions/Task3Solutions.java
package computer_science_basics.homework_2.solutions;
=======
package computer_science_basics.homework_2.Armine_Sargsyan;
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61:src/main/java/computer_science_basics/homework_2/Armine_Sargsyan/Task3.java

import java.util.Random;
import java.util.Scanner;

public class Task3Solutions {
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61

    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {
<<<<<<< HEAD
=======
<<<<<<< HEAD:src/main/java/computer_science_basics/homework_2/solutions/Task3Solutions.java
        for (int i = 1; i <= count; i++) {
            System.out.println(i);
        }
=======
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61
        for (int i = 1; i < count; i++) {
            System.out.print(i + ", ");
        }

<<<<<<< HEAD
=======
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61:src/main/java/computer_science_basics/homework_2/Armine_Sargsyan/Task3.java
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static void sumNumbers() {
        int sum = 0;
<<<<<<< HEAD
=======
<<<<<<< HEAD:src/main/java/computer_science_basics/homework_2/solutions/Task3Solutions.java
        for (int i = 1; i <= 10; i++) {
            sum += i;
=======
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61

        for (int i = 1; i < 10; i++) {
            sum = sum + i;
            //  or >>> sum += i;
<<<<<<< HEAD
=======
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61:src/main/java/computer_science_basics/homework_2/Armine_Sargsyan/Task3.java
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61
        }
        System.out.println("Sum: " + sum);
    }


    /* TODO: Question 3
        Write a program that prompts the user to input a positive integer.
        It should then print the multiplication table of that number.
    */
    public static void table() {
        Scanner console = new Scanner(System.in);
        int num;

        System.out.print("Enter any positive integer: ");
        num = console.nextInt();

        System.out.println("Multiplication Table of " + num);

<<<<<<< HEAD
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));

=======
<<<<<<< HEAD:src/main/java/computer_science_basics/homework_2/solutions/Task3Solutions.java
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
=======
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));

>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61:src/main/java/computer_science_basics/homework_2/Armine_Sargsyan/Task3.java
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61
        }
    }


    /* TODO: Question 4
        Write a program to find the factorial value of any number entered through the keyboard.
    */
    public static void factorialDemo1() {
        Scanner console = new Scanner(System.in);
        int num; // To hold number
        int fact = 1; // To hold factorial

        System.out.print("Enter any positive integer: ");
        num = console.nextInt();

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
<<<<<<< HEAD
=======
<<<<<<< HEAD:src/main/java/computer_science_basics/homework_2/solutions/Task3Solutions.java

=======
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61:src/main/java/computer_science_basics/homework_2/Armine_Sargsyan/Task3.java
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61
        System.out.println("Factorial: " + fact);
    }

     /* TODO: Question 4
         Two numbers are entered through the keyboard.
         Write a program to find the value of one number raised to the power of another.
         (Do not use Java built-in method)
     */

    public static void powerDemo() {
        Scanner console = new Scanner(System.in);

        int base;
        int power;
        int result = 1;

        System.out.print("Enter the base number ");
        base = console.nextInt();

        System.out.print("Enter the power ");
        power = console.nextInt();

        for (int i = 1; i <= power; i++) {
            result *= base;
        }
<<<<<<< HEAD
=======
<<<<<<< HEAD:src/main/java/computer_science_basics/homework_2/solutions/Task3Solutions.java

=======
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61:src/main/java/computer_science_basics/homework_2/Armine_Sargsyan/Task3.java
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61
        System.out.println("Result: " + result);
    }

     /* TODO: Question 5
         Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
         For example, if the input is 12345, the output should be 54321.
     */

    public static void reverseNumber() {
        Scanner console = new Scanner(System.in);

        int number;
        int reverse = 0;

        System.out.print("Enter the number ");
        number = console.nextInt();

<<<<<<< HEAD
        for (; number != 0; number /= 10) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
=======
<<<<<<< HEAD:src/main/java/computer_science_basics/homework_2/solutions/Task3Solutions.java
        int temp = number;
        int remainder = 0;

        while (temp > 0) {
            remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp /= 10;
=======
        for (; number != 0; number /= 10) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61:src/main/java/computer_science_basics/homework_2/Armine_Sargsyan/Task3.java
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61
        }

        System.out.println("Reverse of " + number + " is " + reverse);
    }

    /* TODO: Question 6
         Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
    */

    public static void readSetIntegers() {
        Scanner console = new Scanner(System.in);

        int number;
        char choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.print("Enter the number ");
            number = console.nextInt();

            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }

            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }

    /* TODO: Question 7
        Write a program that prompts the user to input a positive integer.
        It should then output a message indicating whether the number is a prime number.
    */
    public static void testPrime() {
        Scanner console = new Scanner(System.in);

        int number;

        System.out.print("Enter the positive integer ");
        number = console.nextInt();

<<<<<<< HEAD
=======
<<<<<<< HEAD:src/main/java/computer_science_basics/homework_2/solutions/Task3Solutions.java
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61
        boolean flag = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                flag = false;
                break;
            }
        }

        if (flag && number > 1) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }

<<<<<<< HEAD
    }




=======
=======
        int m, flag = 0;
        m = number / 2;
        if (number == 0 || number == 1) {
            System.out.println(number + " is not prime number");
        } else {
            for (int i = 2; i <= m; i++) {
                if (number % i == 0) {
                    System.out.println(number + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(number + " is prime number");
            }
        }
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61:src/main/java/computer_science_basics/homework_2/Armine_Sargsyan/Task3.java
    }


>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61
    /* TODO: Question 8
        Write a program to calculate HCF of Two given number.
    */
    public static void FindHcf() {
        Scanner console = new Scanner(System.in);

        int dividend, divisor;
        int remainder, hcf = 0;
<<<<<<< HEAD
        System.out.print("Enter the first number ");
        dividend = console.nextInt();
        System.out.print("Enter the second number ");
        divisor = console.nextInt();

=======

        System.out.print("Enter the first number ");
        dividend = console.nextInt();

        System.out.print("Enter the second number ");
        divisor = console.nextInt();

<<<<<<< HEAD:src/main/java/computer_science_basics/homework_2/solutions/Task3Solutions.java
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61
        do {
            remainder = dividend % divisor;

            if (remainder == 0) {
                hcf = divisor;
            } else {
                dividend = divisor;
                divisor = remainder;
            }
<<<<<<< HEAD
        } while (remainder != 0);

        System.out.print("Enter the first number ");
        dividend = console.nextInt();

        System.out.print("Enter the second number ");
        divisor = console.nextInt();

=======

        } while (remainder != 0);
=======
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61
        for (remainder = 1; remainder <= dividend || remainder <= divisor; remainder++) {
            if (dividend % remainder == 0 && divisor % remainder == 0)
                hcf = remainder;
        }
<<<<<<< HEAD
=======
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61:src/main/java/computer_science_basics/homework_2/Armine_Sargsyan/Task3.java
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61

        System.out.println("HCF: " + hcf);
    }


    /* TODO: Question 9
        Write a do-while loop that asks the user to enter two numbers.
        The numbers should be added and the sum displayed.
        The loop should ask the user whether he or she wishes to perform the operation again.
        If so, the loop should repeat; otherwise it should terminate.
    */

    public static void sumAgain() {
        Scanner console = new Scanner(System.in);

        int number1, number2;
        char choice;

        do {
<<<<<<< HEAD
=======
<<<<<<< HEAD:src/main/java/computer_science_basics/homework_2/solutions/Task3Solutions.java
            System.out.print("Enter the first number ");
            number1 = console.nextInt();

            System.out.print("Enter the second number ");
            number2 = console.nextInt();

            int sum = number1 + number2;
            System.out.println("Sum of numbers: " + sum);

            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);

            System.out.println();

=======
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61
            System.out.println("Enter the first number:");
            number1 = console.nextInt();
            System.out.println("Enter the second number: ");
            number2 = console.nextInt();
            System.out.println("Sum of " + number1 + " and " + number2 + " is equal to " + (number1 + number2));
            System.out.println("Do you want to continue? y/n");
            choice = console.next().charAt(0);

<<<<<<< HEAD
=======
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61:src/main/java/computer_science_basics/homework_2/Armine_Sargsyan/Task3.java
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61
        } while (choice == 'y' || choice == 'Y');
    }


    /* TODO: Question 10
        Write a program to enter the numbers till the user wants and at the end it should display the count of positive,
        negative and zeros entered.
    */

    public static void countNumbers() {
        Scanner console = new Scanner(System.in);

        int number,
                countPositive = 0,
                countNegative = 0,
                countZero = 0;

        char choice;

        do {
<<<<<<< HEAD
=======
<<<<<<< HEAD:src/main/java/computer_science_basics/homework_2/solutions/Task3Solutions.java
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61
            System.out.print("Enter the number ");
            number = console.nextInt();

            if (number > 0) {
                countPositive++;
            } else if (number < 0) {
                countNegative++;
            } else {
                countZero++;
<<<<<<< HEAD
=======
=======
            System.out.print("Enter the number: ");
            number = console.nextInt();

            if (number > 0) {
                countPositive += 1;
            } else if (number < 0) {
                countNegative += 1;
            } else {
                countZero += 1;
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61:src/main/java/computer_science_basics/homework_2/Armine_Sargsyan/Task3.java
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61
            }

            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);

<<<<<<< HEAD
        } while (choice == 'y' || choice == 'Y');
=======
<<<<<<< HEAD:src/main/java/computer_science_basics/homework_2/solutions/Task3Solutions.java
        } while (choice == 'y' || choice == 'Y');
=======
        } while (choice == 'y' || choice == 'N');
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61:src/main/java/computer_science_basics/homework_2/Armine_Sargsyan/Task3.java
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61

        System.out.println("Positive numbers: " + countPositive);
        System.out.println("Negative numbers: " + countNegative);
        System.out.println("Zero numbers: " + countZero);
    }


<<<<<<< HEAD

     /* TODO: Question 11
         Write a program to enter the numbers till the user wants and
         at the end the program should display the largest and smallest numbers entered.
     */
=======
     /* TODO: Question 11
         Write a program to enter the numbers till the user wants and
         at the end the program should display the largest and smallest numbers entered.
    */
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61

    public static void findMaxMin() {
        Scanner console = new Scanner(System.in);

        int number;
        int max = Integer.MIN_VALUE;  // Intialize max with minimum value
        int min = Integer.MAX_VALUE;  // Intialize min with maximum value

        char choice;

        do {
<<<<<<< HEAD
            System.out.print("Enter the number: ");
=======
<<<<<<< HEAD:src/main/java/computer_science_basics/homework_2/solutions/Task3Solutions.java
            System.out.print("Enter the number ");
=======
            System.out.print("Enter the number: ");
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61:src/main/java/computer_science_basics/homework_2/Armine_Sargsyan/Task3.java
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61
            number = console.nextInt();

            if (number > max) {
                max = number;
<<<<<<< HEAD
            } else if (number < min) {
=======
<<<<<<< HEAD:src/main/java/computer_science_basics/homework_2/solutions/Task3Solutions.java
            }

            if (number < min) {
=======
            } else if (number < min) {
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61:src/main/java/computer_science_basics/homework_2/Armine_Sargsyan/Task3.java
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61
                min = number;
            }

            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
    }


    /* TODO: Question 12
        Write a program to print out all Armstrong numbers between 1 and 500.
        If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
        For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
    */
    public static void armstrongNumber() {
        int digit1,  // To hold first digit (Ones) of number
                digit2,  // To hold second digit (Tens) of number
<<<<<<< HEAD
=======
<<<<<<< HEAD:src/main/java/computer_science_basics/homework_2/solutions/Task3Solutions.java
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61
                digit3;  // To hold third digit (Hundreds) of number

        for (int number = 1; number <= 500; number++) {
            int temp = number;
            digit1 = temp % 10;

            temp = temp / 10;
            digit2 = temp % 10;

            temp = temp / 10;
            digit3 = temp % 10;

            if (digit1 * digit1 * digit1 + digit2 * digit2 * digit2 + digit3 * digit3 * digit3 == number) {
                System.out.println(number);
            }
<<<<<<< HEAD
=======
=======
                   digit3;  // To hold third digit (Hundreds) of number
        int i=1,n,armstrong;
        System.out.println("Armstrong numbers between 1 to 500 are ");
        while(i<500){
            n=i;
            armstrong  = 0;
            while (n > 0){

           //   Another version
                digit1 = digit2 = digit3 = n%10 ;
                armstrong = armstrong + digit1*digit2*digit3;
                n=n/10;
            }
            if (armstrong==i)
                System.out.println(i);
                i++;
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61:src/main/java/computer_science_basics/homework_2/Armine_Sargsyan/Task3.java
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61
        }
    }


    /* TODO: Question 13
        Write a program to print Fibonacci series of n terms where n is input by user :
        0 1 1 2 3 5 8 13 24 .....
    */
    public static void fibonacciSeries() {
        Scanner console = new Scanner(System.in);

        int number;  // To hold number of terms

        int firstTerm = 0,
                secondTerm = 1,
                thirdTerm;

        System.out.print("Enter number of terms of series : ");
        number = console.nextInt();

        System.out.print(firstTerm + " " + secondTerm + " ");

<<<<<<< HEAD
        for (int i = 3; i < number; i++) {
=======
<<<<<<< HEAD:src/main/java/computer_science_basics/homework_2/solutions/Task3Solutions.java
        for (int i = 3; i <= number; i++) {
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61
            thirdTerm = firstTerm + secondTerm;
            System.out.print(thirdTerm + " ");
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
<<<<<<< HEAD

        }
    }

=======
=======
            for(int i =  2; i < number; i++) {
                thirdTerm = firstTerm + secondTerm;
                    System.out.print(thirdTerm + " ");
                firstTerm = secondTerm;
                secondTerm = thirdTerm;
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61:src/main/java/computer_science_basics/homework_2/Armine_Sargsyan/Task3.java
        }
    }


>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61
    /* TODO: Question 14
        Write a program to calculate the sum of following series where n is input by user.
        1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
    */
<<<<<<< HEAD
    public static void SumOfSeries () {
=======
    public static void SumOfSeries() {
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61
        Scanner console = new Scanner(System.in);

        int number;  // To hold number of terms

        double sum = 0;

        System.out.print("Enter number of terms of series : ");
        number = console.nextInt();

<<<<<<< HEAD
=======
<<<<<<< HEAD:src/main/java/computer_science_basics/homework_2/solutions/Task3Solutions.java
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61
        for (int i = 1; i <= number; i++) {
            sum += 1.0 / i;
        }

<<<<<<< HEAD
=======
=======
            for (int i = 1; i < number; i++){
                sum = sum + 1/number;
            }
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61:src/main/java/computer_science_basics/homework_2/Armine_Sargsyan/Task3.java
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61
        System.out.println("sum: " + sum);
    }


    /* TODO: Question 15
         Write a program that generates a random number and asks the user to guess what the number is.
         If the user's guess is higher than the random number, the program should display "Too high, try again."
         If the user's guess is lower than the random number, the program should display "Too low, try again."
         The program should use a loop that repeats until the user correctly guesses the random number.
    */
    public static void guessMyNumber() {
        Scanner console = new Scanner(System.in);

        int number, // To hold the random number
                guess,  // To hold the number guessed by user
                tries = 0; // To hold number of tries

        number = (int) (Math.random() * 100) + 1; // get random number between 1 and 100

        System.out.println("Guess My Number Game");
        System.out.println();

<<<<<<< HEAD
        do {
            System.out.print("Enter a guess between 1 and 100 : ");
            guess = console.nextInt();
=======
<<<<<<< HEAD:src/main/java/computer_science_basics/homework_2/solutions/Task3Solutions.java
        do {
            System.out.print("Enter a guess between 1 and 100 : ");
            guess = console.nextInt();
=======
            Random random = new Random();
            number = random.nextInt(22);
            System.out.println("Enter a number up to 22");
            guess = console.nextInt();
            tries++;
            while (guess != number) {
                if (guess > number) {
                    System.out.println("Too high, try again.");
                } else {
                    System.out.println("Too low, try again.");
                }
                guess = console.nextInt();
                tries++;
            }
            System.out.println("You could guess the number in " + tries + " tries");
            }
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61:src/main/java/computer_science_basics/homework_2/Armine_Sargsyan/Task3.java
>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61

            tries++;

            if (guess > number) {
                System.out.println("Too high! Try Again");
            } else if (guess < number) {
                System.out.println("Too low! Try Again");
            } else {
                System.out.println("Correct! You got it in " + tries + " guesses!");
            }

        } while (guess != number);
    }
}
<<<<<<< HEAD
=======

>>>>>>> 4814ec835e465713c58d4c5b744997fb5b251e61
