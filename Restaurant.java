import java.util.Scanner;  
class Restaurant{
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int choice, quantity;
    double total = 0;

    System.out.println("===== INDIAN RESTAURANT MENU =====");
    System.out.println("1. Idli       - Rs. 30");
    System.out.println("2. Dosa       - Rs. 50");
    System.out.println("3. Poori      - Rs. 40");
    System.out.println("4. Samosa     - Rs. 20");
    System.out.println("5. Veg Biryani- Rs. 120");
    System.out.println("6. Chicken Biryani - Rs. 180");
    System.out.println("7. Paneer Curry - Rs. 150");
    System.out.println("8. Roti       - Rs. 15");
    System.out.println("9. Tea        - Rs. 15");
    System.out.println("10. Coffee    - Rs. 25");

    System.out.println("\nEnter 0 to finish ordering."); 
while (true) {

        System.out.print("\nEnter item number: ");// Deeksha
        choice = sc.nextInt();

        if (choice == 0) {
            break;
        }

        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();

        switch (choice) {

            case 1:
                total = total + 30 * quantity;
                break;

            case 2:
                total = total + 50 * quantity;
                break;

            case 3:
                total = total + 40 * quantity;
                break;

            case 4:
                total = total + 20 * quantity;
                break;

            case 5:
                total = total + 120 * quantity;
                break;

            case 6:
                total = total + 180 * quantity;
                break;

            case 7:
                total = total + 150 * quantity;
                break;

            case 8:
                total = total + 15 * quantity;
                break;

            case 9:
                total = total + 15 * quantity;
                break;

            case 10:
                total = total + 25 * quantity;
                break;

            default:
                System.out.println("Invalid item number!");
        }
    }

    System.out.println("\n===== FINAL BILL =====");
    System.out.println("Total amount = Rs. " + total);

    //Raghuram
}