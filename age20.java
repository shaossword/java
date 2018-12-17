package test;

import java.util.Scanner;

public class age20 {
	public static void main(String [] argument) 
	{
		int i =1;
		int count= 0;
		int age =1;
		
		
		Scanner sc = new Scanner (System.in);
		
		while(i<20) {
			System.out.println("age");
			age = sc.nextInt();
			if (age <=20) {
				count++;
			}
		i++;
		}
		
		   System.out.println(count + " moins de 20 ans");
		   sc.close();
}		 
	}

	




/*Ex 08
 Calculer le nombre de jeunes.
 Il s’agit de dénombrer toutes les personnes d'âge inférieur strictement à vingt ans
 parmi un échantillon donné de vingt personnes. Les personnes saisissent leur âge sur
 le clavier.
*/




