package aula19_Arrays;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		/*
		 * Criar um vetor A com 10 elementos inteiros. Desenvolver um programa que
		 * defina o percentual de elementos pares e ímpares, respectivamente,
		 * armazenados neste vetor.
		 */
		Scanner ler = new Scanner(System.in);

		int[] vetorA = new int[10];
		int tamanhoDoVetorA = vetorA.length;

		int quantidadeDeImpar = 0;
		int quantidadeDePares = 0;

		for (int i = 0; i < tamanhoDoVetorA; i++) {
			System.out.println("Entre com o valor da posicao: " + i);
			vetorA[i] = ler.nextInt();

		}
		// pegando a quantidade de numeros impares
		for (int i = 0; i < tamanhoDoVetorA; i++) {
			if (vetorA[i] % 2 != 0) {
				quantidadeDeImpar++;
			}
		}
		// pegando a quantidade de numeros pares
		quantidadeDePares = tamanhoDoVetorA - quantidadeDeImpar;
		/*
		 * vamos calcular a porcentagem de pares e impares utilizaremos a regra de 3
		 * simples
		 * 
		 * tamanhoVetorA ------ 100 (tamanho do vetorA corresponde a 100% dos numeros
		 * par----------------- (x)
		 * 
		 * tamanhoVetorA X (x) == par X 100 x == (par x 100) / tamanhoVetorA)
		 */
		// double porcentagemDosPares = ((quantidadeDePares*100) / tamanhoVetorA);
		// double porcentagemDosImpares = 100 - porcentagemDosPares;

		int quantidadeDeNumeros = tamanhoDoVetorA;
		double porcentagemDosImpares = ((quantidadeDeImpar * 100) / quantidadeDeNumeros);
		double porcentagemDosPares = 100 - porcentagemDosImpares;

		System.out.print("VetorA = ");
		for (int i = 0; i < tamanhoDoVetorA; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.println("Porcentagem Pares: " + porcentagemDosPares);
		System.out.println("Porcentagem Impares: " + porcentagemDosImpares);

	}

}
