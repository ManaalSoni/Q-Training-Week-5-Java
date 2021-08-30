import java.util.Scanner;
abstract class vehicles
{
    abstract void fuel(String x);
}

public class Q1Abstract extends vehicles
{
    void fuel(String fuelType)
    {
        System.out.println("This car needs "+fuelType);
    }

    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        vehicles c = new Q1();
        System.out.println("Enter the car fuel type");
        String type = s.next();
        c.fuel(type);

    }
}
