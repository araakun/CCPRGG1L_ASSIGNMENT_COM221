import java.util.Scanner;

public class KFC {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

    revealmyOrder();  
    }

    static void revealmyOrder() {
        System.out.println("Welcome to KFC!!!");
        System.out.print("Enter your first order: ");
        String firstorder = scan.nextLine();
        System.out.print("Price 1: ");
        Double priceone = scan.nextDouble();
        scan.nextLine();

        System.out.print("Enter your second order: ");
        String secondorder = scan.nextLine();
        System.out.print("Price 2: ");
        Double pricetwo = scan.nextDouble();
        scan.nextLine();

        System.out.print("Enter your third order: ");
        String thirdorder = scan.nextLine();
        System.out.print("Price 3: ");
        Double pricethree = scan.nextDouble();

        Double total = priceone + pricetwo + pricethree;

        System.out.println("Your orders are: " + firstorder  + ","  + secondorder + ",and "  +  thirdorder);
        System.out.println("Your total is: " + total);

    }
}
