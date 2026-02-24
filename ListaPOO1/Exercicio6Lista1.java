
package com.mycompany.exercicio6lista1;

import java.util.Scanner;

public class Exercicio6Lista1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite o seu sexo (M para Masculino ou F para Feminino): ");
        char sexo = sc.next().charAt(0);

        if (sexo == 'F' || sexo == 'f') {
            System.out.println("Ilmo. Sra. " + nome);
        } else if (sexo == 'M' || sexo == 'm') {
            System.out.println("Ilmo. Sr. " + nome);
        } else {
            System.out.println("Sexo invalido.");
        }

    }
}
