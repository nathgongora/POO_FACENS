//Construa uma classe utilizando método que verifique se um dado número é divisível por outro.
//Ambos devem ser fornecidos pelo usuário.

package com.mycompany.exercicio7lista2;

import java.util.Scanner;

public class Exercicio7Lista2 {

    public static void verificar(int num1, int num2){

        if(num2 == 0){
            System.out.println("Não e possível dividir por zero");
        }else if(num1 % num2 == 0){
            System.out.println("O numero " + num1 + " e divisivel por " + num2);
        }else {
            System.out.println("O numero " + num1 + " nao e divisivel por " + num2);
        } 
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.println("Digite o primeiro numero:");
        num1 = sc.nextInt();

        System.out.println("Digite o segundo numero:");
        num2 = sc.nextInt();

        verificar(num1, num2);
    }
}
