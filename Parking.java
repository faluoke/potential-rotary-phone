//faruk
//package groupproject;
package groupproject;
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
        
        return hrNum * 2;
    }
    
    public int getHrNum()
    {
        return hrNum;
    }
    
}
