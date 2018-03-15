/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculartor;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Calculator {
    public static void main(String[] args) {
        int a, b;
        char c;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number a: ");
        a = scanner.nextInt();
        System.out.println("Enter number b: ");
        b = scanner.nextInt();
        
        System.out.println("Enter calculator (+, -, *, /): ");
        c = scanner.next().charAt(0);
        
        switch(c){
            case '+':
                System.out.println(a + " + "+ b +" = "+(a+b));
                break;
            case '-':
                System.out.println(a+" - "+ b + " = "+(a-b));
                break;
            case '*':
                System.out.println(a+ " * " + b + " = "+ (a*b));
                break;
            case '/':
                if (b == 0) {
                     System.out.println("Number b # 0");
                }else{
                    System.out.println(a + " / " + b +" = "+(float) a/b);
                }
                break;
        }
    }
}
