package test;

import java.util.Scanner;

public class Coucou {  public static void main(String [] arg) {
    System.out.println("coucou quel est ton nom ?");
    
    Scanner sc = new Scanner(System.in);
    
    String str = sc.nextLine();
    System.out.println("bienvenue" + str);
}
}