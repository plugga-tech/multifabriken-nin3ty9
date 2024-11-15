import java.util.ArrayList;
import java.util.List;
//Alla produktklasser är uppbyggda på ungefär samma sätt med attribut, konstruktor, en lista för beställda objekt och en metod för att beställa:
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
//Metod för att beställa:
    public static void addCandy()
    {
        boolean corrChoice1 = false;
        boolean corrChoice2 = false;
        String candFlavor;
        int candNumber;
//Loopar som tar emot input och kontrollerar om den är korrekt:
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
//Objektet/produkten läggs till i sin lista:        
        Candy addedCandy = new Candy(candFlavor, candNumber);
        candies.add(addedCandy);
        App.clearTerm();
        System.out.println("-=Godis=-");
        System.out.println(candNumber + " godisbitar med smak av " + candFlavor + " har lagts till i varukorgen. ");
        App.input.nextLine();
    }
//Getters så att vi kan nå listan och dess innehåll från andra klasser:
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
