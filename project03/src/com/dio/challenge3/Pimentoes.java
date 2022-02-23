package com.dio.challenge3;

import java.util.Scanner;
import java.io.IOException;

public class Pimentoes {
    public static void main(String[] args) throws IOException{
        Scanner leitor = new Scanner(System.in);
    
        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int x = a+b;

        System.out.printf("X = %d", x);
        leitor.close();
    }
}
