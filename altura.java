package arranjoAltura;

import java.util.Scanner;

public class altura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double alturaMedia = 0;
		int qtdMenorIdade = 0;
		
		System.out.println("Quantas pessoas serao digitagas : ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		for (int i = 0; i < altura.length; i++) {
			System.out.printf("\nDados da %da pessoa :" , i + 1);
			System.out.printf("\nDigite o nome : ");nome[i] = sc.nextLine();
			System.out.printf("\nDigite a idade : ");idade[i] = sc.nextInt(); sc.nextLine();
			System.out.printf("\nDigite a altura : ");altura[i] = sc.nextDouble();sc.nextLine();
			
			alturaMedia += altura[i];
			
			if (idade[i] <= 16) {
				qtdMenorIdade ++;
			}
		}
		double MediaAltura = alturaMedia / altura.length;
		double PorceMenorIdade = (qtdMenorIdade * 100) / n;
		
		System.out.printf("Altura media : %.2f\n" , MediaAltura);
		System.out.printf("Pessoas com menos de 16 anos : %.2f\n " , PorceMenorIdade);
		
		for (int i = 0; i < altura.length; i++) {
			if (idade[i] <= 16) {
				System.out.println(nome[i] + " | " + idade[i]);
			}
		}
		sc.close();
	}
}
