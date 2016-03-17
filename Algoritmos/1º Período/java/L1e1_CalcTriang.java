import java.util.Scanner;

/*
 * Autor: Matheus Scaketti
 * Data: 16/03/2016
 * 
 * Lista: 1
 * Exercício: 1
 * 
 * Descrição:
 * O exercício pede que seja inserido 3 valores para a, b e c e calcule
 * o semi perímetro(s) e após isso calcular a área do triângulo
*/

public class L1e1_CalcTriang{
	
	public static void main(String[] args){
		
		float a, b, c, s;
		Double exp;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Quais são os 3 lados do triangulo: ");
		
		a = leitor.nextFloat();
		b = leitor.nextFloat();
		c = leitor.nextFloat();
		leitor.close();

		//calcula o semi perimetro
		s = (a + b + c) / 2;
		
		//calcula a área do triangulo
		exp = Math.sqrt(s * (s-a) * (s-b) * (s-c));
		
		System.out.println("A area do triangulo é: " + exp);
	}

}
