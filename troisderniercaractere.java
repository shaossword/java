package test;

import java.util.Scanner;

public class troisderniercaractere {

	public static void main(String args[]) {


		Scanner sc = new Scanner(System.in);
		String mot = sc.nextLine();
		int taille = mot.length();
		{
			{
				int sousChaine = taille.slice (-3);
				System.out.println(mot);
				//System.out.println(mot.substring(0, mot.length()-3));
				/*int sousChaine = mot.slice(0,mot.length()-3);
				System.out.println(sousChaine);*/
			}
		}
	}
}


/*Exercice 15
Demandez la saisie d'un mot à l'utilisateur
Afficher les trois derniers caractères de ce mot
Afficher ce mot sans les deux premier caractère et sans les trois dernier caractères
(NB : Gérez le cas où le mot n'est assez long )*/

