package bruna;

import java.util.Scanner;

public class Estacoes {

	public static void main(String[] args)
	{
	    Scanner scan = new Scanner(System.in);

	    System.out.print("Informe o mês: ");
	    int mes = scan.nextInt();
	    System.out.print("Informe o dia: ");
	    int dia = scan.nextInt();

	    if((mes == 12 && dia >= 16 && dia <= 31) || (mes == 1 && dia >=1 && dia <= 31) || (mes == 2 && dia >= 1 && dia <= 28) || (mes == 3 && dia >=1 && dia <=15))
	    {
	        System.out.println("Inverno");
	    }
	    else if((mes == 3 && dia >= 16 && dia <= 31) || (mes == 4 && dia >=1 && dia <= 30) || (mes == 5 && dia >= 1 && dia <= 31) || (mes == 6 && dia >=1 && dia <=15))
	    {
	        System.out.println("Primavera");
	    }
	    else if((mes == 6 && dia >= 16 && dia <= 30) || (mes == 7 && dia >=1 && dia <= 31) || (mes == 8 && dia >= 1 && dia <= 31) || (mes == 9 && dia >=1 && dia <=15))
	    {
	        System.out.println("Verão");
	    }
	    else if((mes == 9 && dia >= 16 && dia <= 30) || (mes == 10 && dia >=1 && dia <= 31) || (mes == 11 && dia >= 1 && dia <= 30) || (mes == 12 && dia >=1 && dia <=15))
	    {
	        System.out.println("Outono");
	    }
	    
	    scan.close();
	    
	}
}