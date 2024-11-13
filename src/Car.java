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
