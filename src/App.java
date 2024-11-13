import java.util.Scanner;

public class App
{
    private static Scanner input = new Scanner(System.in);

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
        Candy candy1 = new Candy("Strawberry", 56);
        System.out.println(candy1.getCandFlavor() + ", " + candy1.getCandNumber());
        

        while (dispMenu)
        {
            dispMenu = MainMenu.mainMenu();
            System.out.println("Tack för att du handlar hos oss, välkommen åter!");
            input.close();
        }

    }
}