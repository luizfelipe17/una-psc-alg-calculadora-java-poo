package com.mycompany.calculadora;

import java.util.Scanner;

public class Calculadora implements I_Calculadora {

    private double Soma;
    private double Subtracao;
    private double Multiplicacao;
    private double Potencia;
    private double RaizQuadrada;

    @Override
    public double Soma(double valor1, double valor2) {

        double soma = valor1 + valor2;

        return soma;

    }

    @Override
    public double Subtracao(double valor1, double valor2) {

        double subtracao = valor1 - valor2;

        return subtracao;

    }

    @Override
    public double Multiplicacao(double valor1, double valor2) {

        double multiplicacao = valor1 * valor2;

        return multiplicacao;

    }

    @Override
    public double Divisao(double valor1, double valor2) {

        double divisao = valor1 / valor2;

        return divisao;

    }

    @Override
    public double Potencia(double valor1, double valor2) {

        double potencia = Math.pow(valor1, valor2);

        return potencia;

    }

    @Override
    public double RaizQuadrada(double valor1) {

        double raizQuadrada = Math.sqrt(valor1);

        return raizQuadrada;

    }

    public static void validacaoSinal(Calculadora calculadora, Scanner ler, int opcao) {

        if (opcao == 1) {

            Soma(calculadora, ler);

        } else if (opcao == 2) {

            Subtracao(calculadora, ler);

        } else if (opcao == 3) {

            Multiplicacao(calculadora, ler);

        } else if (opcao == 4) {

            Divisao(calculadora, ler);

        } else if (opcao == 5) {

            Potencia(calculadora, ler);

        } else if (opcao == 6) {

            RaizQuadrada(calculadora, ler);

        } else {

            System.out.print("VALOR INVALIDO\n\n");

        }

    }

    public static void Soma(Calculadora calculadora, Scanner ler) {

        System.out.println("SOMA");
        System.out.println("DIGITE O VALOR");
        System.out.print("");
        double valor1 = ler.nextDouble();
        System.out.println("+");
        System.out.print("");
        double valor2 = ler.nextDouble();

        double resultadoSoma = calculadora.Soma(valor1, valor2);

        System.out.print("RESULTADO: " + resultadoSoma + "\n\n");
        
        JogarNovamente(ler);

    }

    public static void Subtracao(Calculadora calculadora, Scanner ler) {

        System.out.println("SUBTRAÇÃO");
        System.out.println("DIGITE O VALOR");
        System.out.print("");
        double valor1 = ler.nextDouble();
        System.out.println("-");
        System.out.print("");
        double valor2 = ler.nextDouble();

        double resultadoSubtracao = calculadora.Subtracao(valor1, valor2);

        System.out.print("RESULTADO: " + resultadoSubtracao + "\n\n");
        
        JogarNovamente(ler);

    }

    public static void Multiplicacao(Calculadora calculadora, Scanner ler) {

        System.out.println("MULTIPLICAÇÃO");
        System.out.println("DIGITE O VALOR");
        System.out.print("");
        double valor1 = ler.nextDouble();
        System.out.println("x");
        System.out.print("");
        double valor2 = ler.nextDouble();

        double resultadoMultiplicacao = calculadora.Multiplicacao(valor1, valor2);

        System.out.print("RESULTADO: " + resultadoMultiplicacao + "\n\n");
        
        JogarNovamente(ler);

    }

    public static void Divisao(Calculadora calculadora, Scanner ler) {

        System.out.println("DIVISÃO");
        System.out.println("DIGITE O VALOR");
        System.out.print("");
        double valor1 = ler.nextDouble();
        System.out.println("/");
        System.out.print("");
        double valor2 = ler.nextDouble();
        
        while (valor2 == 0){
            
            System.out.println("Impossível realizar uma divisão por zero.");
            valor2 = ler.nextDouble();
            
        }

        double resultadoDivisao = calculadora.Divisao(valor1, valor2);

        System.out.print("RESULTADO: " + resultadoDivisao + "\n\n");
        
        JogarNovamente(ler);

    }

    public static void Potencia(Calculadora calculadora, Scanner ler) {

        System.out.println("POTÊNCIA");
        System.out.println("DIGITE O VALOR");
        System.out.print("");
        double valor1 = ler.nextDouble();
        System.out.print("^: ");
        double valor2 = ler.nextDouble();

        double resultadoPotencia = calculadora.Potencia(valor1, valor2);

        System.out.print("RESULTADO: " + resultadoPotencia + "\n\n");
        
        JogarNovamente(ler);

    }

    public static void RaizQuadrada(Calculadora calculadora, Scanner ler) {

        System.out.println("RAIZ QUADRADA");
        System.out.println("DIGITE O VALOR");
        System.out.print("");
        double valor1 = ler.nextDouble();
        
        while (valor1 < 0){
            
            System.out.println("Não existe raiz de número negativo.");
            valor1 = ler.nextDouble();
            
        }

        double resultadoRaizQuadrada = calculadora.RaizQuadrada(valor1);

        System.out.print("RESULTADO: " + resultadoRaizQuadrada + "\n\n");

        JogarNovamente(ler);

    }

    public static void JogarNovamente(Scanner ler) {

        System.out.println("S - CONTINUAR     /     Q - SAIR");
        String opcao = ler.next();
        boolean repetir;

        if (opcao.equalsIgnoreCase("Q")) {

            repetir = false;

        } else {

            repetir = true;

        }
        
        if (!repetir) {
            System.out.println("Fim do programa.");
            System.exit(0);
        }

    }

}
