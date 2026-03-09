//Escreva uma classe que receberá como parâmetro três números inteiros para ordenar. Crie uma classe
//com método main que instancie a classe Ordena, receba três números inteiros e exiba o resultado da
//execução do objeto ordena.

package com.mycompany.exercicio4lista2;

import java.util.Scanner;

public class Exercicio4Lista2 {
    
    public static void ordenar(int a, int b, int c){

    if (a <= b && a <= c) {
        if (b <= c)
            System.out.println(a + " " + b + " " + c);
        else
            System.out.println(a + " " + c + " " + b);
    }

    else if (b <= a && b <= c) {
        if (a <= c)
            System.out.println(b + " " + a + " " + c);
        else
            System.out.println(b + " " + c + " " + a);
    }

    else {
        if (a <= b)
            System.out.println(c + " " + a + " " + b);
        else
            System.out.println(c + " " + b + " " + a);
    }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int num1, num2, num3;

        System.out.println("Digite o primeiro numero:");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo numero:");
        num2 = sc.nextInt();

        System.out.println("Digite o terceiro numero:");
        num3 = sc.nextInt();
        
        ordenar(num1, num2, num3);
    }
}