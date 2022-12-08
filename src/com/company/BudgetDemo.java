package com.company;

import java.util.Scanner;

public class BudgetDemo {
    public void runDemo() {
        // Print initial menu to user
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Welcome to Assignment for budget demo: ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        int choice;
        Scanner scanner = new Scanner(System.in);
        // Menu loop
        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("\t1. See the possessions of all householdBudgets");
            System.out.println("\t2. See the possessions of one householdBudget");
            System.out.println("\t3. List householdBudgets with same total amount of fund");
            System.out.println("\t4. List householdBudgets with same fund denomination(s)");
            System.out.println("\t5. List householdBudgets with same total amount of fund and same number of expenses");
            System.out.println("\t6. Add an expense to an existing householdBudget");
            System.out.println("\t7. Remove an existing expense from a householdBudget");
            System.out.println("\t8. Update the payment due date of an existing expense");
            System.out.println("\t9. Add fund to a householdBudget");
            System.out.println("\t0. To quit");
            try {
                // get the choice from user
                System.out.print("\n\nPlease enter your choice and press <Enter>: ");
                choice = scanner.nextInt();
                switch (choice) {
                    case 0:
                        break;
                    case 1:

                    default:
                        throw new Exception();
                }
            }
            catch (Exception e) {
                System.out.println("Sorry that is not a valid choice. Please try again.");
            }
        }
    }
}
