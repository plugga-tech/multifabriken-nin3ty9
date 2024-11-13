public class OatMilk
{
    private double oatFat;
    private double oatLiter;

    public OatMilk(double oatFat, double oatLiter)
    {
        this.oatFat = oatFat;
        this.oatLiter = oatLiter;
    }

    public OatMilk(int oatFat, double oatLiter)
    {
        this.oatFat = (double) oatFat;
        this.oatLiter = oatLiter;
    }

    public OatMilk(double oatFat, int oatLiter)
    {
        this.oatFat = oatFat;
        this.oatLiter = (double)oatLiter;
    }
    
    public OatMilk(int oatFat, int oatLiter)
    {
        this.oatFat = (double) oatFat;
        this.oatLiter = (double) oatLiter;
    }
    
    public double getOatFat()
    {
        return oatFat;
    }

    public double getOatLiter()
    {
        return oatLiter;
    }

}