import java.util.ArrayList;
import java.util.List;

public class Candy
{
    private String candFlavor;
    private int candNumber;

    public Candy(String candFlavor, int candNumber)
    {
        this.candFlavor = candFlavor;
        this.candNumber = candNumber;
    }

    public static List<Candy> candies = new ArrayList<Candy>();

    public static void addCandy()
    {

    }

    public static List<Candy>getCandyList()
    {
        return candies;
    }

    public String getCandFlavor()
    {
        return candFlavor;
    }

    public int getCandNumber()
    {
        return candNumber;
    }

}
