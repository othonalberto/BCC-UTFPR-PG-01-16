/*
 * Autor: Matheus Scaketti
 * Data: 17/03/2016
 *
 * Lista: 1
 * Exercício: 1
 *
 * Descrição:
 * O exercício pede que seja inserido 3 valores para a, b e c e calcule
 * o semi perímetro(s) e após isso calcular a área do triângulo
*/

#include <stdio.h>
#include <math.h>

int main(){

	float a, b, c, s;

	printf("Quais são os 3 lados do triangulo: ");

	scanf("%f", &a);
	scanf("%f", &b);
	scanf("%f", &c);

	//calcula o semi perimetro
	s = (a + b + c) / 2;

	//calcula a área do triangulo
	s = sqrt(s * (s-a) * (s-b) * (s-c));

	printf("A area do triangulo é: %.3f\n", s);
}

