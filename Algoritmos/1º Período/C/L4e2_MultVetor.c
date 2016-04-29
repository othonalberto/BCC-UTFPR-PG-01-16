/* 
 
Autor: Pedro Warmling Botelho

Data: 27/04/2016
 
Lista: 4

Exercício: 2

Descrição: Dado o vetor F com 20 elementos inteiros, substituir cada elemento por si mesmo multiplicado pela sua posição no conjunto.
*/

#include <stdio.h>

int main(int argc, const char * argv[]) {
    
    float vetorF[20];
    
    for(int i=0;i<20;i++){
        printf("Informe um valor para a posição %d: ",i+1); // Preenchendo o vetor
        scanf("%f",&vetorF[i]);
    }
    
    for(int j=0;j<20;j++){
        printf("Posição[%d] = %.2f\n",j+1,(vetorF[j]*j)); // Multiplicando o elemento informado pela posição dele no vetor
    }
    
    return 0;
}
