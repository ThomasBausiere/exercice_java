package org.example.dao;

import org.example.model.Customer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class CustomerDao extends BaseDao<Customer> {
    public CustomerDao(Connection connection) {super(connection);}

    @Override
    public boolean save(Customer element) throws SQLException {
        request = "INSERT INTO Customer (customer_first_name, customer_last_name, customer_first_name) values = (?,?,?)";
        statement = connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setString(1, element.getFirstName());
        statement.setString(2, element.getLastName());
        statement.setString(3, element.getLastName());
        int nbRow = statement.executeUpdate();
        resultSet=statement.getGeneratedKeys();
        if(resultSet.next()){
            element.setId(resultSet.getInt(1));
        }
        return nbRow == 1;
    }


    @Override
    public boolean update(Customer element) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(Customer element) throws SQLException {
        return false;
    }

    @Override
    public Customer get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<Customer> get() throws SQLException {
        return List.of();
    }
}
