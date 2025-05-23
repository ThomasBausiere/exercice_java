package org.example.service;

import org.example.dao.BankAccountDao;
import org.example.dao.CustomerDao;
import org.example.model.Customer;
import org.example.util.DataBaseManager;
import org.example.service.BankAccountService;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class CustomerService {
    private BankAccountDao bankAccountDao;
    private CustomerDao customerDao;
    private Connection connection;

    public CustomerService() {
        try {
            connection = new DataBaseManager().getConnection();
            customerDao = new CustomerDao(connection);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean createCustomer(String lastName, String firstName, String phone) {
        Customer customer = new Customer(firstName, lastName, phone);
        try {
            if (customerDao.save(customer)) {
                BankAccountService.createBankAccount(customer.getId());
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public boolean updateCustomer(Customer customer) {
        try {
            if (customerDao.update(customer)) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public Customer getCustomer(int id) {
        try {
            return customerDao.get(id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean deleteCustomer(int id) {
        Customer customer = null;
        try {
            customer = customerDao.get(id);
            if (customer != null) {
                return customerDao.delete(customer);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public List<Customer> getAllCustomer() {
        try {
            return customerDao.get();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

