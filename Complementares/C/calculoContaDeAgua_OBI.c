/*
 * Autor: Othon Alberto
 * Data: 29/03/2016
 *
 * Exercício da OBI passado pelo professor durante a aula
 *
 * Descrição:
 * O exercício pede para que seja informado o consumo de água e calcule o gasto de acordo com a seguinte tabela:
 *
 * Faixa de consumo (m3) --------- Preço (por m3)
 * Até 10                --------- Incluído na franquia
 * 11 a 30               --------- R$ 1
 * 31 a 100              --------- R$ 2
 * 101 em diante         --------- R$ 5
*/



#include <stdio.h>

int main(){
    
    int consumo, valor_final;
    int const taxa = 7;
    
    printf("Digite seu consumo de água (em metros cubicos): ");
    scanf("%d", &consumo);

    if (consumo < 11){
        valor_final = taxa;
    }
    
    else if(consumo < 31){
        valor_final = taxa + (consumo - 10) * 1;
    }
    
    else if(consumo < 101){
        valor_final = taxa + 20 + ((consumo - 30) * 2);
    }
    
    else if(consumo >= 101){
        valor_final = taxa + 20 + 140 + ((consumo - 100) * 5);
    }
    
    printf("Valor da conta: %d reais", valor_final);
}
