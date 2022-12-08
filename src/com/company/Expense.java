package com.company;

import java.util.HashMap;

public class Expense {
    public String expenseType;
    public int amount;
    public String businessName;
    public int dueDateMonth;
    public int dueDateDay;
    public Expense() {
        this.expenseType = null;
        this.amount = 0;
        this.businessName = null;
        this.dueDateMonth = 0;
        this.dueDateDay = 0;
    }
    public Expense(String expenseType, int amount, String businessName, String DueDateMonthDay) {
        this.expenseType = expenseType;
        this.amount = amount;
        this.businessName = businessName;
        this.dueDateMonth = DueDateMonthDay.split();
    }

    public Expense(Expense expense) {
        expenseType = expense.expenseType;
        amount = expense.amount;
        businessName = expense.expenseType;
        dueDateMonth = expense.dueDateMonth;
        dueDateDay = expense.dueDateDay;
    }
}
