package week1.day1;

import java.util.Scanner;


public class Calculator {
	
	public static void main(String[]args) {
	char operator;
    int num1, num2, num3, result;
    Scanner input = new Scanner(System.in);
    System.out.println("choose an operator: +, -, * or /");
    operator = input.next().charAt(0);
    System.out.println("enter first num");
    num1 = input.nextInt();
    System.out.println("enter second num");
    num2 = input.nextInt();
    System.out.println("enter third num");
    num3 = input.nextInt();
        switch(operator) {
          case '+':
            result = num1 + num2 + num3;
            System.out.println("sum of 3 numbers is :"+result);
            break;
             case '-':
            result = num1 - num2;
            System.out.println("subtraction of 2 numbers is :"+result);
            break;
            case '*':
            result = num1 * num2;
            System.out.println("multiplication of 2 numbers is :"+result);
            break;
            case '/':
            result = num1 / num2;
            System.out.println("division of 2 numbers is :"+result);
            break;
            }

        input.close();
      }
    }
    		
		
