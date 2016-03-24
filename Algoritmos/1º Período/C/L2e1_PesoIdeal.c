/*
 * Autor: Othon Alberto
 * Data: 24/03/2016
 *
 * Lista: 2
 * Exercício: 1
 *
 * Descrição:
 * O exercício pede que seja inserido o sexo do usuário e sua altura e através
 * dessas informações seja calculado o peso ideal
*/

#include <stdio.h>

int main(){
    
    int sexo;
    float peso_ideal = 0.0, h;
    
    while (sexo != 1 && sexo != 2) {
        printf("Digite seu sexo (1 para Feminino, 2 para Masculino): ");
        scanf("%d", &sexo);
    }
    
    printf("Digite sua altura: ");
    scanf("%f", &h);
    
    switch (sexo){
            
        case 1:{
            peso_ideal = (62.1 * h) - 44.7;
            break;
        }
            
        case 2:{
            peso_ideal = (72.7 * h) - 58;
            break;
        }
    }
    
    printf("Seu peso ideal é: %.2f quilos.", peso_ideal);
    
}