interface WaterBottleInterface
{
    String color = "blue";
    double maxQty = 500.00;
    void fillUp();
}

class Q1Interfaces implements WaterBottleInterface
{
    public static void main(String args[])
    {
        System.out.println(color);

        Q1Interfaces sk = new Q1Interfaces();
        sk.fillUp();
    }

    public void fillUp()
    {
        System.out.println("Bottle is full");
    }
}