import java.util.Scanner;

public class Calculator {

    public void responses(){

        System.out.print("Enter a first number: ");

        Scanner first = new Scanner(System.in);

        int first_response = Integer.parseInt(first.nextLine());

        System.out.print("Enter +, -, *, /: ");

        Scanner parameter = new Scanner(System.in);

        String function = parameter.next();

        System.out.print("Enter a second number: ");

        Scanner second = new Scanner(System.in);

        int second_response = Integer.parseInt(second.nextLine());

        //TODO: Find disconnect of input from "if" statements
        if(function.equals("+")){
            System.out.println("Your total is: " + (first_response + second_response));
        }

        if(function.equals("-")){
            System.out.println("Your total is: " + (first_response - second_response));
        }

        if(function.equals("*")){
            System.out.println("Your total is: " + (first_response * second_response));
        }

        if(function.equals("/")){
            System.out.println("Your total is: " + (first_response / second_response));
        }
    }

    public static void main(String[] args){

        Calculator Calculator = new Calculator();

        Calculator.responses();
    }
}
