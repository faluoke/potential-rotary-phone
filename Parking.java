//faruk
//package groupproject;
package GroupProject;
public class Parking
{
    private int hrNum;
    private double price;
    
    public Parking(int h)
    {
        hrNum = h;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public int getHrNum()
    {
        return hrNum;
    }
    
    public void setPrice()
    {
        price = 2 * hrNum;
    }
    
}
