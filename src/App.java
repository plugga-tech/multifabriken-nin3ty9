import java.util.Scanner;

public class App
{
    public static Scanner input = new Scanner(System.in);

//Metod för att rensa skärmen så vi får en ren och snygg meny:
    static void clearTerm()                                     
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
//Boolean och loop som kontrollerar menyn:
    public static void main(String[] args)
    {
        boolean dispMenu = true;
        
        while (dispMenu)
        {
            dispMenu = MainMenu.mainMenu();
            System.out.println("Tack för att du handlar hos oss, välkommen åter!");
            input.close();
        }

    }
}