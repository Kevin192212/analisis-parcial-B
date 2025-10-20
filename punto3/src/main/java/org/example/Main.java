package org.example;
import java.util.Scanner;

public class Main {

    // Función para verificar si un número es primo
    public static boolean esPrimo(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        int limite = (int) Math.sqrt(n);
        for (int i = 3; i <= limite; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Función principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de intervalos N: ");
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese los valores a y b: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            int contadorPrimos = 0;
            for (int num = a; num <= b; num++) {
                if (esPrimo(num)) {
                    contadorPrimos++;
                }
            }

            System.out.println("Cantidad de primos en [" + a + ", " + b + "]: " + contadorPrimos);
        }

        sc.close();
    }
}
