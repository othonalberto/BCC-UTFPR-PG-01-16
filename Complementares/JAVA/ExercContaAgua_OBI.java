/*
 * Autor: Matheus Scaketti
 * Data: 30/03/2016
 * 
 * Exercício: OBI
 * 
 * Descrição:
 * Dado o consumo de uma residência em m³, 
 * calcula o valor da conta de água daquela residência.
 * 
 * Faixa de consumo (m3) --------- Preço (por m3)
 * Até 10                --------- Incluído na franquia
 * 11 a 30               --------- R$ 1
 * 31 a 100              --------- R$ 2
 * 101 em diante         --------- R$ 5
*/

import java.util.Scanner;

public class ExercContaAgua_OBI {

	public static void main(String[] args) {
		
		int consumo = 0, v = 1, aux = 0;
		float valorConta = 0;
		
		Scanner leitor = new Scanner(System.in);

		System.out.println("Olá, seja bem vindo ao sistema de cálculo de sua conta de água da cidade de Ponta Grossa.\n");
		
		while(v == 1){
			System.out.println("Entre com o consumo de água em m³: ");
			consumo = leitor.nextInt();
			
			if(consumo >= 0){
				v = 0;
				leitor.close();
			}else{
				System.out.println("Não é permitido valores menores do que 0");
			}
		}
		
		if(consumo<= 10) {
			valorConta = 7;
		}
		else if(consumo > 10 && consumo <= 30){
			aux = consumo - 10;
			valorConta += aux * 1 + 7;
			}
		else if(consumo > 30 && consumo <= 100){
			aux = consumo - 30;
			valorConta += aux * 2 + 27;
				}else{
					aux = consumo - 100;
					valorConta += aux * 5 + 167;
				}
		
		System.out.println("O valor total de sua conta será R$" + valorConta);
	}

}
