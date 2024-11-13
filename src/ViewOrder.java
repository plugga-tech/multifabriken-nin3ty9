public class ViewOrder
{
    
    public static void viewOrder()
    {
        boolean orderDone = false;
        char orderChoice = 0;

        while (!orderDone)
        {
            App.clearTerm();
            System.out.println("-=[| MULTIFABRIKEN |]=-");
            System.out.println("Våra produkter: ");
            System.out.println("[1]-=Bilar=- ");
            System.out.println("[2]-=Rör=- ");
            System.out.println("[3]-=Godis=- ");
            System.out.println("[4]-=Havremjölk=- ");
            System.out.println("[5] - Tillbaka till huvudmenyn ");
            System.out.println("----------------------------------");
            System.out.println("Välj en product att beställa eller alternativ 5 för att återvända till huvudmenyn ");
        
            orderChoice = App.input.next().charAt(0);
            App.input.nextLine();

            switch (orderChoice)
            {
            case '1':

                App.clearTerm();
                Car.addCar();
                App.input.nextLine();

                break;

            case '2':

                App.clearTerm();
                Pipe.addPipe();
                App.input.nextLine();

                break;

            case '3':

                App.clearTerm();
                Candy.addCandy();;

                break;

            case '4':

                App.clearTerm();
                OatMilk.addOatMilk();
                App.input.nextLine();

                break;
            
            case '5':

                App.clearTerm();
                orderDone = true;
                App.input.nextLine();

                break;

            default:

                System.out.println("Du måste välja ett av alternativen 1-5. ");
                App.input.nextLine();

                break;
            }

        }
        
    }

    
}
