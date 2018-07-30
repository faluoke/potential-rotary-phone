package requirements;

import java.io.*;
import java.util.*;
//Elmer
   public static class Ticket {

    long number;
    String category;
    String holder;
    Date date;
    double price;
    boolean status;
    Random rand;

    class AdmissionTickets(String c, Date d , double p, boolean b){
    
    rand = new Random();
        number = rand.nextLong();
        holder = h;
        date = d;
        price = p;
        status = b;
    }

    void setPrice(double p) {
        price = p;
    }

    void changePurchaseStatus(boolean newStatus) {
        status = newStatus;
    }

    Long getNumber() {
        return number;
    }

    String getCategory() {
        return category;
    }

    String getHolder() {
        return holder;
    }

    String getDate() {
        return Date;
    }

    double getPrice() {
        return price;
    }
}
