package com.epam.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calc {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input first number: ");
        int one = Integer.parseInt(reader.readLine());
        System.out.print("Input second number: ");
        int two = Integer.parseInt(reader.readLine());
        System.out.print("Input any sign (+, -, *, /): ");
        String sign = reader.readLine();
        System.out.println("Result = " + Calculation(one, two, sign));
    }

    public static double Calculation(int a, int b, String s){
        double result = 0;
        if (s.equals("+")) {
            result = a + b;
        } else if (s.equals("-")){
            result = a - b;
        } else if (s.equals("*")){
            result = a * b;
        } else if (s.equals("/")){
            result = a / b;
        }
        return result;
    }
}
