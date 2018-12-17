package test;

import java.util.Scanner;

public class chainemaj {
	public static void main(String args[]) {

		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ecris ");
		String chaine = sc.nextLine();
		System.out.println(chaine.toUpperCase());
		
		System.out.println(chaine.toLowerCase());
		
		System.out.println(chaine = chaine.substring(0,1).toUpperCase() + chaine.substring(1).toLowerCase());
		
}
}


/*Exercice 14
1.demander à un utilisateur de saisir une chaine de caractère
2.retournez cette chaine en majuscule
3.retournez cette chaine avec la première lettre en majuscule*/

