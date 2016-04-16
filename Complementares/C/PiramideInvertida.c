/*
 * Autor: Alexandre Mellado
 * Data: 16/04/2016
 * 
 * Lista: -
 * Exercício: -
 * 
 * Descrição:
 * Questão da prova de algoritmos onde é solicitado um número ímpar ao usuário
 * e a partir disso é construido uma pirâmide invertida.
 * 
*/

#include <stdlib.h>
#include <stdio.h>
#include <locale.h>

int main(){
    setlocale(LC_ALL,"");
    int n,r,c,l;
    do{
        printf("Digite um numero inteiro e impar: ");
        scanf("%d",&n);
        ( n%2 == 0 ) ? printf("O numero digitado é par.\n"):( l = 0 ); 
        printf(" ---------------- \n");
    }while( l != 0 );
    
    for ( r = n ; r > 0 ; r--){
        for( c = 1 ; c <= n ; c++ )
            printf(" &");
        printf("\n");
        n = n - 2; 
        for ( c = 0 ; c <= l; c++)
            printf("  ");
        l++;
    }
    getch();
    return 0;
}
