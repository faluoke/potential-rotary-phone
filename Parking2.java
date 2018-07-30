//faruk
//package groupproject;

public class Parking
{
    private int carNum, hrNum;
    private double price;
    
    public Parking(int c, double p, int h)
    {
        carNum = c;
        price = p;
        hrNum = h;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public int getCarNum()
    {
        return carNum;
    }
    
    public int getHrNum()
    {
        return hrNum;
    }
    
    public void setPrice(double p)
    {
        price = carNum * hrNum;
    }
    
}
