package desafios;

/*Você está desenvolvendo um sistema para um local de eventos, neste local, é necessário que a 
 * entrada seja permitida apenas para pessoas acima de 18 anos. 
 * Faça um programa para ler um número N, a idade de N pessoas. 
 * Depois disso, coloque a idade mínima permitida  para se entrar no local, conforme exemplo.
 * Retorne às idades de quem não puder entrar.
 * 
 * Entrada
 * 
 * A entrada será composta na primeira linha pelo tamanho da array e nas linhas subsequentes pelas 
 * idades que preenchem essa array
 * 
 * Saída
 * 
 * A saída deverá retornar as idades que não são permitidas a entrada, conforme exemplo abaixo. 
 * Entrada: 4 
 * Saída: 18 22 15 50
 * 
 * Nao poderao entrar as idades: 15
 * */

import java.util.Scanner;

public class IdadeProibida {

	public static void main(String[] args) {
		

        Scanner scan = new Scanner(System.in);
        int idadePessoa;
        System.out.println("Informe a quantidade de pessoas: \n ");
        int qtdPessoas = scan.nextInt();
 

        int[] idade = new int[qtdPessoas];
        
        System.out.println("Informe as respectivas idades: \n ");
        for (int i = 0; i < qtdPessoas; i++){
        	
        	idadePessoa = scan.nextInt();
            idade[i] =  idadePessoa;
        }


        System.out.println("Nao poderao entrar as idades: ");
        for (int i = 0; i < qtdPessoas; i++){
            if (idade[i] < 18 ){
                System.out.println(     idade[i]    );
            }

        }

	}

}
