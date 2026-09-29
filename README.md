# Project: Restaurant Order, Kitchen, Billing System
# Project Supervisor: Dr.K.Sreeram Murthy
# Team Members:
1. **Muddana Raghuram Chowdary** - ECE - 2620040111
2. **Kanapuram Deeksha Reddy** - CSIT - 2620090129
# Project Abstract:
# Restaurant Kitchen Order & Billing System

1. **Java-Based System** – A simple Restaurant Management and Kitchen Order System developed using Java.

2. **Food Menu Management** – Allows restaurant staff to manage and maintain food menu items efficiently.

3. **Customer Order Management** – Enables staff to add, update, and manage customer orders.

4. **Kitchen Order Processing** – Sends order details to the kitchen to support accurate and timely food preparation.

5. **Automated Billing** – Automatically calculates the bill amount and generates the total, reducing manual calculation errors.

6. **Order Management** – Provides an organized way to handle customer orders from the counter to the kitchen.

7. **Java Programming Concepts** – Demonstrates the use of classes, objects, methods, arrays, loops, and conditional statements.

8. **File Handling** – Uses file handling to store and manage relevant restaurant and order information.

9. **User-Friendly Design** – Provides a simple and easy-to-use system that improves communication between restaurant staff and the kitchen.

10. **Project Objective** – Aims to automate routine restaurant activities while providing students with practical experience in applying Java programming to real-world problems.
11. # week1 Deeksha:
        import java.util.Scanner;

class Restaurant {

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
# Week 1 Raghuram:


        while (true) {

            System.out.print("\nEnter item number: ");
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

        sc.close();
    }
}
# Setup Details:
# Execution Details:
# Current Status :
Currently in development.
