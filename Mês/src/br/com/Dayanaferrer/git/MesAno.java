package br.com.Dayanaferrer.git;
import java.util.Scanner;

/* Fa�a um programa que solicite ao usu�rio entrar com o
   n�mero do m�s e exiba na tela o nome do m�s.
			ENTRADA: 12
			SA�DA: DEZEMBRO */

public class MesAno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		System.out.println("Informe um n�mero para verificar o M�s Correspondente (1 a 12):");
		int numero = sc.nextInt();
		
		switch (numero) {
		case 1:
			System.out.println("Janeiro");
	        break;
		case 2:
	        System.out.println("Fevereiro");
	        break;
	    case 3:
	        System.out.println("Mar�o");
	        break;
	    case 4:
	        System.out.println("Abril");
	        break;
	    case 5:
	        System.out.println("Maio");
	        break;
	    case 6:
	        System.out.println("Junho");
	        break;
	    case 7:
	        System.out.println("Julho");
	        break;
	    case 8:
	        System.out.println("Agosto");
	        break;
	    case 9:
	        System.out.println("Setembro");
	        break;
	    case 10:
	        System.out.println("Outubro");
	        break;
	    case 11:
	        System.out.println("Novembro");
	        break;
	    case 12:
	        System.out.println("Dezembro");
	        break;
	    default:
	        System.out.println("M�s Inv�lido");
		}
		
							 			
			 }

	}

