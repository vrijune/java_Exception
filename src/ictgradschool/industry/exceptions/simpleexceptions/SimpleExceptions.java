package ictgradschool.industry.exceptions.simpleexceptions;

import ictgradschool.Keyboard;

import java.security.Key;
import java.util.Scanner;


public class SimpleExceptions {
    public static void main(String[] args) {
        SimpleExceptions exceptions = new SimpleExceptions();

//        exceptions.handlingException();

    //Question3
//    exceptions.Question3();

    //Question4
    exceptions.Question4();
}

    /**
     * The following tries to divide using two user input numbers, but is
     * prone to error.
     */
    public void handlingException() {
        Scanner sc = new Scanner(System.in);


        try {
            System.out.print("Enter the first number: ");

            String str1 = sc.next();
            int num1 = Integer.parseInt(str1);
            System.out.print("Enter the second number: ");
            String str2 = sc.next();
            int num2 = Integer.parseInt(str2);
            int num3 = num1 / num2;
            // Output the result
            System.out.println("The division of " + num1 + " over " + num2 + " is " + (num1 / num2) + "\n");
        } catch (ArithmeticException e) {
            System.out.println("divided by 0");
        } catch (NumberFormatException e) {
            System.out.println("User Error");
        }
    }

    public void Question3() {

            String s = "Hello";
            System.out.println(s.charAt(50));

        //Write some Java code which throws a StringIndexOutOfBoundsException
    }

    public void Question4() {
            int [] numbers = {10,20,30,40};
            System.out.println(numbers[8]);






        //Write some Java code which throws a ArrayIndexOutOfBoundsException
    }
}