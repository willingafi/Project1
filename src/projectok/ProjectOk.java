 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectok;
import java.util.Scanner;

/**
 *
 * @author willy-ngafi
 */
public class ProjectOk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  /*      System.out.println("Entrez un texte");
        Scanner a=new Scanner(System.in);
        String chaine=a.nextLine();
        System.out.println(chaine);
      
        System.out.println("Veuillez entrez svp");
        Scanner b=new Scanner(System.in);
        int x=b.nextInt();
        Scanner c=new Scanner(System.in);       
        int y=c.nextInt();
        
       if (x>y) 
            System.out.println(x+ " est supérieur a "+y);
        else
            System.out.println(y+ " est supérieur a "+x);
        
        
        switch(x+y){
            case 0: System.out.println("2");
            case 1: System.out.println("1");
            default: System.out.println("Pas de solutions");
        }
*/      
        int u;
        Scanner d=new Scanner(System.in);
        /* do {
        System.out.println("Menu des opérations \n 1- Addition \n 2-Multiplication");
        System.out.println(" 3- Division \n 4- Soustraction \n 5- Quitter/Sortir");
        Scanner d=new Scanner(System.in);
        System.out.println("Faites votre choix");
         u=d.nextInt();
         switch(u){
             case 1: System.out.println("La somme de x et y est: "+(x+y));
                break; 
             case 2: System.out.println("La multiplication de x par y donne: "+(x*y));
                break; 
             case 3: 
                    {
                        if(y!=0)
                        System.out.println("La division de x par y donne: "+(x/y));
                            break; 
                    }
             case 4: System.out.println("La soustraction de x et y est: "+(x-y));
                break; 
             case 5: System.out.println("Fermeture");
                break; 
                    
                    }
        
        }while ((u>=1)&&(u<5));
        */
        System.out.println("Entrez un nombre");
        u=d.nextInt();
        for(int i=1; i<=u; i++)
        {
            for(int j=0; j<=u; j++)
                System.out.println("\n " +i+ "* "+ j + "=" +(i*j));
            System.out.println("\n");
        }
    }
        
    }
           