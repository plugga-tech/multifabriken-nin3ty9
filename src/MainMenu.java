
public class MainMenu
{
    //Metod för huvudmenyn:
    public static boolean mainMenu()
    {
        char menChoice = 0;

        do
        {
            App.clearTerm();
            System.out.println("    Välkommen till ");
            System.out.println("-=[| MULTIFABRIKEN |]=-");
            System.out.println("-------------------");
            System.out.println("Välj ett alternativ ");
            System.out.println("[1] Varukorg ");
            System.out.println("[2] Våra produkter ");
            System.out.println("[3] Lägg beställning och avsluta ");

            menChoice = App.input.next().charAt(0);
            App.input.nextLine();
    //Menyn styrs av en loopad switch:
            switch (menChoice)
            {
            case '1':

                App.clearTerm();
                ViewCart.viewCart();
                App.input.nextLine();

                break;

            case '2':

                App.clearTerm();
                ViewOrder.viewOrder();

                break;

            case '3':
    //Vid "checkout" kontrollerar programmet om vi har nåt i varukorgen. Har vi det så åberopas metoden som visar varukorgen
    //Då får vi ett meddelande om att beställningen tagits emot. Är den tom så får vi istället veta det:
            App.clearTerm();
            if (Car.getCarList().size() < 1 && Candy.getCandyList().size() < 1 && Pipe.getPipeList().size() < 1
            && OatMilk.getOatMilkList().size() < 1)
            {
                return false;
            } 
            else
            {
                System.out.println("Din beställning har mottagits. ");
                System.out.println("------------------------------------------------------------------------------");
                ViewCart.viewCart();
                return false;
            }
    //Felmeddelande vid felaktigt menyval:
            default:

                System.out.println("Du måste välja ett av alternativen 1-3. ");
                App.input.nextLine();

                break;
            }
            
        } while (true);

    }
}
