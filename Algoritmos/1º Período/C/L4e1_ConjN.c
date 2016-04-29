/*
 
 Autor: Pedro Warmling Botelho
 
 Data: 27/04/2016
 
 Lista: 4
 
 Exercício: 1
 
 Descrição: Dado um conjunto de tamanho N, calcular a somatória de seus elementos e a média desses.
 */


#include <stdio.h>

int main(int argc, const char * argv[]) {
    
    int n;
    printf("Informe o tamanho do vetor: ");
    scanf("%d",&n);

    float conjN[n], media, soma = 0;
    
    for (int i=0;i<n;i++){
        printf("Informe um valor para a posição %d: ", i+1); // Preenchendo o vetor
        scanf("%f",&conjN[i]);
        soma += conjN[i]; // Somando todos os valores informados
    }
    
    media = soma/n; // Fazendo a média de todos os valores informados
    printf("A soma é %.2f e a média é %.2f\n",soma,media);
    
    return 0;
}
