package test;

import java.util.Scanner;

public class chaine 
{

	public static void main(String[]args) 
	{

		Scanner sc = new Scanner(System.in);

		int compt = 0 ;

		System.out.println("entrer une chaine de caracter");
		String text = sc.nextLine();
		System.out.println(text);

		System.out.println("entrer une lettre");
		String lettre = sc.nextLine();
		System.out.println(lettre);

		char ch = lettre.charAt(0);
		for(int choix=0; choix<text.length();choix++)
		{
			if(text.charAt(choix) == ch) 
			{ 
				compt++;
			}
		}
		System.out.println("il y a " + compt + " fois " + ch);			
		sc.close();
	}
}




/*Exercice 13
1.demander à un utilisateur de saisir une chaine de caractère
2.demander à cet utilisateur de saisir une lettre
3.calculez le nombre de fois où cette lettre est présente dans la chaine saisie en 1.*/



