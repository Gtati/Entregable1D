package Repaso;

import java.util.Scanner;

public class cicloWhileScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        int num = scanner.nextInt();
        int i = 1;
        while(i<=10){
            System.out.println(num + " x " + i + " = " + (num*i));
            i++;
        }
    }
}
