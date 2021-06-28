package provas.periodo1;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] nota = new int[50];
		int apr = 0;
		int rec = 0;
		int dep = 0;
		
		for(int i = 0; i < 50; i++) {
			
			System.out.println("Digite a nota do " + (i + 1) + "° aluno:");
			nota[i] = input.nextInt();
			
				if(nota[i] >= 60) {
					apr++;
				} else if(nota[i] < 60 && nota[i] >= 30) {
					rec++;
				} else {
					dep++;
				}
			}
		
		System.out.println("A porcentagem de alunos aprovados é de " + (apr * 2) + "%");
		System.out.println("A porcentagem de alunos em recuperação é de " + (rec * 2) + "%");
		System.out.println("A porcentagem de alunos em depencência é de " + (dep * 2) + "%");
		
		input.close();
	}
}