
package com.mycompany.exercicio7lista1;

import java.util.Scanner;

public class Exercicio7Lista1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a idade da primeira pessoa: ");
        int idade1 = sc.nextInt();

        System.out.print("Digite a idade da segunda pessoa: ");
        int idade2 = sc.nextInt();

        System.out.print("Digite a idade da terceira pessoa: ");
        int idade3 = sc.nextInt();

        int soma = 0;
        int qtd = 0;

        if (idade1 >= 18) {
            soma += idade1;
            qtd++;
        }

        if (idade2 >= 18) {
            soma += idade2;
            qtd++;
        }

        if (idade3 >= 18) {
            soma += idade3;
            qtd++;
        }

        if (qtd > 0) {
            System.out.println("Media: " + (soma / qtd));
        } else {
            System.out.println("Nenhum maior de idade.");
        }

    }
}
