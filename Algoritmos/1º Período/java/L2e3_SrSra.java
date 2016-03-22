/*
 * Autor: Othon Alberto
 * Data: 22/03/2016
 * 
 * Lista: 2
 * Exercício: 3
 * 
 * Descrição:
 * O exercício pede para o usuário informar seu nome e seu sexo e após isso
 * ser tratado com Ilmo Sr. ou Ilma Sra.
*/

package exerciciosJava;

import java.util.Scanner;

public class E3l1_SrSra {
	
	public static void main(String[] args){
		
		String nome;
		int sexo;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = leitor.next();
		
		System.out.println("Digite seu sexo (1 para masculino e 2 para feminino)");
		sexo = leitor.nextInt();
		
		leitor.close();
		
		if(sexo == 1){
			System.out.println("Ilmo Sr. " + nome);
		}
		else{
			if(sexo == 2){
				System.out.println("Ilma Sra. " + nome);
			}
		}
	}

}
