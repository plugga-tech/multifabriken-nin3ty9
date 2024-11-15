import java.util.ArrayList;
import java.util.List;

public class Candy
{
    private final String candFlavor;
    private final int candNumber;

    public Candy(String candFlavor, int candNumber)
    {
        this.candFlavor = candFlavor;
        this.candNumber = candNumber;
    }

    public static List<Candy> candies = new ArrayList<>();

    public static void addCandy()
    {
        boolean corrChoice1 = false;
        boolean corrChoice2 = false;
        String candFlavor;
        int candNumber;

        do
        {
            App.clearTerm();
            System.out.println("-=Godis=-");
            System.out.println("Vilken smak vill du beställa? ");
            
            candFlavor = App.input.nextLine();

            if (candFlavor.equals("") || candFlavor.equals(" "))
            {
                System.out.println("Du måste ange en smak. ");
                App.input.nextLine();
            }
            else 
            {
                corrChoice1 = true;
            }
            
        } while (!corrChoice1);

        do
        {
            App.clearTerm();
            System.out.println("-=Godis=-");
            System.out.println("Hur många godisbitar vill du beställa? ");
            if (App.input.hasNextInt())
            {
                candNumber = App.input.nextInt();

                if (candNumber < 1)
                {
                    System.out.println("Du måste ange ett antal. ");
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
                System.out.println("Du måste ange ett antal. ");
                candNumber = 0;
                App.input.nextLine();
                App.input.nextLine();
            }
            
        } while (!corrChoice2);
        
        Candy addedCandy = new Candy(candFlavor, candNumber);
        candies.add(addedCandy);
        App.clearTerm();
        System.out.println("-=Godis=-");
        System.out.println(candNumber + " godisbitar med smak av " + candFlavor + " har lagts till i varukorgen. ");
        App.input.nextLine();
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
