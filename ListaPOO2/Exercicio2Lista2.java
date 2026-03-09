//Modifique a classe Matematica, criando um método para calcular a potenciação entre dois números.
//Para a implementação utilize a estrutura de repetição for para calcular o resultado da potênciação.
//Modifique a classe com método main para que o método potenciacao possa ser executado como uma
//das operações anteriores.

package com.mycompany.exercicio2lista2;

import java.util.Scanner;

public class Exercicio2Lista2 {
    
    public static int Somar (int a, int b){
        return a + b; 
    }
    
    public static int Multiplicar (int a, int b){
        return a * b;
    }
    
    public static int Subtrair (int a, int b){
        return a - b;
    }
    
    public static int Dividir (int a, int b){
        return a / b;
    }
    
    public static int Potencia (int base, int expoente){
        int resultado = 1;
        
        for (int i = 0; i < expoente; i++) {
            resultado = resultado * base;
        }
        return resultado;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int num1; int num2; int operacao; int resultado;
               
        System.out.println("Digite o primeiro numero:");
        num1 = sc.nextInt();
        
        System.out.println("Digite o segundo numero:");
        num2 = sc.nextInt();
        
        System.out.println("Escolha a operacao:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");
        System.out.println("5 - Potencia");
        System.out.println("Digite sua Escolha:");
        
        operacao = sc.nextInt();
        
        switch (operacao) {
            case 1:
                resultado = Somar(num1, num2);
                break;
            
            case 2:
                resultado = Subtrair(num1, num2);
                break;
                
            case 3:
                resultado = Multiplicar(num1, num2);
                break;
                
            case 4:
                resultado = Dividir(num1, num2);
                break;
                
            case 5:
                resultado = Potencia(num1, num2);
                break;
                
            default:
                System.out.println("Operação inválida");
                return;
        }
        
        System.out.println("O Resultado e: " + resultado);
    }
}
