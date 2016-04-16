/*
 * Autor: Alexandre Mellado
 * Data: 16/04/2016
 * 
 * Lista: 3
 * Exerc�cio: 3
 * 
 * Descri��o: N�mero perfeito � aquele cuja soma de seus divisores, 
 * exceto ele pr�prio, � igual a ele mesmo.
 * Ex: 6 � perfeito porque 1 + 2 + 3 = 6. Determine dentre 10(dez) 
 * n�meros fornecidos pelo usu�rio quais s�o ou n�o perfeito.
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
