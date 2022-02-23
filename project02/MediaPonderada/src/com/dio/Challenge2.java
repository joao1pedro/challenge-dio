package com.dio;

import java.io.IOException;
import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int num, par;
        num = scanner.nextInt();

        scanner.close();

        for (int i = 1; i <= num; i++) {
            if(i%2 == 0) {
                par = i;
                System.out.println(par);
            }
        }
    }
}
