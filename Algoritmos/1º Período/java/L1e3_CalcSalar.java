/*
 * Autor: Matheus Scaketti
 * Data: 16/03/2016
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

import java.util.Scanner;

public class L1e3_CalcSalar {

	public static void main(String[] args) {
		
		//Declaração de variáveis
		int numVend;
		float salarFixo, totalVendas, percentVendas;

		Scanner leitor = new Scanner(System.in);
		
		//Entrada de Dados para o programa
		System.out.println("Digite o numero do vendedor: ");
		numVend = leitor.nextInt();
		
		System.out.println("Digite o salario fixo do vendedor: ");
		salarFixo = leitor.nextFloat();
		
		System.out.println("Digite o total de vendas e o percentual de ganho: ");
		totalVendas = leitor.nextFloat();
		percentVendas = leitor.nextFloat();
		
		leitor.close();
		
		//Cálculo do percentual sobre o total de vendas
		salarFixo += totalVendas * (percentVendas/100);
		
		System.out.println("O salario total do vendedor: " + numVend + ", é: " + salarFixo);
	}

}
