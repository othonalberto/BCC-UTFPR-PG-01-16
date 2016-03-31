/*
 * Autor: Matheus Scaketti
 * Data: 30/03/2016
 * 
 * Exercício: Sequência de Fibonacci
 * 
 * Descrição:
 * Exercício passado na aula de algoritmos, mostrando a sequência de fibonacci
 * com o comando for.
*/

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int nAtual = 0, nAnt = 1, nGer = 0, aux, cont;
		
		Scanner leitor = new Scanner(System.in);
		
		cont = leitor.nextInt();
		leitor.close();
		
		for (aux = 0; aux < cont; aux++){
			System.out.println(nAtual);
			nGer = nAnt + nAtual;
			nAnt = nAtual;
			nAtual = nGer;
		}

	}

}
