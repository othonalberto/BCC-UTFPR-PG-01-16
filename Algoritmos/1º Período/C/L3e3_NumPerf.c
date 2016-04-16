/*
 * Autor: Alexandre Mellado
 * Data: 16/04/2016
 * 
 * Lista: 3
 * Exercício: 3
 * 
 * Descrição: Número perfeito é aquele cuja soma de seus divisores, 
 * exceto ele próprio, é igual a ele mesmo.
 * Ex: 6 é perfeito porque 1 + 2 + 3 = 6. Determine dentre 10(dez) 
 * números fornecidos pelo usuário quais são ou não perfeito.
 * 
*/

#include <stdio.h>
#include <stdlib.h>

int main(){
	int n,i,x,aux;
	for ( aux = 1 ; aux <= 10 ; aux++ ){
		x = 0;
		printf("Digite um numero: ");
		scanf("%d",&n);
		for ( i = (n - 1) ; i>0 ; i-- )
			if (n%i == 0)
				x = x + i;
		if (x == n)
			printf("%d eh um numero perfeito.\n",n);
		else
			printf("%d nao eh um numero perfeito.\n",n);
			printf("  ---------------- \n");
	}
	getch();
	return 0;  
}
