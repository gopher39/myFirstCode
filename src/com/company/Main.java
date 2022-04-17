package com.company;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //Температура в комнате норма
        int K = sc.nextInt(); //Текущая температура в комнате
        int X = K - N;

        if (K == N) {
            System.out.println("ТЕМПЕРАТУРА В НОРМЕ");
        } else if (K > N) {
            System.out.println("ОХЛАЖДАЮ на " + X);
        } else if (K < N) {
            System.out.println("НАГРЕВАЮ на " + -X);
        }
    }
}