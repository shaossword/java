package test;

import java.util.Scanner;

public class jeunemoyenvieux 
{

		public static void main(String [] argument) 
		{
			int nbrutil = 1; //nombre boucle
			int jeunes = 0;
			int moyens = 0;
			int vieux = 0;
			int mort = 0;
			int age = 1;
			Scanner sc = new Scanner (System.in);
			while(nbrutil < 5) //le programme regarde ou il en est par rapport 
			{ 	
				System.out.println(" rentrez votre age "+ nbrutil);
				age = sc.nextInt();
				if (age < 100)
				{
					
					if (age <20) 
					{
						jeunes++;
					}
					else if (age >=20 && age <=40) 
					{
						moyens++;
					}
					else if (age>40) 
					{
					vieux++;
					}
				}
				else
					{
						System.out.println("tu es trop vieux le programme s'arrete");
						mort++;
						break;
					}
				nbrutil++;
			}	
			System.out.println("il y a "+ jeunes + " de moin de 20 ans");	
			System.out.println("il y a "+ moyens + " de moin de 20 a 40 ans ");
			System.out.println("il y a "+ vieux+ " de moin de + de 40 ans");
			System.out.println("il y a "+ mort + " de moin de 100 ans");
		}		    
			   			

}		
		




/*Ex 09
Calculer le nombre de jeunes, de moyens et de vieux
 
 Il s’agit de dénombrer les personnes d'âge inférieur strictement à 20 ans, les
 personnes d'âge supérieur strictement à 40 ans et celles dont l'âge est compris entre
 20 ans et 40 ans (20 ans et 40 ans y compris).
 Le comptage est arrêté dès la saisie d’un centenaire. Le centenaire est compté.
 Donnez le programme java correspondant qui affiche les résultats.*/





