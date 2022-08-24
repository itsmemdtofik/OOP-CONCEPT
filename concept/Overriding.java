
/**
 * !Overriding : 
 * In any object-oriented programming language, Overriding is a feature that allows 
 * a subclass or child class to provide a specific implementation of
 * a method that is already provided by one of its super-classes or parent classes.
 * * In overriding method and return type are same and argument also same.
 * * Overriding uses inheritance concept while overloading also  use inheritance concept. 
 */

import java.util.*;

class parent{

    void Display(){

        System.out.println("This is Base class");
    }
}

class child extends parent{

    @Override
    void Display(){

        System.out.println("This is child class");
    }
}

class Math {
    private int a;
    private int b;

    void add() {
        System.out.println("The Addition is : " + (a + b));
    }

    void sub() {
        System.out.println("The Subtraction is : " + (a - b));
    }

    void mul() {
        System.out.println("The Multiplication is : " + (a * b));
    }

    void div() {
        System.out.println("The Division is : " + (a / b));
        System.out.println("The     Againg Subtraction : " + (a - b));
    }
}

class MathOfMath extends Math {

    void add(int a, int b) {
        System.out.println("Addition is : " + (a + b));
    }

    void sub(int a, int b) {
        System.out.println("Subtraction is : " + (a - b));
    }

    void mul(int a, int b) {
        System.out.println("Multiplication is : " + (a * b));
    }

    void div(int a, int b) {
        System.out.println("Division is : " + (a / b));
    }

}

public class Overriding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------------------------");
        System.out.print("Enter first number : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number : ");
        int num2 = scanner.nextInt();
        System.out.println("------------------------------------------------");
        MathOfMath mth = new MathOfMath();
        mth.add(num1, num2);
        mth.sub(num1, num2);
        mth.mul(num1, num2);
        mth.div(num1, num2);
        System.out.println("------------------------------------------------");

        parent ob1 = new parent();
        ob1.Display();

        parent ob2 = new child();
        ob2.Display();

    }
}
