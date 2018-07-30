//Javier
package groupproject;
import java.util.Scanner;

public class GroupAmusementPark {

      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Parking park = new Parking(2);
        int choice;
        
        System.out.println("Bienvenidos to J.E.F. Amusement Park!\n\nWe are going to "
                + "need a little info to get started.\nWTF is your full"
                + "name? ");
        String firstName = input.next();
        String lastName = input.nextLine();
        System.out.printf("Hey %s\n\n", firstName);
       
        
        do 
        {
        menuPrompt();
        choice = input.nextInt();
        System.out.println();
         
        switch (choice){
            case 0:
                System.out.println("Later bro");
                break;
            case 1:
                System.out.println("");
                break;
            case 2:
               
                
                System.out.print("0 - 1 hours     ");
                System.out.format("$%.2fhr\n",park.getPrice());
               
                System.out.print("1 - 2 hours     ");
                System.out.format("$%.2fhr\n",park.getPrice());
               
                System.out.print("2 - 3 hours     ");
                System.out.format("$%.2fhr\n",park.getPrice());
                
                System.out.print("3 - 4 hours     ");
                System.out.format("$%.2fhr\n",park.getPrice());   
                
                break;
            case 3:
                System.out.println("");
                break;
            default:
                System.out.println("Why do you have to be difficult?");
                
        }
        }while (choice != 0);
        System.out.println();
      }
    private static void menuPrompt(){
         System.out.println("Use number pad to navigate.\n");
		System.out.println("1    Tickets");
		System.out.println("2    Parking");
		System.out.println("3    Height Requirements");
		System.out.println("0   Exit ");
               
    }
  
}
