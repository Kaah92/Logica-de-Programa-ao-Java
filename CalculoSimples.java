package Exercicio;

import java.util.Locale;
import java.util.Scanner;

public class CalculoSimples {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double valorTotal1;
		
		int codigoPeca1 = sc.nextInt();
		int numeropeças1 = sc.nextInt();
		double valorUnitario1 = sc.nextDouble();
		
		int codigoPeca2 = sc.nextInt();
		int numeropeças2 = sc.nextInt();
		double valorUnitario2 = sc.nextDouble();
		
		valorTotal1 = numeropeças1 * valorUnitario1 + numeropeças2 * valorUnitario2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal1);
	
		sc.close();
		
	}

}

/*Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário 
 de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. 
 Após, calcule e mostre o valor a ser pago.
 
Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente
 dois inteiros e um valor com 2 casas decimais.
 
Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço
após os dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto*/

