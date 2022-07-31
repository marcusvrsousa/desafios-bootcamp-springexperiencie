package desafios;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class LeituraImpressaoNomes {
	public static void main(String[] args) {
		
		
	/*Leia 10 nomes e imprima o terceiro, sétimo e nono. */
		
		
		String[] nomes = new String[9];
		
		try (Scanner sc = new Scanner(System.in)) {
			
					
			for(int i=0 ; i<10 ; i++) {
				System.out.println("Informe seu nome: ");
				nomes[ i ] = sc.nextLine();
				
			}		
	
		}catch (Exception e){
			
				System.out.printf(nomes[2] + "\n");
				System.out.printf(nomes[6] + "\n");
				System.out.printf(nomes[8] + "\n");
			
		}
			
	}

}


