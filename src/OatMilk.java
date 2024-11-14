import java.util.ArrayList;
import java.util.List;

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

    public static List<OatMilk> oatMilks = new ArrayList<OatMilk>();

    public static void addOatMilk()
    {
        boolean corrChoice1 = false;
        boolean corrChoice2 = false;
        double oatfat;
        double oatLiter;

        do
        {
            App.clearTerm();
            System.out.println("-=Havremjölk=-");
            System.out.println("Vilken fetthalt ska havremjölken ha? ");
            if (App.input.hasNextDouble())
            {
                oatfat = App.input.nextDouble();
                corrChoice1 = true;
            }
            else
            {
                System.out.println("Du måste ange ett nummer (minst 0,1). ");
                oatfat = 0;
                corrChoice1 = false;
            }
            
        } while (!corrChoice1);

        do
        {
            App.clearTerm();
            System.out.println("-=Havremjölk=-");
            System.out.println("Hur många liter vill du beställa? ");
            if (App.input.hasNextDouble())
            {
                
                oatLiter = App.input.nextDouble();
                corrChoice2 = true;
            }
            else
            {
                System.out.println("Du måste ange en mängd (minst 0,5). ");
                oatLiter = 0;
                corrChoice2 = false;
            }
            
        } while (!corrChoice2);
        
        OatMilk addedOatMilk = new OatMilk(oatfat, oatLiter);
        oatMilks.add(addedOatMilk);
        App.clearTerm();
        System.out.println("-=Havremjölk=-");
        System.out.println(oatLiter + " liter med " + oatfat + "% fetthalt har lagts till i varukorgen. ");
        App.input.nextLine();
    }
    
    public static List<OatMilk>getOatMilkList()
    {
        return oatMilks;
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