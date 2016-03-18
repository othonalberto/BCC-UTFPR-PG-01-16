/*
 * Autor: Matheus Scaketti
 * Data: 16/03/2016
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

import java.util.Scanner;

public class L1e4_CalcSalarRevend {

	public static void main(String[] args) {
		
		int numVend, numCarro;
		float valTotalVendas, salFixo, valCarVendido;
		
		Scanner leitor = new Scanner(System.in);
		
		//Entrada de dados
		System.out.println("Insira o numero do vendedor: ");
		numVend = leitor.nextInt();
		
		System.out.println("Insira o numero de carros vendidos pelo vendedor: ");
		numCarro = leitor.nextInt();
		
		System.out.println("Insira o valor total das vendas(ex: 0000.00): ");
		valTotalVendas = leitor.nextFloat();
		
		System.out.println("Insira o salario fixo do vendedor e o valor que recebe por cada carro: ");
		salFixo = leitor.nextFloat();
		valCarVendido = leitor.nextFloat();
		
		leitor.close();
		
		//Cálculo do salário com a porcentagem de vendas
		salFixo += valTotalVendas * 0.05;
		//Cálculo do salário em relação a quantidade de carros vendidos
		salFixo += valCarVendido * numCarro;
		
		System.out.println("O salario total do vendedor: " + numVend + ", é: R$" + salFixo);
	}

}
