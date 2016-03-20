/*
 * Autor: Matheus Scaketti
 * Data: 20/03/2016
 * 
 * Lista: 1
 * Exercício: 2
 * 
 * Descrição:
 * Escreva um algoritmo que leia três números inteiros e 
 * positivos (A, B, C) e calcule a expressão d = ((a + b)^2 + (b + c)^2)/2
*/

import java.util.Scanner;

public class L1e2_CalcExpressao {

	public static void main(String[] args) {
		
		int a, b, c;
		Double r, s, d;
		
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite um numero inteiro e positivo para A: ");
		a = leitor.nextInt();
		
		System.out.println("Digite um numero inteiro e positivo para B: ");
		b = leitor.nextInt();
		
		System.out.println("Digite um numero inteiro e positivo para C: ");
		c = leitor.nextInt();
		
		leitor.close();
		
		//calculo da expressão d = ((a + b)^2 + (b + c)^2)/2
		r = Math.pow((a + b), 2);
		s = Math.pow((b + c), 2);
		
		d = (r + s)/2;
		
		System.out.println("O resultado é: " + d);
	}

}
