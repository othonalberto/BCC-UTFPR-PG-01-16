/*
 * Autor: Matheus Scaketti
 * Data: 18/03/2016
 * 
 * Lista: --
 * Exercício: --
 * 
 * Descrição:
 * Exemplo de código para o exercício que foi passado pelo professor
 * 
 * Um grupo de estudantes está trabalhando em um projeto que envolve a 
 * escrita de um programa merge_sort. José e Maria escrevem um algoritmo 
 * cada um para uma função que usa duas listas ordenadas, LIST1 e LIST2,
 * de comprimentos p e q, respectivamente, e os funde em uma terceira lista, LIST3.
 */

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		
		int i = 0;
		int j = 0;
		int p = 0;
		int q = 0;
		int k = 0;
		int h;
		
		int[] list1 = {1, 4, 2, 8, 97};
		int[] list2 = {7, 14, 65, 92, 2};
		
		int[] list3_1 = new int[5];
		int[] list3_2 = new int[5];
		
		p = list1.length;
		q = list2.length;
		
		Arrays.sort(list1);
		Arrays.sort(list2);

		for(h = 0; h < list3_1.length; h++){
			if ((i + j <= p + q) && (i <= p) && ((j > q) || (list1[i] <= list2[j]))){
				
				list3_1[k] = list1[i];
				i++;
			}
			else{
				
				list3_1[k] = list2[j];
				j++;
			}
			
			k++;
		}
		
		i = 0;
		j = 0;
		k = 0;
		
		for(h = 0; h < list3_2.length; h++){
			if (((i + j <= p + q) && (i <= q) && (j > q)) || ((i + j <= p + q) &&  (i <= p) && (list1[i] <= list2[j]))){
				
				list3_2[k] = list1[i];
				i++;
			}
			else{
				
				list3_2[k] = list2[j];
				j++;
			}
			
			k++;
		}
		
		//Imprime na tela os resultados
		Arrays.sort(list3_1);
		Arrays.sort(list3_2);
		
		System.out.println("Algoritmo da Maria:");
		
		for(h = 0; h < list3_1.length; h++){
			
			System.out.println(list3_1[h]);
		}
		
		System.out.println("\nAlgoritmo do Joao:");
		
		for(h = 0; h < list3_2.length; h++){
			
			System.out.println(list3_2[h]);
		}
	}
}