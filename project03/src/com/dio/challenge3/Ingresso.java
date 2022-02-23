package com.dio.challenge3;

import java.util.Scanner;
import java.io.IOException;

public class Ingresso {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        
        double diff = B - A;
        double x;

        leitor.close();

        if(A > 0.00 && B<=1000.00){
            x = (diff/A) * 100;
            System.out.printf("%.2f%%", x);
        } else 
            System.out.printf("%.2f%%", 0.00);
    }
}
