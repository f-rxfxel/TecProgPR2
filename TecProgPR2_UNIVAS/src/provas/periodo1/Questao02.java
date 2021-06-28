package provas.periodo1;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int opcao = 0;
		double saldo = 0;
		double receita = 0;
		double despesa = 0;
		
		do {
			System.out.println("Digite uma op��o:\n 1 - Receita\n 2 - Despesa\n 0 - Finalizar");
			opcao = input.nextInt();
			
			switch (opcao) {
			
				case 1: 
				
					System.out.println("Digite o valor da receita:");
					receita = input.nextDouble();
					saldo += receita;
					break;
				
				case 2: 
				
					System.out.println("Digite o valor da despesa:");
					despesa = input.nextDouble();
					saldo -= despesa;
					break;
				
				case 0: 
				
					System.out.println("O saldo final � de R$ " + saldo + "\n");
					opcao++;
					break;
				
				default: 
				
					System.out.println("Op��o inv�lida, tente novamente!");
					break;
				}
			} while(opcao == 0 || opcao == 1 || opcao == 2);
		
		input.close();
	}
}