package org.example;

import java.math.*;

public class Main {

    public static double t1(int n){
        return 5 * Math.pow(n,2) + 10 * n;
    }
    public static double t2(int n){
        return (6 * n / (Math.log(n) / Math.log(2))) + 300;
    }

    public static void compararAlgoritmos(int n){
        double t1 =  t1(n);
        double t2 =  t2(n);

        String resultado = (t1<t2)? "t1":"t2";

        System.out.println("A partir de Resultado: "+resultado+ " " + n +" es mas rapido");
    }

    public static void main(String[] args) {
        for (int n = 1; n <= 100; n++) {
            compararAlgoritmos(n);
        }
    }

}