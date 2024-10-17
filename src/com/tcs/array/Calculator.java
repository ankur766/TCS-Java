package com.tcs.array;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a= sc.nextInt();
        System.out.println("Enter seconnd number");
        int b=sc.nextInt();
        System.out.println("Enter operation");
        char operation=sc.next().charAt(0);
        
    //     switch (operation) {
    //         case '+': System.out.println(a+b);
    //         break;
    //         case '-':System.out.println(a-b);
    //         break;
    //         case '*':System.out.println(a*b);
    //         break;
    //         case '/':System.out.println(a/b);

    //         case '%':System.out.println(a%b);

    //         break;
    //         default:
    //         System.out.println("Not vailed  symbol");
    //     }
     if(operation=='+')
     {
        System.out.println(a+b);
     }else if(operation=='-')
     {
        System.out.println(a-b);
     }
     else if(operation=='*')
     {
        System.out.println(a*b);
     }
        else if(operation=='/')
        {
            System.out.println(a/b);
        }
        else if(operation=='%')
        {
            System.out.println(a%b);
        }
        else
        {
            System.out.println("Not vailed  symbol");
        }

    }
    
}
