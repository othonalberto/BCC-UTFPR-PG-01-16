/*
 * Autor: Othon Alberto
 * Data: 30/03/2016
 *
 * Exercício complementar passado durante a aula
 *
 * Descrição:
 * Implementar a sequência de Fibonacci */


#include <stdio.h>

int main(){
    
    int nAtual = 0, nAnt = 1, nGer;
    int x, n;
    
    printf("Escreva a quantidade de número que deseja: ");
    scanf("%d", &n);
    
    for (x=0; x<n; x++){
        printf("%i \n", nAtual);
        
        nGer = nAnt + nAtual;
        nAnt = nAtual;
        nAtual = nGer;
    }
}