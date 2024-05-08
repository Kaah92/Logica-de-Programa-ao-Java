package Exercicios;

import java.util.Scanner;

public class CondicionalEncadeada {
	
	public static void main(String[] args) {
		Scanner std = new Scanner(System.in);
		
		int nota1,nota2,total;
		
		nota1 = std.nextInt();
		nota2 = std.nextInt();
		
		total = (nota1 + nota2)/2;
		
		if (total == 7)//true
			System.out.println("Nota: " + total + " - Aluno Aprovado");
		
		else if (total >= 5 && total <7)//true or false
			System.out.println("Nota: " + total + " - Aluno em recuperação");
			
		else 
			System.out.println("Nota: " + total + " - Aluno Reprovado");
		
		std.close();
		
		}
}
