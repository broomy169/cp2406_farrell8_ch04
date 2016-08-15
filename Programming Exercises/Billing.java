/**
 * Created by Graeme on 16-Aug-16.
 */
public class Billing {

    final static double TAX = 0.08;

    public static void main(String[] args) {
        double cost = 19.95;
        int quantity = 5;
        double coupon = 10;

        double bill;
        bill = computeBill(cost);
        System.out.println("Total for book: " + String.format("%.2f", bill));
        bill = computeBill(cost, quantity);
        System.out.println("Total for 5 books: " + String.format("%.2f", bill));
        bill = computeBill(cost, quantity, coupon);
        System.out.println("Total for 5 books with a $10 coupon: " +
                String.format("%.2f", bill));
    }

    public static double computeBill(double cost) {
        double bill =  cost + cost * TAX;
        return bill;
    }

    public static double computeBill(double cost, int quantity) {
        double bill = (cost * quantity) + (cost + cost * TAX);
        return bill;
    }

    public static double computeBill(double cost, int quantity, double coupon) {
        double bill = (cost * quantity - coupon) + (cost + cost * TAX);
        return bill;
    }


}
