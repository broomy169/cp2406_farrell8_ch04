/**
 * Created by Graeme on 16-Aug-16.
 */
public class FormLetterWriter {

    public static void main(String[] args) {
        displaySalutation("Smith");
        displaySalutation("Smith", "John");

    }

    public static void displaySalutation(String lastName){
        System.out.println("Dear Mr. or Ms. " + lastName +
                ". \nThank you for your recent order.");

    }

    public static void displaySalutation(String lastName, String firstName){
        System.out.println("Dear " + firstName + " " + lastName +
                ". \nThank you for your recent order.");

    }
}
