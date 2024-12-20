import java.util.ArrayList;
import java.util.List;
//Alla produktklasser är uppbyggda på ungefär samma sätt med attribut, konstruktor, en lista för beställda objekt och en metod för att beställa:
public class Car
{
    private final String carBrand;
    private final String carPlate;
    private final String carColor;

    public Car(String carBrand, String carPlate, String carColor)
    {
        this.carBrand = carBrand;
        this.carPlate = carPlate;
        this.carColor = carColor;
    }

    public static List<Car> cars = new ArrayList<>();
//Metod för att beställa:
    public static void addCar()
    {
        boolean corrChoice1 = false;
        boolean corrChoice2 = false;
        boolean corrChoice3 = false;
        String carBrand;
        String carPlate;
        String carColor;
//Loopar som tar emot input och kontrollerar om den är korrekt:
        do
        {
            App.clearTerm();
            System.out.println("-=Bilar=-");
            System.out.println("Vilket märke ska bilen vara av? ");
            carBrand = App.input.nextLine();

            if ("".equals(carBrand) || " ".equals(carBrand))
            {
                System.out.println("Du måste välja ett bilmärke. ");
                App.input.nextLine();
            } 
            else
            {
                corrChoice1 = true;
            }

        } while (!corrChoice1);

        do
        {
            App.clearTerm();
            System.out.println("-=Bilar=-");
            System.out.println("Vilket registreringsnummer ska den ha? ");
            carPlate = App.input.nextLine();

            if ("".equals(carPlate) || " ".equals(carPlate))
            {
                System.out.println("Du måste ange ett registreringsnummer. ");
                App.input.nextLine();
            } 
            else
            {
                corrChoice2 = true;
            }

        } while (!corrChoice2);

        do
        {
            App.clearTerm();
            System.out.println("-=Bilar=-");
            System.out.println("Vilken färg ska den ha? ");
            carColor = App.input.nextLine();

            if ("".equals(carColor) || " ".equals(carColor))
            {
                System.out.println("Du måste välja en färg. ");
                App.input.nextLine();
            } 
            else
            {
                corrChoice3 = true;
            }
            
        } while (!corrChoice3);
//Objektet/produkten läggs till i sin lista:
        Car addedCar = new Car(carBrand, carPlate, carColor);
        cars.add(addedCar);
        App.clearTerm();
        System.out.println("-=Bilar=-");
        System.out.println("En " + carColor + " " + carBrand + " med registreringsnummer " + carPlate 
        + " har lagts till i varukorgen. ");
    }
//Getters så att vi kan nå listan och dess innehåll från andra klasser:
    public static List<Car>getCarList()
    {
        return cars;
    }

    public String getCarBrand()
    {
        return carBrand;
    }

    public String getCarPlate()
    {
        return carPlate;
    }

    public String getCarColor()
    {
        return carColor;
    }

}
