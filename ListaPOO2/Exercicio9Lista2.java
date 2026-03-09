// Crie um programa que receba notas de listas e provas correspondentes aos critérios de
//avaliação de POO e exiba a média final do aluno. Cada critério de avaliação deve ser tratado por
//um método distinto.

package com.mycompany.exercicio9lista2;

import java.util.Scanner;

public class Exercicio9Lista2 {

    public static double ac1Lista1(double nota){
        return nota * 0.075;
    }

    public static double ac1Lista2(double nota){
        return nota * 0.075;
    }

    public static double ac2Lista1(double nota){
        return nota * 0.06;
    }

    public static double ac2Lista2(double nota){
        return nota * 0.06;
    }

    public static double ac2Lista3(double nota){
        return nota * 0.06;
    }

    public static double ac2Lista4(double nota){
        return nota * 0.06;
    }

    public static double ac2Lista5(double nota){
        return nota * 0.06;
    }

    public static double ag(double nota){
        return nota * 0.10;
    }

    public static double af1(double nota){
        return nota * 0.225;
    }

    public static double af2(double nota){
        return nota * 0.225;
    }

    public static double mediaFinal(double ac1n1,double ac1n2,double ac2n1,double ac2n2,double ac2n3,double ac2n4,double ac2n5,double ag,double af1,double af2){

        return ac1n1+ac1n2+ac2n1+ac2n2+ac2n3+ac2n4+ac2n5+ag+af1+af2;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double ac1n1,ac1n2,ac2n1,ac2n2,ac2n3,ac2n4,ac2n5,ag,af1,af2;

        System.out.println("Nota AC1 Lista 1:");
        ac1n1 = sc.nextDouble();

        System.out.println("Nota AC1 Lista 2:");
        ac1n2 = sc.nextDouble();

        System.out.println("Nota AC2 Lista 1:");
        ac2n1 = sc.nextDouble();

        System.out.println("Nota AC2 Lista 2:");
        ac2n2 = sc.nextDouble();

        System.out.println("Nota AC2 Lista 3:");
        ac2n3 = sc.nextDouble();

        System.out.println("Nota AC2 Lista 4:");
        ac2n4 = sc.nextDouble();

        System.out.println("Nota AC2 Lista 5:");
        ac2n5 = sc.nextDouble();

        System.out.println("Nota AG (teste progresso):");
        ag = sc.nextDouble();

        System.out.println("Nota AF parte 1:");
        af1 = sc.nextDouble();

        System.out.println("Nota AF parte 2:");
        af2 = sc.nextDouble();

        double n1ac1 = ac1Lista1(ac1n1);
        double n2ac1 = ac1Lista2(ac1n2);
        double n1ac2 = ac2Lista1(ac2n1);
        double n2ac2 = ac2Lista2(ac2n2);
        double n3ac2 = ac2Lista3(ac2n3);
        double n4ac2 = ac2Lista4(ac2n4);
        double n5ac2 = ac2Lista5(ac2n5);
        double nag = ag(ag);
        double n1af = af1(af1);
        double n2af = af2(af2);

        double media = mediaFinal(n1ac1,n2ac1,n1ac2,n2ac2,n3ac2,n4ac2,n5ac2,nag,n1af,n2af);

        System.out.println("Media final do aluno: " + media);
    }
}
