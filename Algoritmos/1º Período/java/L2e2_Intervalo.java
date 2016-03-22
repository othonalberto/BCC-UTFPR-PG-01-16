/*
 * Autor: Othon Alberto
 * Data: 22/03/2016
 * 
 * Lista: 2
 * Exercício: 2
 * 
 * Descrição:
 * O exercício pede que seja inserido um número (n) e dois intervalos [A,B] e [C,D].
 * Após isso, informa em qual intervalo o n está.
*/

import java.util.Scanner;

public class L2e2_Intervalo {
	
	public static void main(String[] args){
		
		float n, a, b, c, d;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		n = leitor.nextFloat();

		System.out.println("Digite o primeiro intervalo(A,B): ");
		a = leitor.nextFloat();
		b = leitor.nextFloat();
		
		System.out.println("Digite o primeiro intervalo(C,D): ");
		c = leitor.nextFloat();
		d = leitor.nextFloat();
		
		leitor.close();
		
		if (n > a && n < b && n < c){
			System.out.println(n + " está entre " + a + " e " + b + ". Portanto, pertence ao primeiro intervalo.");
		} else{
			if (n > c && n < d && n > b){
				System.out.println(n + " está entre " + c + " e " + d + ". Portanto, pertence ao segundo intervalo.");
			} else{
				if (n > a && n < d){
					System.out.println(n + " está entre " + a + " e " + d + ". Portanto, pertence ao intervalo de [A, D].");
				}
			}
		}
	}
}
