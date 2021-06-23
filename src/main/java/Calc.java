// 1-  Pacote
package devcalc;
// 2- Bibliotecas


// 3- Classes

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class Calc {
    // 3.1 - Atributos
    static Scanner entrada = new Scanner(System.in); //entrada = input

    // 3.2 -  Metodos e Funções

    public static void main(String[] args){
        //exibe o menu da calculadora.
        System.out.println("====CALCULADORA====");
        System.out.println("(1) Somar");
        System.out.println("(2) Subtrair");
        System.out.println("(3) Multiplicar");
        System.out.println("(4) Dividir");
        System.out.print("Escolha o cáculo Desejado:");

        //recebe a opção desejada
        int opcao = entrada.nextInt();
        int num1 = 0;
        int num2 = 0;
        //pergunta os valores a serem usados ca calculadora
        if (opcao >= 1 && opcao <= 4){
            System.out.print("Entre o 1° numero: ");
            num1 = entrada.nextInt();
            System.out.print("Entre o 2° numero: ");
            num2 = entrada.nextInt();
            System.out.print("O resultado é:  ");
        }
        //chama a função do calcula desejada//
        switch (opcao){
            case 1:
                System.out.println(somarDoisNumeros(num1, num2));
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }

    }

    public static int somarDoisNumeros(int num1, int num2){
        return num1 + num2;
    }
}
