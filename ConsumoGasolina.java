package Exercicio;

import java.util.Locale;
import java.util.Scanner;
		
public class ConsumoGasolina {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
				
		int x = sc.nextInt();
		double y = sc.nextDouble();
				
		double consumoGasolina = x / y;
		
		System.out.printf("%.3f km/l ", consumoGasolina);
					
		sc.close();
	}

}
