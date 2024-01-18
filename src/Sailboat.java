public class Sailboat extends Boat {
    private int mastQuantity;
    public Sailboat(Captain captain, double basePrice, int manufacturingYear, int length, int mastQuantity) {
        super(captain, basePrice, manufacturingYear, length);
        this.mastQuantity = mastQuantity;
    }

    public boolean isBig() {
        if (mastQuantity > 4) {
            System.out.println("El velero es grande");
        }else {
            System.out.println("El velero es pequeño");
        }
        return mastQuantity > 4;
    }
}
