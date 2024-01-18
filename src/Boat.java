public class Boat {
    private Captain captain;
    private double basePrice;
    private double addValue;
    private int manufacturingYear;
    private int length;

    public Boat(Captain captain, double basePrice, int manufacturingYear, int length) {
        this.captain = captain;
        this.basePrice = basePrice;
        this.manufacturingYear = manufacturingYear;
        this.length = length;
        if (manufacturingYear > 2020) {
            this.addValue = 20000;
        }else {
            this.addValue = 0;
        }
    }

    public double getRent() {
        double rent = basePrice + addValue;
        System.out.println("El valor del alquiler es: " + rent);
        return rent;
    }
}
