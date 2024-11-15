import java.util.ArrayList;
import java.util.List;

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

    public static void addPipe()
    {
        boolean corrChoice1 = false;
        boolean corrChoice2 = false;
        int pipeDiam;
        int pipeLength;

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
        
        Pipe addedPipe = new Pipe(pipeDiam, pipeLength);
        pipes.add(addedPipe);
        App.clearTerm();
        System.out.println("-=Rör=-");
        System.out.println("Ett rör med diametern " + pipeDiam + "mm och längden " + pipeLength + "mm har lagts till i varukorgen. ");
        App.input.nextLine();
    }

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
