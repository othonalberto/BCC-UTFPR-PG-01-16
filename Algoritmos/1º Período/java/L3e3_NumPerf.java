/*
 * Autor: Matheus Scaketti
 * Data: 06/04/2016
 * 
 * Lista: 2
 * Exercício: 3
 * 
 * Descrição: Número perfeito é aquele cuja soma de seus divisores, 
 * exceto ele próprio, é igual a ele mesmo.
 * Ex: 6 é perfeito porque 1 + 2 + 3 = 6. Determine dentre 10(dez) 
 * números fornecidos pelo usuário quais são ou não perfeito.
 * 
*/

import java.util.Scanner;

public class L3e3_NumPerf {

	public static void main(String[] args) {
		
		int x, h, numSoma = 1;
		int[] nums = new int[10];
		Scanner l = new Scanner(System.in);
		
		System.out.println("Digite 10 números aaleatórios:");
		for (x = 0; x <= 9; x++){
			nums[x] = l.nextInt();
		}
		l.close();
		
		for (h = 0; h <= 9; h++){
			for(x = 2; x < nums[h]; x++){
				
				if (nums[h]%x == 0){
					numSoma += x;
				}
			}
			if(numSoma == nums[h]){
				System.out.println(nums[h] + " é perfeito.");
			}else{
				System.out.println(nums[h] + " não é perfeito.");
			}
			numSoma = 1;
		}
	}

}
