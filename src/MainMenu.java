
public class MainMenu
{
    public static boolean mainMenu()
    {
        char menChoice = 0;

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

        do
        { 
            switch (menChoice)
            {
            case '1':

                App.clearTerm();
                ViewOrder.viewOrder();
                App.input.nextLine();

                break;

            case '2':

                App.clearTerm();
                ViewOrder.viewOrder();
                App.input.nextLine();

                break;

            case '3':

                App.clearTerm();
                ViewCart.viewCart();

                return false;

            default:

                System.out.println("Du måste välja ett av alternativen 1-3. ");
                App.input.nextLine();

                break;
            }
            
        } while (true);
        

    }
}
