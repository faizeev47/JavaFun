package com.company;

import java.util.HashMap;
import java.util.Objects;

public class Expense {
    public String expenseType;
    public int amount;
    public String businessName;
    public int dueDateMonth;
    public int dueDateDay;

    public String getExpenseType() {
        return expenseType;
    }

    public int getAmount() {
        return amount;
    }

    public String getBusinessName() {
        return businessName;
    }

    public int getDueDateMonth() {
        return dueDateMonth;
    }

    public int getDueDateDay() {
        return dueDateDay;
    }

    public void setDueDateMonth(int dueDateMonth) {
        if (dueDateMonth >= 1 && dueDateMonth <= 12) {
            this.dueDateMonth = dueDateMonth;
        }
        else {
            this.dueDateMonth = 0;
        }
    }

    public void setDueDateDay(int dueDateDay) {
        if (dueDateDay >= 1 && dueDateDay <=31) {
            this.dueDateDay = dueDateDay;
        }
        else {
            this.dueDateDay = 0;
        }
    }

    public Expense() {
        this.expenseType = null;
        this.amount = 0;
        this.businessName = null;
        this.dueDateMonth = 0;
        this.dueDateDay = 0;
    }
    public Expense(String expenseType, int amount, String businessName, String dueDateMonthDay) {
        this.expenseType = expenseType;
        this.amount = amount;
        this.businessName = businessName;
        int dueDateMonth = Integer.parseInt(dueDateMonthDay.split("/")[1]);
        int dueDateDay = Integer.parseInt(dueDateMonthDay.split("/")[0]);
        if (dueDateMonth >= 1 && dueDateMonth <= 12) {
            this.dueDateMonth = dueDateMonth;
        }
        else {
            this.dueDateMonth = 0;
        }
        if (dueDateDay >= 1 && dueDateDay <=31) {
            this.dueDateDay = dueDateDay;
        }
        else {
            this.dueDateDay = 0;
        }
    }

    public Expense(Expense expense) {
        expenseType = expense.expenseType;
        amount = expense.amount;
        businessName = expense.expenseType;
        dueDateMonth = expense.dueDateMonth;
        dueDateDay = expense.dueDateDay;
    }

    @Override
    public String toString() {
        String expenseString = this.expenseType + " - $" + this.amount + " - " + this.businessName + " - " + String.format("%02d", this.dueDateDay) + "/" + String.format("%02d", this.dueDateMonth) + ".";
        return expenseString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Expense expense = (Expense) o;
        return amount == expense.amount && dueDateMonth == expense.dueDateMonth && dueDateDay == expense.dueDateDay && Objects.equals(expenseType, expense.expenseType) && Objects.equals(businessName, expense.businessName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expenseType, amount, businessName, dueDateMonth, dueDateDay);
    }
}
