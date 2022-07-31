package desafios;
import java.util.Scanner;

public class mediaPonderada {

	public static void main(String[] args) {
		
		/* Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. 
		 * Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. 
		 * Apresente a média ponderada para cada um destes conjuntos de 3 valores, 
		 * sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro 
		 * valor tem peso 5. */
		
		Scanner input = new Scanner(System.in);
		//JOptionPane.showInputDialog(null, "Insira a qtd de casos: ");
		System.out.println("Informe a quantidade de casos: ");
        int casos = input.nextInt();
        int cont = 0;
        double array[] = new double [casos];
        
        while (cont < casos){
        	System.out.println("Informe os 3 valores: ");
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
	
            array[cont] = ((a*2)+(b*3)+(c*5))/10; 
              
            cont++;
        }
        
        
        String str;
        
        for(int i=0; i<array.length; i++) {
        	str = String.format("%.01f", array[i]);
        	System.out.print("A media ponderada e: " + str + "\n");
        	
        }

	}

}
