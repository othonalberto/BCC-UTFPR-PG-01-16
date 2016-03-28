/*
 * Autor: Othon Alberto
 * Data: 22/03/2016
 *
 * Lista: 1
 * Exercício: 3
 *
 * Descrição:
 * O exercício pede que seja inserido o número de um vendedor,
 * o seu salário fixo, o total de vendas por ele efetuadas e o percentual
 * que ganha sobre o total de vendas. Calcular o salário total do vendedor.
 * Escrever número do vendedor e o salário total.
 */

#include <stdio.h>

int main(){
    
    int numero_vendedor;
    float salario_fixo, total_de_vendas, porcentual, salario_final;
    
    printf("Digite o número do vendedor: ");
    scanf("%i", &numero_vendedor);
    
    printf("Digite seu salário fixo: ");
    scanf("%f", &salario_fixo);
          
    printf("Digite o total de vendas: ");
    scanf("%f", &total_de_vendas);
    
    printf("Digite o percentual sobre vendas: ");
    scanf("%f", &porcentual);
    
    salario_final = salario_fixo + (porcentual/100) * total_de_vendas;
    
    printf("O salário do vendedor %d é: %.2f", numero_vendedor, salario_final);
    
    
}
