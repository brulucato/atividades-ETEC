package bruna;

import java.util.Scanner;

public class Bissexto {

    public static void main(String[] args) {

    	Scanner scan = new Scanner(System.in);
    	int year;
    	    	
    	System.out.print("Informe o ano: ");
    	year = scan.nextInt();
        
    	boolean isLeap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }

        if(isLeap == true) {
        	System.out.println(year + " é bissexto");
        }  
        else {
            System.out.println(year + " não é bissexto.");
        }
        
        scan.close();
    }
}