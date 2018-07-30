package groupproject;

//Elmer
public class Rides
{

    public double height;
    public String rideName;
    public int age;

    public Rides(String c, double h, int a)
    {
        rideName = c;
        age = a;
        height = h;

    }

    String getRideName()
    {
        return rideName;
    }

    double getHeight()
    {
        return height;
    }

    int getAge()
    {
        return age;
    }

}
