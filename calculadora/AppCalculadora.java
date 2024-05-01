package com.mycompany.calculadora;

import java.util.Scanner;

public class AppCalculadora {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        Scanner ler = new Scanner(System.in);

        while (true) {

            System.out.println("Informe qual operação: ");
            System.out.println("1 - SOMA\n"
                    + "2 - SUBTRAÇÃO\n"
                    + "3 - MULTIPLICAÇÃO\n"
                    + "4 - DIVISÃO\n"
                    + "5 - POTÊNCIA\n"
                    + "6 - RAIZ QUADRADA");
            System.out.print("Informe: ");
            int opcao = ler.nextInt();

            System.out.println("");

            calculadora.validacaoSinal(calculadora, ler, opcao);

        }
    }

}
