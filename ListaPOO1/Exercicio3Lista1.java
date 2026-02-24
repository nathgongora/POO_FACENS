package com.mycompany.exercicio3lista1;

import java.util.Scanner;

public class Exercicio3Lista1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite o primeiro numero: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2 = sc.nextDouble();

        if (num1 > num2) {
            System.out.println("O primeiro numero e maior que o segundo.");
        } else {
            System.out.println("O primeiro numero NAO é maior que o segundo.");
        }
    }
}
