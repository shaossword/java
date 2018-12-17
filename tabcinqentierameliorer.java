package test;

public class tabcinqentierameliorer {

	public static void main(String args[]) {

		int i = 0 ;
		int tab [] =  new int[5] ; // declaration tableau nombre entier


		for (i = 0 ; i<tab.length; i++) 
		{// parcour la ligne
			tab [i] = (int)(Math.random() * 10+1);//entrer entier aleatoir ave i qui parcourai la ligne	 

			System.out.println(tab[i]);
		}
		for (int resul = 0; resul < tab.length; resul++)
		{
			if (tab [resul] == 4) 
			{
				System.out.println("position " + (resul + 1));
			}
		}
	}
}

