/*
 * Autor: Othon Alberto
 * Data: 22/03/2016
 * 
 * Lista: 2
 * Exercício: 1
 * 
 * Descrição:
 * O exercício pede que seja inserido o sexo do usuário e sua altura e através
 * dessas informações seja calculado o peso ideal
*/


package exerciciosJava;

import java.util.Scanner;

public class E1l2_PesoIdeal {

	public static void main(String[] args) {
		
		int sexo;
		float h;
		double pesoideal = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu sexo - 1, se masculino; 2, se feminino");
		sexo = leitor.nextInt();
		
		System.out.println("Digite sua altura: ");
		h = leitor.nextFloat();
		
		leitor.close();
		
		if (sexo == 1){
			pesoideal = (72.7*h)-58;
		} else if(sexo == 2){
			pesoideal = (62.1*h)-44.7;
		}
		
		System.out.println("Peso ideal: " + pesoideal + " quilos");
	}
}
