/*
 * Autor: Matheus Scaketti
 * Data: 21/03/2016
 * 
 * Lista: 1
 * Exercício: 8
 * 
 * Descrição:
 * Calcule a média aritmética das 3 notas de um aluno e mostre,
 * além do valor da média, uma mensagem de "Aprovado", caso a média seja
 * igual ou superior a 6, ou a mensagem "reprovado", caso contrário. 
*/

import java.util.Scanner;

public class L1e9_SistNotas {

	public static void main(String[] args) {
		
		float p1, p2, p3, media;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno: ");
		p1 = leitor.nextFloat();
		
		System.out.println("Digite a segunda nota do aluno: ");
		p2 = leitor.nextFloat();
		
		System.out.println("Digite a terceira nota do aluno: ");
		p3 = leitor.nextFloat();
		
		leitor.close();
		
		media = (p1 + p2 + p3) / 3;
		
		//Condição que verifica o valor da mádia e apresenta se o aluno está aprovado ou não
		if (media >= 6){
			System.out.println("Média Final: " + media + ",\no aluno está aprovado!");
		}
		else{
			System.out.println("Média Final: " + media + ",\no aluno está reprovado!");
		}

	}

}
