package groupproject;

//Elmer

public class Tickets {

    String name;
    int age;
    double price;

    public Tickets(String n, double p, int a){     
       name = n;
       price = p;
       age = a;
    }

    void setPrice(double p) {
        price = p;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    double getPrice() {
        return price;
    }
}
