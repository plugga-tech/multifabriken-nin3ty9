public class Candy
{
    private String candFlavor;
    private int candNumber;

    public Candy(String candFlavor, int candNumber)
    {
        this.candFlavor = candFlavor;
        this.candNumber = candNumber;
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
