/*
 * Autor: Matheus Scaketti
 * Data: 12/04/2016
 * 
 * Lista: -
 * Exercício: -
 * 
 * Descrição:
 * Questão da prova de algoritmos onde é solicitado um número ímpar ao usuário
 * e a partir disso é construido uma pirâmide invertida.
 * 
*/

import java.util.Scanner;

public class ImpPiramide {
    public static void main(String[] args){
        
        int v, h, aux = 0, j, k, linha = 0;
        Scanner l = new Scanner(System.in);
        
        
        while(aux == 0){
            System.out.println("Digite um número maior que zero e que não seja par: ");
            v = l.nextInt();
            
            if(v%2 == 0){
            System.out.println("Não é permitido números pares.");
            }else{
                j = v;
                
                //for para contagem de linhas
                for(int i = v; i >= ((v+1)/2); i--){
                    
                    //for para contagem de &
                    for(h = 1; h <= j; h++){
                        System.out.print("& ");
                    }
                    System.out.print("\n");
                    j -= 2;
                    
                    //for para contagem de espaços
                    linha++;
                    for(k = 1; k <= linha; k++){
                        System.out.print("  ");
                    }
                }
                aux = 1;
            }
        }
        l.close();        
    }
}