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
