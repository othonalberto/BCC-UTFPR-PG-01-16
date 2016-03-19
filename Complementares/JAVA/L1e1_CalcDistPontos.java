/*
 * Autor: Matheus Scaketti
 * Data: 19/03/2016
 * 
 * Lista: 1
 * Exercício: 1
 * 
 * Descrição:
 * Construa um algoritmo que, tendo como dados de entrada dois pontos quaisquer no plano,
 * P(x1,y1) e P(x2,y2), escreva a distância entre eles.
*/

import java.util.Scanner;

public class L1e1_CalcDistPontos {

	public static void main(String[] args) {
		
		float px1, px2, py1, py2;
		Double d;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o valor de X1 para o primeiro ponto: ");
		px1 = leitor.nextFloat();
		
		System.out.println("Digite o valor de Y1 para o primeiro ponto: ");
		py1 = leitor.nextFloat();
		
		System.out.println("Digite o valor de X2 para o segundo ponto: ");
		px2 = leitor.nextFloat();
		
		System.out.println("Digite ovalor de Y2 para o segundo ponto: ");
		py2 = leitor.nextFloat();
		leitor.close();
		
		//cálculo da distância, conforme formula dada pelo exercício
		d = Math.sqrt( Math.pow((px2 - px1), 2) + Math.pow((py2 - py1), 2));
		
		System.out.println("A distancia entre os dois pontos é: " + d);
	}

}
