/*
 * Autor: Othon Alberto
 * Data: 27/04/2016
 * 
 * Lista: 4
 * Exercício: 2
 * 
 * Descrição:
 * Dado o vetor F com 20 elementos inteiros, substituir cada elemento por si mesmo multiplicado pela sua posição no conjunto.
*/


package exerciciosJava;

import java.util.Scanner;

public class L4e2vetor20 {

	public static void main(String[] args) {
		
		float f[] = new float[20];
		
		Scanner leitor = new Scanner(System.in);
		
		//preenchimento do vetor com valores e calcula a soma deles.
		for (int i = 0; i<20; i++){
			System.out.println("Informe o valor " + (i+1) + " de 20:" );
			f[i] = leitor.nextInt(); //insire o valor na posição onde o 'i' está.
			f[i] = f[i] * i;
		}
		
		leitor.close();
				
		//Poderia ser utilizado o mesmo for para mostrar os resultados, porém ficarei feio, pois o usuário digitaria o valor e já apareceria o resultado.
		//Por isso, utilizarei outro for somente para mostrar os resultados.
		for (int i = 0; i<20; i++){
			System.out.println("Posição " + (i+1) + " :" + f[i]);
		}

	}

}
