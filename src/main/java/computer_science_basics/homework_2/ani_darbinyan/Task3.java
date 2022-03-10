package computer_science_basics.homework_2.ani_darbinyan;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task3 {

    /* TODO: Question 1
        Write a program to print numbers from 1 to given parameter.
    */
    public static void printNumbers(int count) {
        for (int i = 1; i <= count; i++){
            System.out.println(i);
        }
    }

    /* TODO: Question 2
        Write a program to calculate the sum of first 10 natural numbers.
    */
    public static void sumNumbers() {
        int sum = 0;
        for(int i = 1; i <= 10; i++){
            sum += i;
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

        for(int i = 1; i <= 9; i++){
            System.out.println(num + " * " + i + " = " + num * i);
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

        for(int i = 1; i <= num; i++){
            fact *= i;
        }

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

        if(power != 0){
            for(int i = 1; i <= power; i++){
                result *= base;
            }
        }

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

        String reversed = "";
        String s = Integer.toString(number);
        for (int i = s.length() - 1; i >= 0; i--){
            reversed += s.charAt(i);
        }
        reverse = Integer.parseInt(reversed);


//        while (number != 0){
//            int digit = number % 10;
//            reverse = reverse * 10 +digit;
//            number /= 10;
//        }

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

            if(number % 2 == 0){
                evenSum += number;
            }else{
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

        boolean flag = false;
        for (int i = 2; i <= number / 2; ++i) {
            if (number % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag){
            System.out.println("Given number: " + number +  " is a Prime.");
        } else{
            System.out.println("Given number: " + number + " is not Prime");
        }
    }


    /* TODO: Question 8
        Write a program to calculate HCF of Two given number.
    */
    public static void FindHcf() {
        Scanner console = new Scanner(System.in);

        int dividend, divisor;
        int remainder, hcf = 0;

        System.out.print("Enter the first number ");
        dividend = console.nextInt();

        System.out.print("Enter the second number ");
        divisor = console.nextInt();

        for(int i = 1; i <= dividend || i <= divisor; i++) {
            if( dividend % i == 0 && divisor % i == 0 )
                hcf = i;
        }

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

        do{
            System.out.print("Enter the first number ");
            number1 = console.nextInt();

            System.out.print("Enter the second number ");
            number2 = console.nextInt();

            System.out.println("Sum of iven numbers is " + (number1 + number2));

            System.out.println("Do you want to continue y/n? ");
            choice = console.next().charAt(0);

        }while (choice == 'y' | choice == 'Y');
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

        do{
            System.out.print("Enter the number ");
            number = console.nextInt();

            if(number == 0){
                countZero++;
            }else if(number > 0){
                countPositive++;
            }else{
                countNegative++;
            }

            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);

        }while (choice == 'y' | choice == 'Y');

        System.out.println("Positive numbers: " + countPositive);
        System.out.println("Negative numbers: " + countNegative);
        System.out.println("Zero numbers: " + countZero);
    }


     /* TODO: Question 11
         Write a program to enter the numbers till the user wants and
         at the end the program should display the largest and smallest numbers entered.
     */

    public static void findMaxMin() {
        Scanner console = new Scanner(System.in);

        int number;
        int max = Integer.MIN_VALUE;  // Intialize max with minimum value
        int min = Integer.MAX_VALUE;  // Intialize min with maximum value

        char choice;
        List<Integer> array = new ArrayList<Integer>();

        do{
            System.out.print("Enter the number ");
            number = console.nextInt();
            array.add(number);

            System.out.print("Do you want to continue y/n? ");
            choice = console.next().charAt(0);

        }while (choice == 'y' || choice == 'Y');

        for(int i = 0; i < array.size(); i++){
            if(max < array.get(i)){
                max = array.get(i);
            }

            if(min > array.get(i)){
                min = array.get(i);
            }
        }

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

        for (int i = 1; i <= number; ++i) {
            System.out.print(firstTerm + ", ");

            thirdTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }
    }


    /* TODO: Question 14
        Write a program to calculate the sum of following series where n is input by user.
        1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
    */
    public static void SumOfSeries() {
        Scanner console = new Scanner(System.in);

        int number;  // To hold number of terms

        double sum = 0;

        System.out.print("Enter number of terms of series : ");
        number = console.nextInt();

        for(int i = 1; i <= number; i++){
            sum = sum + 1/i;
        }

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

        System.out.println("Guess My Number Game");
        System.out.println();

        Random random = new Random();
        int x = random.nextInt(500);

        do{
            System.out.print("Enter the number ");
            number = console.nextInt();

            if(number > x){
                System.out.println("Too high, try again.");
            }
            if(number < x){
                System.out.println("Too low, try again.");
            }
//            System.out.println("random number is " + x);
        }while (number != x);

        System.out.println("Congratulations!");
    }

}

