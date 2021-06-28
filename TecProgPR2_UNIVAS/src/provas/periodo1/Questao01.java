package provas.periodo1;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		float[] peso = new float[100];
		float[] altura = new float[100];
		float[] imc = new float[100];
		int contador = 0;
		
		for(int i = 0; i < 100; i++) {
			
			System.out.println("Digite o peso da " + (i + 1) + "ª pessoa:");
			peso[i] = input.nextFloat();

			System.out.println("Digite a altura da " + (i + 1) + "ª pessoa: (Em metros)");
			altura[i] = input.nextFloat();
			
			imc[i] = peso[i] / (altura[i] * altura[i]);
			
			if(imc[i] >= 18.5 && imc[i] <= 24.9){
				contador++;
				}
			}
		
		System.out.println("A porcentagem de pessoas com peso normal é de " + contador + "%");
		
		input.close();
	}
}