package test;

import java.util.Scanner;

public class Nbrentier  
	{
		public static void main(String [] args) 		
		{
			boolean bon = true ;
			
			while(bon) {
			int premier = 0;
			int second = 0;
			
			
			Scanner sc = new Scanner (System.in);
			
			
			System.out.println("entrer votre premier nombre");			
			premier = sc.nextInt(); // demande le premier nombre
			
			
			
			System.out.println("entrer votre second nombre");
			second = sc.nextInt(); // demande le second nombre
			System.out.println();
			
			
			
			
			if (premier < 1000 && premier > -1000  && second < 1000 && second > -1000 ) {
				bon = true;
				System.out.println("merci de mettre l'operateur");
				
				sc.nextLine(); //reinit du scan pour interprete le string
				
				String oper = sc.nextLine(); //il rentre l'operateur
				
				switch (oper)
				{
				case "+":
				System.out.println(premier + second);
				break;
				case "-":
				System.out.println(premier - second);
				break;
				case "*":
				System.out.println(premier * second);
				break;
				case "/":
				System.out.println(premier / second);
				break;
				default:
					System.out.println("votre saisis est incorecte!");
				}
			}else {
				System.out.println("erreur 8");
			}
			}
		}
			}
		
/*Ex 06 ok
Récupérer  la saisie de 2 nombres entiers, puis la saisie d'un opérateur '+', '-', '*' ou '/'.
 Si l'utilisateur entre un opérateur erroné, le programme affichera un message d'erreur.
 Dans le cas contraire, le programme effectuera l'opération demandée (en prévoyant le
 cas d'erreur "division par 0"), puis affichera le résultat.
 
 hypothèses :
  - les bornes -1000 et 1000 sont acceptées
  - si l'opérateur n'est pas correct, on effectue une addition
  
  V0 : pas de prise en compte de la conception du programme (séparation entre trt et affichage)
  */
			
	

