/*
 * Autor: Matheus Scaketti
 * Data: 06/04/2016
 * 
 * Lista: 3
 * Exercício: 1
 * 
 * Descrição: Desenvolver um algoritmo para determinar o valor de S
 * pela seguinte série:
 * S = 1/1 - 2/4 + 3/9 - 4/16 + 5/25 - 6/36 ... - 10/100
*/

#include <stdio.h>

int main(){
	int x;
	float a, s = 1;

	for (x = 2; x < 11; x++){
		if(x%2 == 0){
			a = x;
			s -= (a / (a*a));
		}else{
			a = x;
			s += (a / (a*a));
		}
	}
	printf("%f", s);
}
