/*
Faça um programa que peça N números inteiros, calcule e mostre a
quantidade de números pares e a quantidade de números ímpares.
 */

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int numero = 0;
        int quantidadePares = 0;
        int quantidadeImpares = 0;

        System.out.println("Qunatidade de Números: ");
        quantidadeNumeros = scan.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            quantidadeNumeros = scan.nextInt();

            if (numero % 2 == 0) quantidadePares++;
            else quantidadeImpares++;

            count++;
        } while(count < quantidadeNumeros);

        System.out.println("Quantidade Par: " + quantidadePares);
        System.out.println("Quantidade Ímpar: " + quantidadeImpares);
    }
}
