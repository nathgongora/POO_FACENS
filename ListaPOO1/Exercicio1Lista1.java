package com.mycompany.exercicio1lista1;

import java.util.Scanner;

public class Exercicio1Lista1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double nota1; double nota2; double nota3; double nota4; 
       
        System.out.println("Digite o valor da sua nota no primeiro bimestre:");
        nota1 = sc.nextDouble();
        System.out.println("Digite o valor da sua nota no segundo bimestre:");
        nota2 = sc.nextDouble();
        System.out.println("Digite o valor da sua nota no terceiro bimestre:");
        nota3 = sc.nextDouble();
        System.out.println("Digite o valor da sua nota no quarto bimestre:");
        nota4 = sc.nextDouble();
        
         double soma = nota1 + nota2 + nota3 + nota4; 
         double media = soma/4;
         
        System.out.println("A soma das suas notas e: " + soma);
        System.out.println("Sendo assim, sua media e: " + media);
    }
}
