package org.example.model;

import java.util.List;

public class BankAccount {
    private int id;
    private int customerId;
    private double totalAmount =0;
    private List<Operation> operations;
    private Customer customer;

    // Constructors
    public BankAccount() {}

    public BankAccount(int id, int customerId, double totalAmount, List<Operation> operations, Customer customer) {
        this.id = id;
        this.customerId = customerId;
        this.totalAmount = totalAmount;
        this.operations = operations;
        this.customer = customer;
    }

    public BankAccount(int customerId, double totalAmount, List<Operation> operations, Customer customer) {
        this.customerId = customerId;
        this.totalAmount = totalAmount;
        this.operations = operations;
        this.customer = customer;
    }

    public BankAccount(int customerId) {
        this.customerId = customerId;
    }

    // Getters / Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", totalAmount=" + totalAmount +
                ", operations=" + operations +
                ", customer=" + customer +
                '}';
    }
}

