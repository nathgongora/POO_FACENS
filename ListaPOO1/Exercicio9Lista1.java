
package com.mycompany.exercicio9lista1;

import java.util.Scanner;

public class Exercicio9Lista1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nesse sistema calcularemos o fatorial de um numero qualquer e te mostraremos o resultado!");
        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();

        int resultado = 1;
        int i = numero;

        while (i > 1) {
            resultado = resultado * i;
            i--;
        }

        System.out.println(numero + "! = " + resultado);
    }
}
