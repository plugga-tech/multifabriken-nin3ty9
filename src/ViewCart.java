import java.util.List;

public class ViewCart
{
    public static void viewCart(List<Car> cars, List<Pipe> pipes, List<Candy> candies, List<OatMilk> oatMilks)
    {
        System.out.println("Dina valda produkter: ");
        System.out.println("------------------------------------------------------------------------------");
        for (int i = 0; i < cars.size(); i++)
        {
            System.out.println("En st. " + cars.get(i).getCarBrand() + ", Färg: " + cars.get(i).getCarColor()
            + ", Regnr: " + cars.get(i).getCarPlate());
        }
        
        System.out.println("------------------------------------------------------------------------------");
        for (int i = 0; i < pipes.size(); i++)
        {
            System.out.println("Ett st. rör med diameter " + pipes.get(i).getPipeDiam() + " mm och längd "
            + pipes.get(i).getPipeLength() + " mm.");
        }
        
        System.out.println("------------------------------------------------------------------------------");
        for (int i = 0; i < candies.size(); i++)
        {
            System.out.println(candies.get(i).getCandNumber() + " st. godisbitar med smak av " + candies.get(i).getCandFlavor());
        }

        System.out.println("------------------------------------------------------------------------------");
        for (int i = 0; i < oatMilks.size(); i++)
        {
            System.out.println(oatMilks.get(i).getOatLiter() + " liter havremjölk med " + oatMilks.get(i).getOatFat() + "% fett");
        }

    }
}
