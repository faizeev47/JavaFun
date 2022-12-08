package com.company;

import java.util.Arrays;

public class HouseholdBudget {
    public int[] fund;
    public int[] expenses;
    public HouseholdBudget(){

    }
    public HouseholdBudget(int[] fund, int[] expenses) {
        this.fund = fund;
        this.expenses = expenses;
    }

    public static boolean budgetsEqual(HouseholdBudget budget1, HouseholdBudget budget2) {
        return false;
    }

    public static boolean budgetsFundsEqual(HouseholdBudget budget1, HouseholdBudget budget2) {
        return false;
    }

    public static int budgetTotalValue() {
        return 0;
    }

    public int numberExpenses() {
        return 0;
    }

    public int addExpense(int expense, String expenseName) {
        return numberExpenses();
    }

    public boolean removeExpense() {
        return false;
    }

    public void updateExpense(int dueDateDay, int dueDateMonth) {

    }

    public void addFund(int loonies, int toonies, int fiveBill, int tenBill, int twentyBill) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HouseholdBudget that = (HouseholdBudget) o;
        return Arrays.equals(fund, that.fund) && Arrays.equals(expenses, that.expenses);
    }

    @Override
    public String toString() {
        return "budget string";
    }
}
