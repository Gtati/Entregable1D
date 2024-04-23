package Repaso;

import java.util.Scanner;

public class CicloDoWhileScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int num = scanner.nextInt();
        int i= 1;
        do {
            System.out.println(num + " x " + i + " = " + (num*i));
            i++;
        }while(i<=10);
    }
}
