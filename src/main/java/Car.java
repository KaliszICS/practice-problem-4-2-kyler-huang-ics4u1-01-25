/**
 * The Car class represents a car with a make, model, year, and price.
 * It provides constructors to initialize these values and 
 * getter and setter methods to access and modify them.
 */
public class Car {

    /** The car's manufacturer */
    private String make;

    /** The car's model */
    private String model;

    /** The year the car was manufactured */
    private int year;

    /** The price of the car */
    private double price;

    /**
     * Constructs a new Car with the specified make, model, year, and price.
     *
     * @param make  the manufacturer of the car
     * @param model the model of the car
     * @param year  the year the car was produced
     * @param price the price of the car
     */
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    /**
     * Returns the car's make.
     *
     * @return the make of the car
     */
    public String getMake() {
        return make;
    }

    /**
     * Sets the car's make.
     *
     * @param make the new make of the car
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Returns the car's model.
     *
     * @return the model of the car
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the car's model.
     *
     * @param model the new model of the car
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Returns the car's manufacturing year.
     *
     * @return the year the car was produced
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the car's manufacturing year.
     *
     * @param year the new year of the car
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Returns the car's price.
     *
     * @return the price of the car
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the car's price.
     *
     * @param price the new price of the car
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
