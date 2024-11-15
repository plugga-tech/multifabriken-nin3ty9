import java.util.ArrayList;
import java.util.List;
//Alla produktklasser är uppbyggda på ungefär samma sätt med attribut, konstruktor, en lista för beställda objekt och en metod för att beställa:
public class Pipe
{
    private final int pipeDiam;
    private final int pipeLength;

    public Pipe(int pipeDiam, int pipeLength)
    {
        this.pipeDiam = pipeDiam;
        this.pipeLength = pipeLength;
    }

    public static List<Pipe> pipes = new ArrayList<>();
//Metod för att beställa:
    public static void addPipe()
    {
        boolean corrChoice1 = false;
        boolean corrChoice2 = false;
        int pipeDiam;
        int pipeLength;
//Loopar som tar emot input och kontrollerar om den är korrekt:
        do
        {
            App.clearTerm();
            System.out.println("-=Rör=-");
            System.out.println("Vilken diameter (i mm) ska röret ha? ");
            if (App.input.hasNextInt())
            {
                pipeDiam = App.input.nextInt();
                
                if (pipeDiam < 0.5)
                {
                    System.out.println("Minsta diameter är 2mm. ");
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
                System.out.println("Du måste ange en diameter (i hela mm). ");
                pipeDiam = 0;
                App.input.nextLine();
                App.input.nextLine();
            }
            
        } while (!corrChoice1);

        do
        {
            App.clearTerm();
            System.out.println("-=Rör=-");
            System.out.println("Vilken längd (i mm) ska röret ha? ");
            if (App.input.hasNextInt())
            {
                pipeLength = App.input.nextInt();

                if (pipeLength < 10)
                {
                    System.out.println("Minsta längd är 10mm. ");
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
                System.out.println("Du måste ange en längd (minst 10mm). ");
                pipeLength = 0;
                App.input.nextLine();
                App.input.nextLine();
            }
            
        } while (!corrChoice2);
//Objektet/produkten läggs till i sin lista:        
        Pipe addedPipe = new Pipe(pipeDiam, pipeLength);
        pipes.add(addedPipe);
        App.clearTerm();
        System.out.println("-=Rör=-");
        System.out.println("Ett rör med diametern " + pipeDiam + "mm och längden " + pipeLength + "mm har lagts till i varukorgen. ");
        App.input.nextLine();
    }
//Getters så att vi kan nå listan och dess innehåll från andra klasser:
    public static List<Pipe>getPipeList()
    {
        return pipes;
    }

    public int getPipeDiam()
    {
        return pipeDiam;
    }

    public int getPipeLength()
    {
        return pipeLength;
    }
    
}
