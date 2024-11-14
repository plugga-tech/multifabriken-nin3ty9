import java.util.ArrayList;
import java.util.List;

public class Pipe
{
    private int pipeDiam;
    private int pipeLength;

    public Pipe(int pipeDiam, int pipeLength)
    {
        this.pipeDiam = pipeDiam;
        this.pipeLength = pipeLength;
    }

    public static List<Pipe> pipes = new ArrayList<Pipe>();

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
                corrChoice1 = true;
            }
            else
            {
                System.out.println("Du måste ange en längd (i hela mm). ");
                pipeDiam = 0;
                corrChoice1 = false;
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
                corrChoice2 = true;
            }
            else
            {
                System.out.println("Du måste ange en mängd (minst 0,5). ");
                pipeLength = 0;
                corrChoice2 = false;
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
