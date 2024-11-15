import java.util.ArrayList;
import java.util.List;
//Alla produktklasser är uppbyggda på ungefär samma sätt med attribut, konstruktor, en lista för beställda objekt och en metod för att beställa:
public class OatMilk
{
    private final double oatFat;
    private final double oatLiter;

    public OatMilk(double oatFat, double oatLiter)
    {
        this.oatFat = oatFat;
        this.oatLiter = oatLiter;
    }

    public static List<OatMilk> oatMilks = new ArrayList<>();
//Metod för att beställa:
    public static void addOatMilk()
    {
        boolean corrChoice1 = false;
        boolean corrChoice2 = false;
        double oatfat;
        double oatLiter;
//Loopar som tar emot input och kontrollerar om den är korrekt:
        do
        {
            App.clearTerm();
            System.out.println("-=Havremjölk=-");
            System.out.println("Vilken fetthalt ska havremjölken ha? ");
            if (App.input.hasNextDouble())
            {
                oatfat = App.input.nextDouble();

                if (oatfat < 0.1) {
                    System.out.println("Minsta fetthalt är 0,1%. ");
                    App.input.nextLine();
                    App.input.nextLine();
                }
                else if (oatfat > 15)
                {
                    System.out.println("Högsta fetthalt är 15%. ");
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
                oatfat = 0;
                App.input.nextLine();
                App.input.nextLine();
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
            }
            
        } while (!corrChoice2);
//Objektet/produkten läggs till i sin lista:        
        OatMilk addedOatMilk = new OatMilk(oatfat, oatLiter);
        oatMilks.add(addedOatMilk);
        App.clearTerm();
        System.out.println("-=Havremjölk=-");
        System.out.println(oatLiter + " liter med " + oatfat + "% fetthalt har lagts till i varukorgen. ");
        App.input.nextLine();
    }
//Getters så att vi kan nå listan och dess innehåll från andra klasser:    
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