/*
 * Autor: Matheus Scaketti
 * Data: 20/03/2016
 * 
 * Lista: 1
 * Exercício: 7
 * 
 * Descrição:
 * O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem
 * do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem
 * do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo que
 * leia o custo de fábrica de um carro e escreva o custo ao consumidor. 
*/

import java.util.Scanner;

public class L1e7_CalcCustoCarro {

	public static void main(String[] args) {
		
		float custoFabrica, custoFinal = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o custo de fabricação de um carro em R$: ");
		custoFabrica = leitor.nextFloat();
		
		leitor.close();
		
		//cálculo do custo final ao consumidor
		custoFabrica = custoFabrica + custoFabrica * 45/100;
		custoFinal = custoFabrica + custoFabrica * 28/100;
		
		System.out.println("O valor do carro irá custar R$" + custoFinal + " ao consumidor.");
		
	}

}
