package test;

public class tableaucinqentier {

	public static void main(String[] args) {
		char tab [] = {'a','b','c','d','e'} ; // declaration tableau nombre entier
		int a = 0 ; //declaration de a nombre aleatoir
		int b = 0 ;
		int c = 0 ;
		int d = 0 ;
		int e = 0 ;
		int i = 0 ; //i boucle compteur

		while (i < 1) { //tour de boucle 

			if (a < 10)//condition boucle
			{
				a = (int)( Math.random() * 10+1);//nombre aleatoir * 10    *10 valeur maximal      +1  valeur minimal
				System.out.println("nombre "+a);

				b = (int)( Math.random() * 10+1);
				System.out.println("nombre "+b);

				c = (int)( Math.random() * 10+1);
				System.out.println("nombre "+c);

				d = (int)( Math.random() * 10+1);
				System.out.println("bnombre "+d);

				e = (int)( Math.random() * 10+1);
				System.out.println("nombre "+e);
				i++;//relance de la boucle	
			}
			else {
				break ;
			}
		if (a ==4 || b == 4 || c == 4 || d == 4 || e == 4) {
			System.out.println("trouver");
		}else {
			System.out.println("inconnu");
		}
	}
}
}





/*Exercice 12
Déclarez une variable de type tableau de 5 entiers.
Remplissez ce tableau avec des valeurs aléatoires comprises entre 0 et 10.
Indiquez si la valeur 4 est dans le tableau, si oui indiquez sa position.*/

