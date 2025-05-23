package org.example.model;

public class Operation {
    private int id;
    private double amount;
    private boolean status;
    private int accountId;

    // Constructors
    public Operation() {}

    public Operation(int id, double amount, boolean status, int accountId) {
        this.id = id;
        this.amount = amount;
        this.status = status;
        this.accountId = accountId;
    }

    public Operation(double amount, boolean status, int accountId) {
        this.amount = amount;
        this.status = status;
        this.accountId = accountId;
    }

    // Getters / Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "id=" + id +
                ", amount=" + amount +
                ", status=" + status +
                ", accountId=" + accountId +
                '}';
    }
}

