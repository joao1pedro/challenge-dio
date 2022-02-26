package com.dio;

import java.io.IOException;
import java.util.Scanner;

public class Project06 {
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		
        double value = leitor.nextDouble();

        System.out.println(String.format((String.valueOf(value).startsWith("-") ? "" : "+") + "%.4E", value));

        leitor.close();
    }
}
