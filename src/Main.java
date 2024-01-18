public class Main {
    public static void main(String[] args) {
        Captain captain1 = new Captain("Juan", "Hernandez", "JAK876");
        Captain captain2 = new Captain("Pedro", "Perez", "RIG123");
        Captain captain3 = new Captain("Samuel", "Rodriguez", "HGD765");
        Captain captain4 = new Captain("Liliana", "Del Socorro", "KSD8734");

        Sailboat sailboat1 = new Sailboat(captain1, 40000, 2021, 8, 3);
        Sailboat sailboat2 = new Sailboat(captain2, 40000, 2012, 8, 8);
        Yacht yacht1 = new Yacht(captain3, 30000, 2024, 4, 10);
        Yacht yacht2 = new Yacht(captain4, 50000, 2001, 4, 5);

        sailboat1.isBig();
        sailboat1.getRent();
        sailboat2.isBig();
        sailboat2.getRent();
        yacht1.isBuyabble();
        yacht1.getRent();
        yacht1.isLuxury();
        yacht2.isBuyabble();
        yacht2.getRent();
        yacht2.isLuxury();
    }
}