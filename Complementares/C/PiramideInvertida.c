/*
 * Autor: Alexandre Mellado
 * Data: 16/04/2016
 * 
 * Lista: -
 * Exerc�cio: -
 * 
 * Descri��o:
 * Quest�o da prova de algoritmos onde � solicitado um n�mero �mpar ao usu�rio
 * e a partir disso � construido uma pir�mide invertida.
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
        ( n%2 == 0 ) ? printf("O numero digitado � par.\n"):( l = 0 ); 
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
