/*
 * Autor: Othon Alberto
 * Data: 18/03/2016
 *
 * Lista: 1
 * Exercício: 2
 *
 * Descrição:
 * O exercicio pede para que seja inserido 3 valores e que retorne a soma dos quadrados desses número
 */

#include <stdio.h>

int main(){
    
    float a, b, c, soma;
    
    printf("Digite o primeiro valor: ");
    scanf("%f", &a);
    
    printf("Digite o segundo valor: ");
    scanf("%f", &b);
    
    printf("Digite o terceiro valor: ");
    scanf("%f", &c);
    
    //calcula a soma dos quadrados
    soma = (a*a) + (b*b) + (c*c);
    
    printf("O valor da soma dos quadrados dos números inseridos é: %.2f\n", soma);
    
    
}