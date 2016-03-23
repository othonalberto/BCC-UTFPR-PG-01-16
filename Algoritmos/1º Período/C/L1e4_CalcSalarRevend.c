/*
 * Autor: Othon Alberto
 * Data: 23/03/2016
 *
 * Lista: 1
 * Exercício: 4
 *
 * Descrição:
 * O exercício pede que seja inserido o número do vendedor, o número de
 * carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor
 * que recebe por carro vendido e calcula o salário mensal do vendedor, escrevendo-o
 * juntamente com o seu número de identificação.
 */

#include <stdio.h>

int main(){
    
    float salario_fixo, comissao_por_carro, valor_de_vendas, salario_mensal;
    int numero_de_carros, numero_do_vendedor;
    
    printf("Digite o número de identificação: ");
    scanf("%i", &numero_do_vendedor);
    
    printf("Digite o salário fixo: ");
    scanf("%f", &salario_fixo);
    
    printf("Digite o número de carros vendidos: ");
    scanf("%i", &numero_de_carros);
    
    printf("Digite a comissão por carro: ");
    scanf("%f", &comissao_por_carro);
    
    printf("Digite o valor total das vendas: ");
    scanf("%f", &valor_de_vendas);
    
    salario_mensal = salario_fixo + (numero_de_carros * comissao_por_carro) + (0.05 * valor_de_vendas);
    
    printf("O vendedor %i terá um salário mensal de %.2f", numero_do_vendedor, salario_mensal);
    
    
    
    return 1;
}