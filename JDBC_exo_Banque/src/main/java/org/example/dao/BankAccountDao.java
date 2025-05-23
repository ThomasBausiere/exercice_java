package org.example.dao;

import org.example.model.BankAccount;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class BankAccountDao extends BaseDao<BankAccount>{
    public BankAccountDao(Connection connection) {
        super(connection);
    }

    @Override
    public boolean save(BankAccount element) throws SQLException {
        request = "INSERT INTO BankAccount (customer_id, bank_account_total_amount) values = (?,?)";
        statement = connection.prepareStatement(request, Statement.RETURN_GENERATED_KEYS);
        statement.setInt(1, element.getCustomerId());
        statement.setDouble(2, element.getTotalAmount());
        int nbRow = statement.executeUpdate();
        resultSet=statement.getGeneratedKeys();
        if(resultSet.next()){
            element.setId(resultSet.getInt(1));
        }
        return nbRow == 1;
    }

    @Override
    public boolean update(BankAccount element) throws SQLException {
        request = "UPDATE BankAccount set bank_account_total_amount = ? WHERE id = ?";
        statement = connection.prepareStatement(request);
        statement.setDouble(1, element.getTotalAmount());
        statement.setInt(2, element.getId());
        int nbRow = statement.executeUpdate();
        return nbRow == 1;
    }

    @Override
    public boolean delete(BankAccount element) throws SQLException {
        return false;
    }

    @Override
    public BankAccount get(int id) throws SQLException {
        return null;
    }

    @Override
    public List<BankAccount> get() throws SQLException {
        return List.of();
    }
}
