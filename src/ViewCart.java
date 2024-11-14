public class ViewCart
{
    public static void viewCart()
    {
        if (Car.getCarList().size() < 1 && Candy.getCandyList().size() < 1 && Pipe.getPipeList().size() < 1
        && OatMilk.getOatMilkList().size() < 1)
        {
            System.out.println("Din varukorg är tom. ");
        } 
        else
        {
            System.out.println("Dina valda produkter: ");

            for (int i = 0; i < Car.getCarList().size(); i++)
            {
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("En st. " + Car.getCarList().get(i).getCarBrand() + ", Färg: "
                        + Car.getCarList().get(i).getCarColor() + ", Regnr: " + Car.getCarList().get(i).getCarPlate());
            }

            for (int i = 0; i < Pipe.getPipeList().size(); i++)
            {
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("Ett st. rör med diameter " + Pipe.getPipeList().get(i).getPipeDiam()
                        + " mm och längd " + Pipe.getPipeList().get(i).getPipeLength() + " mm.");
            }

            for (int i = 0; i < Candy.getCandyList().size(); i++)
            {
                System.out.println("------------------------------------------------------------------------------");
                System.out.println(Candy.getCandyList().get(i).getCandNumber() + " st. godisbitar med smak av "
                        + Candy.getCandyList().get(i).getCandFlavor());
            }

            for (int i = 0; i < OatMilk.getOatMilkList().size(); i++)
            {
                System.out.println("------------------------------------------------------------------------------");
                System.out.println(OatMilk.getOatMilkList().get(i).getOatLiter() + " liter havremjölk med "
                        + OatMilk.getOatMilkList().get(i).getOatFat() + "% fett");
            }

        }

    }
}
