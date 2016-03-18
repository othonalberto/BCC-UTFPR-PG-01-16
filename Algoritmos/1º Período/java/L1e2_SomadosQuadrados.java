/*
 * Autor: Matheus Scaketti
 * Data: 16/03/2016
 * 
 * Lista: 1
 * Exercício: 2
 * 
 * Descrição:
 * O exercício pede que seja inserido 3 valores para a, b e c e calcule
 * a soma dos quadrados dos valores inseridos
*/

import java.util.Scanner;

public class L1e2_SomadosQuadrados {

	public static void main(String[] args) {
		
		float a, b, c, result;
		
		System.out.println("Insira os valores para A, B e C: ");
		
		Scanner leitor = new Scanner(System.in);
		
		a = leitor.nextFloat();
		b = leitor.nextFloat();
		c = leitor.nextFloat();
		leitor.close();
		
		//calcula a soma dos quadrados dos números
		result = (a * a) + (b * b) + (c * c);
		
		System.out.println("A soma dos quadrados dos números é: " + result);
	}

}
