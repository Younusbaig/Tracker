package com.Tracker.Tracker.model;

import javax.persistence.*;

@Entity
@Table(name ="tbl_expense")
public class ExpenseTracker {

    @Id
    private long id;
    private String expense;
    private String description;
    private double amount;


    public ExpenseTracker(){

    }
    public ExpenseTracker(String expense, String description, long id, double amount) {

        this.amount =amount;
        this.id=id;
        this.description=description;
        this.expense=expense;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getExpense() {
        return expense;
    }

    public void setExpense(String expense) {
        this.expense = expense;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
