/*
 * Autor: Othon Alberto
 * Data: 02/04/2016
 *
 * Lista: 3
 * Exercício: 1
 *
 * Descrição:
 * Elabore um algoritmo para resolver o valor de S, onde:
 * S= 1/1 - 2/4 + 3/9 - 4/16 + 5/25 - 6/36 ... - 10/100
*/

#include <stdio.h>

int main(){
    float x, s = 0;
    
    for (x = 1; x < 11; x++){
        
        // variável s recebe ela mesma mais o valor de 'x' dividido por 'x' ao quadrado
        s = (x / (x*x));
        
        printf("%.4f\n", s);
    }
    
    
}
