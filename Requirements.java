package requirements;

import java.io.*;
import java.util.*;
//Elmer

public class Requirements {
        public static void main(String[] args) {

    class requirement {

        public double height;
        public String rideName;
        public int age;
    }
    public enum Requirements (String c, double h, int a){
String rideName = c;
        int customerAge = a;
        double height = h;

    }
    String getRideName() {
        return rideName;
    }

    double getHeight() {
        return height;
    }

    int getAge() {
        return age;
    }
}
