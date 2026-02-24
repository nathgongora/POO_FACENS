
package com.mycompany.exercicio2lista1;

import java.util.Scanner;

public class Exercicio2Lista1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int opcaoDiasDaSemana = 0;
        
        System.out.println("Bem vindo ao Calendario");
        System.out.println("Escolha uma das seguintes opcoes");
        System.out.println("1 - Domingo; 2 - Segunda; 3 - Terca; 4 - Quarta; 5 - Quinta; 6 - Sexta; 7 - Sabado");
        System.out.println("Digite aqui a sua escolha: ");
        opcaoDiasDaSemana = sc.nextInt();
        
        switch (opcaoDiasDaSemana) {
            case 1:
                System.out.println("Esse numero corresponde a: Domingo");
                break;
            
            case 2:
                System.out.println("Esse numero corresponde a: Segunda");
                break;
                
            case 3:
                System.out.println("Esse numero corresponde a: Terca");
                break;
            
            case 4:
                System.out.println("Esse numero corresponde a: Quarta");
                break;
                
            case 5:
                System.out.println("Esse numero corresponde a: Quinta");
                break;
            
            case 6:
                System.out.println("Esse numero corresponde a: Sexta");
                break;
             
            case 7:
                System.out.println("Esse numero corresponde a: Sabado");
                break;
                
            default:
                System.out.println ("ERRO - Dia Invalido");
        }
    }
}
