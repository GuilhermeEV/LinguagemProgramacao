package br.edu.uniso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BancoDados {
    public static void main (String args[]){

        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://34.225.155.37:3306/guilherme_vanini?useSSL=false",
                    "guilherme_vanini", "000000");



            PreparedStatement ps = c.prepareStatement("insert into VENDEDOR(cpf, nome, idade) values " +
                    "(?, ?, ?)");

            ps.setString(1, "12345678900");
            ps.setString(2, "Michael");
            ps.setInt(3, 45);

            ps.executeUpdate();

            ps.close();
            c.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }
}
