//Escreva uma classe utilizando métodos para resolver as seguintes situações:
//a) preencher uma matriz A com dimensões 5 x 5;
//b) ordenar os elementos da matriz A;
//c) gerar uma matriz somente com os números pares da matriz A;
//d) gerar uma matriz somente com os números múltiplos de 5;
//e) criar um menu para acessar os itens anteriores.

package com.mycompany.exercicio5lista2;

import java.util.Scanner;

public class Exercicio5Lista2 {
  
    // a) preencher matriz
    public static void preencher(int A[][]) {
       
        Scanner sc = new Scanner (System.in);
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Digite um numero:");
                A[i][j] = sc.nextInt();
            }
        }
    }
    
    // b) mostrar matriz
    public static void mostrar(int A[][]) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
    // c) numeros pares
    public static void pares(int A[][]) {

        System.out.println("Numeros pares:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (A[i][j] % 2 == 0) {

                    System.out.print(A[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    // d) multiplos de 5
    public static void multiplos5(int A[][]) {

        System.out.println("Multiplos de 5:");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (A[i][j] % 5 == 0) {
                    System.out.print(A[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int A[][] = new int[5][5];

        int opcao;

        System.out.println("Menu de Opcoes:");
        System.out.println("1 - Preencher matriz");
        System.out.println("2 - Mostrar matriz");
        System.out.println("3 - Mostrar pares");
        System.out.println("4 - Multiplos de 5");
        System.out.println("Digite a sua Escolha:");

        opcao = sc.nextInt();

        switch (opcao) {

            case 1:
                preencher(A);
                break;

            case 2:
                mostrar(A);
                break;

            case 3:
                pares(A);
                break;

            case 4:
                multiplos5(A);
                break;
        }
    }
}