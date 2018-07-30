//Javier
package groupproject;

import java.util.ArrayList;
import java.util.Scanner;

public class GroupAmusementPark
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        

        System.out.println("Bienvenidos to J.E.F. Amusement Park!\n\nWe are going to "
                + "need a little info to get started.\nWhat is your first name?");
        String firstName = input.next();
        System.out.printf("Hey %s how old are you?\n", firstName);
                    int age = input.nextInt();
                    System.out.println("What is your height?");
                    double height = input.nextDouble();
        Tickets tickets = new Tickets(firstName, age);
        
        Rides mtrc = new Rides("Mine trian roller coaster", 4, 6);
        Rides floorless = new Rides("Floorless", 4, 6);
        Rides hyperCoaster = new Rides("Hypercoaster", 4, 6);
        Rides wingCoaster = new Rides("Wing Coaster", 4.5, 6);
        Rides diveCoaster = new Rides("Dive Coaster", 5, 12);
        Rides mountainCoaster = new Rides("Mountain Coaster", 5, 12);
        

        ArrayList<Rides> rcRides = new ArrayList<Rides>();
        rcRides.add(mtrc);
        rcRides.add(floorless);
        rcRides.add(hyperCoaster);
        rcRides.add(wingCoaster);
        rcRides.add(diveCoaster);
        rcRides.add(mountainCoaster);

        int choice;

        do
        {
            menuPrompt();
            choice = input.nextInt();
            System.out.println();

            switch (choice)
            {
                case 0:
                    System.out.println("Later bro");
                    break;
                case 1:
                    
                    System.out.println("You can ride:");
                    for(Rides el : rcRides)
                    {
                        if(el.getAge() <= age && el.getHeight() <= height)
                        {
                            
                            System.out.printf("%s%n",el.getRideName());
                        }
                        
                        
                    }
                    if(age < 8){
                       System.out.println("No rides are avalible"); 
                    }
                    else if(age > 65){
                        
                        System.out.println("PLEASE GO TO FRONT DESK AND SIGN WAIVER");
                    }
                    
                    //
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Please enter hr of parking\nParking is $2/hr");
                    int hrs = input.nextInt();
                    Parking park = new Parking(hrs);
                    System.out.printf("Price: $%.2f%n", park.getPrice());
                    System.out.println("");
                    break;
                case 3:
                    System.out.printf("Admission Ticket $: %.2f%n", tickets.getPrice());
                    System.out.println("");
                    break;
                default:
                    System.out.println("Why do you have to be difficult?");
                    System.out.println("");

            }
        } while (choice != 0);
        System.out.println();
    }

    private static void menuPrompt()
    {
        System.out.println("Use number pad to navigate.\n");
        System.out.println("1    Rides");
        System.out.println("2    Parking");
        System.out.println("3    Ticket");
        System.out.println("0    Exit ");

    }

}
