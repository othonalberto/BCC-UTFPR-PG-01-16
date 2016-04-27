/*
 * Autor: Othon Alberto
 * Data: 27/04/2016
 * 
 * Lista: 4
 * Exercício: 1
 * 
 * Descrição:
 * Dado um conjunto de tamanho N, calcular a somatória de seus elementos e a média desses.
*/

package exerciciosJava;

import java.util.Scanner;

public class L4e1_SomatoriaMediaVetor {
	
	public static void main (String[] args){

		int n = 0;
		float tamAux, soma = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		//verifica se o valor informado é inteiro.
		do {
			System.out.println("Escreva a quantidade de valores que seu vetor terá: ");
			tamAux = leitor.nextFloat();
			n = (int)tamAux;
			tamAux = tamAux - n;
		} while (n<1 && tamAux != 0);
		
		float conjElementos[] = new float[n];
		
		//preenchimento do vetor com valores e calcula a soma deles.
		for (int i = 0; i<n; i++){
			System.out.println("Informe o valor " + (i+1) + " de " + n );
			conjElementos[i] = leitor.nextFloat(); //insire o valor na posição onde o 'i' está.
			soma += conjElementos[i];
		}
		
		leitor.close();
		
		float mediaValores = soma/n;
		
		System.out.println("Soma: " + soma);
		System.out.println("Média: " + mediaValores);
	
	}

}
