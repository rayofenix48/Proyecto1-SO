package menuprincipal;

import java.util.Scanner;
public class MenuPrincipal {
    
	public static void main (String args[] ){
        int indicacion;
	Scanner in= new Scanner(System.in);
	System.out.println("\n\n\t\t Programa para Administrar procesos mediante métodos \n");
			
	do{
            System.out.println("\n\n\t\tSelecciona la opcion que deseas realizar \n\n");
	    System.out.println("\t ********1. Método SJF Apropiativo ************** \n");
	    System.out.println("\t ********2. Método Round Robin ************** \n");	 
	    System.out.println("\t ********0. PRESIONA CERO PARA SALIR DEL PROGRAMA ************** \n\n");
            
	    indicacion=in.nextInt();	
	    switch(indicacion){
			
                case 1:
                    
		    System.out.println("\n\n\n\t\t *** ELEGISTE SJF APROPIATIVO*** \n");
		    
		    
                    break;

		case 2:
                 
		    System.out.println("\n\n\n\t\t *** ELEGISTE ROUND ROBIN ***\n");
                    
                    break;
						
		
						
            }
        }while(indicacion!=0);

	System.out.println("\n\n Gracias vuelve pronto :)  ");
			 					
	}		
						
}
