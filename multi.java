package test;

import java.util.Scanner;

public class multi 
{
	public static void main(String [] argument) 
	{
			Scanner sc = new Scanner (System.in);
			int a = sc.nextInt();
			int table = a ;	
			   System.out.println("table");
			   for( int i = 0; i<=10; i++) 
			   {
			   System.out.println(table + "*" + i + " = " + (table*i));
			   
			   
			   }
	}
}