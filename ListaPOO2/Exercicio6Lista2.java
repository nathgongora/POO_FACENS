//Elabore uma classe utilizando métodos que seja capaz de fazer a conversão de um valor em
//reais para o correspondente em dólares, libras, francos e ienes e vice-versa. O programa deverá
//conter um menu com as opções.

package com.mycompany.exercicio6lista2;

import java.util.Scanner;

public class Exercicio6Lista2 {

    // Reais para outras moedas
    public static double realParaDolar(double valor){
        return valor / 5.00;
    }

    public static double realParaLibra(double valor){
        return valor / 6.30;
    }

    public static double realParaFranco(double valor){
        return valor / 5.50;
    }

    public static double realParaIene(double valor){
        return valor / 0.034;
    }

    // Outras moedas para reais
    public static double dolarParaReal(double valor){
        return valor * 5.00;
    }

    public static double libraParaReal(double valor){
        return valor * 6.30;
    }

    public static double francoParaReal(double valor){
        return valor * 5.50;
    }

    public static double ieneParaReal(double valor){
        return valor * 0.034;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao;
        double valor, resultado;

        System.out.println("MENU DE CONVERSAO");
        System.out.println("1 - Real para Dolar");
        System.out.println("2 - Real para Libra");
        System.out.println("3 - Real para Franco");
        System.out.println("4 - Real para Iene");
        System.out.println("5 - Dolar para Real");
        System.out.println("6 - Libra para Real");
        System.out.println("7 - Franco para Real");
        System.out.println("8 - Iene para Real");

        opcao = sc.nextInt();

        System.out.println("Digite o valor:");
        valor = sc.nextDouble();

        switch(opcao){

            case 1:
                resultado = realParaDolar(valor);
                break;

            case 2:
                resultado = realParaLibra(valor);
                break;

            case 3:
                resultado = realParaFranco(valor);
                break;

            case 4:
                resultado = realParaIene(valor);
                break;

            case 5:
                resultado = dolarParaReal(valor);
                break;

            case 6:
                resultado = libraParaReal(valor);
                break;

            case 7:
                resultado = francoParaReal(valor);
                break;

            case 8:
                resultado = ieneParaReal(valor);
                break;

            default:
                System.out.println("Opcao invalida");
                return;
        }

        System.out.println("Resultado: " + resultado);

    }
}
   
