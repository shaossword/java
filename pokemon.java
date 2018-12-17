package test;

import java.util.Scanner;

public class pokemon {

	public static void main(String[] args) {
		System.out.println("========================bienvenue =========================");
		System.out.println("etes vous pret pour le fight ou bien preferez-vous partir ?");
		Scanner sc = new Scanner(System.in);
		String question = sc.nextLine();
		if (question=="oui") {
			System.out.println("###################lets fight begin##########################");
		}
		if (question=="non") {
			System.out.println("a la prochaine ");
		}
		System.out.println("choisir votre champion   1)carapuce         2)salameche      3)germignon");
		var champion = sc.nextInt();
		String choix[] = {"carapuce","salameche","germignon","darkrai"};
		for(int i = 0; i < choix.length; i++);
		System.out.println("un roucool shiny apparrait");
		System.out.println("=====================================================================================================");
		System.out.println("=====================================================================================================");
		System.out.println("=====================================================================================================");
		System.out.println("=====================================================================================================");
		int roucool=50 ; 
		int p=0;


		for (int h=0;h>50;h=h+p) ;



		System.out.println("que voulez-vous faire 1/attaquer ou bien essayer de le 2/capturer" );
		var combat = sc.nextInt();
		if (combat==1) {
			System.out.println("choisir votre capa : 1/ lance flame    2/vive-attaque        3/lance soleil");
			var competance = sc.nextInt();
			if(competance==1)

			{                System.out.println("salameche utilise lanceflame");
			roucool=roucool - 13 ;
			p=p+13;

			System.out.println("roocool ennemy prend 13 dmg");
			System.out.println("roucool vie restante"+roucool);
			}
			if(competance==2)

			{            System.out.println("salameche utilise vive-attaque");
			roucool=roucool - 7 ;
			p=p+7;

			System.out.println("roocool ennemy prend 7 dmg");
			System.out.println("roucool vie restante"+roucool);
			}
			if(competance==3)
				p=p+5;
			{            System.out.println("salameche utilise charge");
			roucool=roucool - 5 ;

			System.out.println("roocool ennemy prend 5 dmg");
			System.out.println("roucool vie restante"+roucool);
			}
		}
		if (combat==2) {
			int tabl []= {1,2,3,4,5,6,7,8,9,10};
			int inco = (int)(Math.random() * 10 + 1);
			System.out.println("1/poke ball     2/superball");
			var ball = sc.nextInt();

			if (ball==1) {


				System.out.println("vous utilisez une poké ball");


				if (inco==tabl[3]) {
					System.out.println("bravo vous avez capturer roucool");
					p=p+50;
					if (ball==2) {
						System.out.println("vous utilisez une poké ball");
					}
					if (ball > 7) {
						System.out.println("bravo tu a choisi la facilité");
						p=p+50;
					}
				}
				else {
					System.out.println("dommage try again");
							p=p+0;
							sc.close();
							
				}
				
			}
			
		}
	}
	
}

// conseil utiliser un do while pour pouvoir aller a plus d'un tour et ne pas cumuler deux attaques

