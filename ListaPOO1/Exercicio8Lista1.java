
package com.mycompany.exercicio8lista1;

import java.util.Scanner;

public class Exercicio8Lista1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num2 = sc.nextInt();

        int inicio;
        int fim;

        if (num1 < num2) {
            inicio = num1;
            fim = num2;
        } else {
            inicio = num2;
            fim = num1;
        }
        
        System.out.println("Numeros pares no intervalo:");

        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
