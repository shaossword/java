package test;

import java.util.Scanner;

public class tab {

	public static void main(String[]args) {
		int a = 0 ;
		int i = 0;
		int tab1 [] = {4 , 67 , 25 , 87 }; //declarer tableau
		double tab2 [] = {4.5, 67, 25.50, 87.00 };
		char tab3 [] = {'r', '2', '?' , '+' };
		String tab4 [] = {"Robert","Noemie", "David" , "Bertrand"};

		System.out.println("afficher " + tab1[0]); //affichage tableau (a partir de 0
		tab1 [2] = 42  ; 
		System.out.println("afficher " + tab1[2]);

		for  (i = 0 ; i <= 3 ; i++) { //faire un decompte
			if (i == 0 ) {
				System.out.println('r');
				i++;
				if (i == 1) {
					System.out.println('2');
					i++;
					if (i == 2) {
						System.out.println('?');
						i++;
						if (i == 3) {
							System.out.println('+');


							while ( a < tab1.length) 
								a++;
							System.out.println(tab1.length);
						}

					}
				}
			}
		}
	}
}




/*Exercice10
Déclarez et initialisez une variable tab1 de type tableau contenant les 4 éléments suivants : 4, 67, 25, 87.
Déclarez et initialisez une variable tab2 de type tableau contenant les 4 éléments suivants : 4.5, 67, 25.50, 87.00
Déclarez et initialisez une variable tab3 de type tableau contenant les 4 éléments suivant : 'r', '2', '?' , '+'.
Déclarez et initialisez une variable tab4 de type tableau contenant les 4 éléments suivant : "Robert",
"Noemie", "David" , "Bertrand".
Affichez le premier élément de tab1
Remplacez la valeur de tab1 qui vaut 25 par la valeur 42.
Afficher via une boucle for , toutes les valeurs de tab3.
Affichez la taille de tab1*/