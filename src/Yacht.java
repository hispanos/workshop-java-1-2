public class Yacht extends Boat{
    private int cabinsQuantity;
    public Yacht(Captain captain, double basePrice, int manufacturingYear, int length, int cabinsQuantity) {
        super(captain, basePrice, manufacturingYear, length);
        this.cabinsQuantity = cabinsQuantity;
    }

    public boolean isLuxury() {
        if (cabinsQuantity > 7) {
            System.out.println("El yate es lujoso");
        }else {
            System.out.println("El yate no es lujoso");
        }
        return cabinsQuantity > 7;
    }

    public boolean isBuyabble() {
        return true;
    }
}
