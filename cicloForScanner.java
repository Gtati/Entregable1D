package Repaso;

import java.util.Scanner;

public class cicloForScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int num =  scanner.nextInt();
        for (int i = 1; i <= 10 ; i++) {
             System.out.println(num + " x " + i + " = " + (num*i));
        }
        }

    }

