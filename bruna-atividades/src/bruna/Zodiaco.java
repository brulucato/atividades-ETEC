package bruna;

import java.util.Scanner;

public class Zodiaco {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int mes;
	    int dia;
	    
	    System.out.print("Informe o m�s que voc� nasceu: ");
	    mes = scan.nextInt();
	    System.out.print("Informe o dia que voc� nasceu: ");
	    dia = scan.nextInt();
	    
	    		
	    scan.close();
	    
	    switch (mes) {
	   
	    case 1:
	        if (dia < 20) {
	           System.out.println("Capricornio");
	        } else {
	            System.out.println("�quario");
	        }
	        break;
	    case 2:
	        if (dia < 18) {
	        	System.out.println("�quario");
	        } else {
	            System.out.println("Peixe");
	        }
	        break;
	    case 3:
	        if (dia < 21) {
	        	 System.out.println("Peixe");
	        } else {
	            System.out.println("�ries");
	        }
	        break;
	    case 4:
	        if (dia < 20) {
	        	System.out.println("�ries");
	        } else {
	            System.out.println("Touro");
	        }
	        break;
	    case 5:
	        if (dia < 21) {
	        	System.out.println("Touro");
	        } else {
	            System.out.println("G�meos");
	        }
	        break;
	    case 6:
	        if (dia < 21) {
	        	System.out.println("G�meos");
	        } else {
	            System.out.println("C�ncer");
	        }
	        break;
	    case 7:
	        if (dia < 23) {
	        	System.out.println("C�ncer");
	        } else {
	        	System.out.println("Le�o");
	        }
	        break;
	    case 8:
	        if (dia < 23) {
	            System.out.println("Le�o");
	        } else {
	            System.out.println("Virgem");
	        }
	        break;
	    case 9:
	        if (dia < 23) {
	        	System.out.println("Virgem");
	        } else {
	            System.out.println("Libra");
	        }
	        break;
	    case 10:
	        if (dia < 23) {
	            System.out.println("Libra");
	        } else {
	            System.out.println("Escorpi�o");
	        }
	        break;
	    case 11:
	        if (dia < 22) {
	        	System.out.println("Escorpi�o");
	        } else {
	            System.out.println("Sagit�rio");
	        }
	        break;
	    case 12:
	        if (dia < 22) {
	        	System.out.println("Sagit�rio");
	        } else {
	        	System.out.println("Capricornio");
	        }
	        break;
		
	}

		
	}
}