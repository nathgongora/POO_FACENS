//Elabore uma classe utilizando métodos que seja capaz de fazer as quatro operações matemáticas
//básicas. Crie uma classe com método main que instancie a classe Matematica, receba dois
//números inteiros, e qual operação a ser executada e exiba o resultado da execução do objeto
//matematica.

package com.mycompany.exercicio1lista2;

import java.util.Scanner;

public class Exercicio1Lista2 {
    
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
                
            default:
                System.out.println("Operação inválida");
                return;
        }
        
        System.out.println("O Resultado e: " + resultado);
    }
}
