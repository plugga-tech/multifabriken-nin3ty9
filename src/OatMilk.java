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
                
                if (oatfat < 0.1)
                {
                    System.out.println("Minsta fetthalt är 0,1%. ");
                    corrChoice1 = false;
                    App.input.nextLine();
                    App.input.nextLine();
                } 
                else
                {
                    corrChoice1 = true;
                }
            }
            else
            {
                System.out.println("Du måste ange en fetthalt (med siffror), decimaler anges med komma. ");
                App.input.nextLine();
                App.input.nextLine();
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
                
                if (oatLiter < 0.5)
                {
                    System.out.println("Minsta mängd är 0,5 liter. ");
                    corrChoice2 = false;
                    App.input.nextLine();
                    App.input.nextLine();
                }
                else 
                {
                    corrChoice2 = true;
                }
            }
            else
            {
                System.out.println("Du måste ange en mängd (med siffror), decimaler anges med komma. ");
                oatLiter = 0;
                App.input.nextLine();
                App.input.nextLine();
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