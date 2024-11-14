import java.util.ArrayList;
import java.util.List;

public class Car
{
    private String carBrand;
    private String carPlate;
    private String carColor;

    public Car(String carBrand, String carPlate, String carColor)
    {
        this.carBrand = carBrand;
        this.carPlate = carPlate;
        this.carColor = carColor;
    }

    public static List<Car> cars = new ArrayList<Car>();

    public static void addCar()
    {
        boolean corrChoice1 = false;
        boolean corrChoice2 = false;
        boolean corrChoice3 = false;
        String carBrand;
        String carPlate;
        String carColor;

        System.out.println("-=Bilar=-");
        System.out.println("Vilket märke ska bilen vara av? ");
        carBrand = App.input.nextLine();

        do
        {
            if ("".equals(carBrand) || " ".equals(carBrand))
            {
                System.out.println("Du måste välja ett bilmärke. ");
                carBrand = App.input.nextLine();
            } 
            else
            {
                corrChoice1 = true;
            }

        } while (!corrChoice1);

        App.clearTerm();
        System.out.println("-=Bilar=-");
        System.out.println("Vilket registreringsnummer ska den ha? ");
        carPlate = App.input.nextLine();

        do
        {
            if ("".equals(carPlate) || " ".equals(carPlate))
            {
                System.out.println("Du måste ange ett registreringsnummer. ");
                carPlate = App.input.nextLine();
            } 
            else
            {
                corrChoice2 = true;
            }

        } while (!corrChoice2);

        App.clearTerm();
        System.out.println("-=Bilar=-");
        System.out.println("Vilken färg ska den ha? ");
        carColor = App.input.nextLine();

        do
        {
            if ("".equals(carColor) || " ".equals(carColor))
            {
                System.out.println("Du måste välja en färg. ");
                carColor = App.input.nextLine();
            } 
            else
            {
                corrChoice3 = true;
            }
            
        } while (!corrChoice3);

        Car addedCar = new Car(carBrand, carPlate, carColor);
        cars.add(addedCar);
        App.clearTerm();
        System.out.println("-=Bilar=-");
        System.out.println("En " + carColor + " " + carBrand + " med registreringsnummer " + carPlate 
        + " har lagts till i varukorgen. ");
    }
    
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
