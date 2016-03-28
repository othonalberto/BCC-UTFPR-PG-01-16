/*
 * Autor: Othon Alberto
 * Data: 28/03/2016
 *
 * Lista: 2
 * Exercício: 3
 *
 * Descrição:
 * O exercício pede para o usuário informar seu nome e seu sexo e após isso
 * ser tratado com Ilmo Sr. ou Ilma Sra.
 */

#include <stdio.h>

int main(){
    
    int sexo;
    char nome[300];
    
    printf("Digite seu nome: " );
    scanf("%s", &nome);
    
    while (sexo != 1 && sexo != 2) {
        printf("Digite seu sexo (1 para Feminino, 2 para Masculino): ");
        scanf("%d", &sexo);
    }

    
    if (sexo == 1){
        printf("Ilma Sra. %s", nome);
    }
    else if(sexo == 2){
        printf("Ilmo Sr. %s", nome);
    }
}