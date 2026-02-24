/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio10lista1;

import java.util.Scanner;

public class Exercicio10Lista1 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        String[] nomes = new String[10];

        // Ler os 10 nomes
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
        }

        System.out.print("Digite um numero de 1 a 10 para sortear: ");
        int numero = sc.nextInt();

        if (numero >= 1 && numero <= 10) {
            System.out.println("O ganhador e: " + nomes[numero - 1]);
        } else {
            System.out.println("Numero invalido.");
        }

    }
}
