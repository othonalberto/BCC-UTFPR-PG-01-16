/*
 * Autor: Matheus Scaketti
 * Data: 20/03/2016
 * 
 * Lista: 1
 * Exercício: 5
 * 
 * Descrição:
 * Faça um algoritmo que leia as 3 notas de um aluno e calcule a média final deste aluno.
 * Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente.
*/

import java.util.Scanner;

public class L1e5_CalcMedia {

	public static void main(String[] args) {
		
		float p1, p2, p3, media;
		Scanner leitor = new Scanner(System.in);
		
		//inicializa as variáveis recebendo os valores do usuário e calcula o peso de cada nota.
		System.out.println("Digite a primeira nota do aluno: ");
		p1 = leitor.nextFloat();
		p1 *= 2;
		
		System.out.println("Digite a segunda nota do aluno: ");
		p2 = leitor.nextFloat();
		p2 *= 3;
		
		System.out.println("Digite a terceira nota do aluno: ");
		p3 = leitor.nextFloat();
		p3 *= 5;
		
		//cálculo da média das notas.
		media = (p1 + p2 + p3)/3;
		
		leitor.close();
		
		System.out.println("A média do aluno é: " + media);

	}

}
