package groupproject;

//Elmer

public class Tickets {

    String name;
    int age;
    double price;

    public Tickets(String n, int a)
    {     
       name = n;
       age = a;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    double getPrice() {
        if(age < 6)
        {
            System.out.println("Cannot get Rides");
            
        }
        else if(age <= 21)
        {
            price = 8.99;
        }
        else if(age > 21)
        {
            price = 15.99;
        }
        return price;
    }
}
