package bruna;

import java.util.Scanner;

public class Zodiaco {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int mes;
	    int dia;
	    
	    System.out.print("Informe o mês que você nasceu: ");
	    mes = scan.nextInt();
	    System.out.print("Informe o dia que você nasceu: ");
	    dia = scan.nextInt();
	    
	    		
	    scan.close();
	    
	    switch (mes) {
	   
	    case 1:
	        if (dia < 20) {
	           System.out.println("Capricornio");
	        } else {
	            System.out.println("Áquario");
	        }
	        break;
	    case 2:
	        if (dia < 18) {
	        	System.out.println("Áquario");
	        } else {
	            System.out.println("Peixe");
	        }
	        break;
	    case 3:
	        if (dia < 21) {
	        	 System.out.println("Peixe");
	        } else {
	            System.out.println("Áries");
	        }
	        break;
	    case 4:
	        if (dia < 20) {
	        	System.out.println("Áries");
	        } else {
	            System.out.println("Touro");
	        }
	        break;
	    case 5:
	        if (dia < 21) {
	        	System.out.println("Touro");
	        } else {
	            System.out.println("Gêmeos");
	        }
	        break;
	    case 6:
	        if (dia < 21) {
	        	System.out.println("Gêmeos");
	        } else {
	            System.out.println("Câncer");
	        }
	        break;
	    case 7:
	        if (dia < 23) {
	        	System.out.println("Câncer");
	        } else {
	        	System.out.println("Leão");
	        }
	        break;
	    case 8:
	        if (dia < 23) {
	            System.out.println("Leão");
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
	            System.out.println("Escorpião");
	        }
	        break;
	    case 11:
	        if (dia < 22) {
	        	System.out.println("Escorpião");
	        } else {
	            System.out.println("Sagitário");
	        }
	        break;
	    case 12:
	        if (dia < 22) {
	        	System.out.println("Sagitário");
	        } else {
	        	System.out.println("Capricornio");
	        }
	        break;
		
	}

		
	}
}