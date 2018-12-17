package test;

import java.util.Scanner;

public class  NetX
	{
		public static void main(String [] argument) 
		{
				Scanner sc = new Scanner (System.in);
				System.out.println("first");
				int t = sc.nextInt();
				int table = t ;	
				
				System.out.println("second");
      	        int b = sc.nextInt();
		   
		        
				   System.out.println("table");
				   for( int c = b; c>=0; c++) 
					
				   {
				   System.out.println(table + "*" + c + " = " + (table*c));
				   }
		}
	}
		

/**Ex 07
Ecrire un programme qui calcule les N premiers multiples d'un nombre entier X, N et X
étant entrés au clavier.
Il est demandé de choisir la structure répétitive (for, while, do...while) la mieux
appropriée au problème.
On ne demande pas pour le moment de gérer les débordements (overflows) dus à des
demandes de calcul dépassant la capacité de la machine.
	 * 
	 * ****************************************************   Cherchez l'erreur ...
	 */

