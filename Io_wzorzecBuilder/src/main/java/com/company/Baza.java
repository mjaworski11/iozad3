package com.company;

import java.sql.*;
import java.util.ArrayList;

public class Baza {

    private Connection connection;

    public Baza() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/projektprog1","postgres",
                "*******");
    }


    public ArrayList<Zlecenia> wczytajZlecenia() throws SQLException {

        String[] kolumna = {"*"};
        String tabela = "zlecenia";
        Builder selectBuilder = new SELECT();
        Director director = new Director(selectBuilder);
        director.constructSELECT(kolumna,tabela);
        String sql = director.getSql();
        Statement stmt = connection.createStatement();
        ResultSet result = stmt.executeQuery(sql);
        ArrayList<Zlecenia> wynik = new ArrayList<Zlecenia>();
        while(result.next()) {
            Zlecenia zlecenia = new Zlecenia(result.getInt("id_zlecenia"),
                    result.getInt("id_kupującego"),
                    result.getInt("id_produktu"),
                    result.getBoolean("czy_zrealizowano"));
            wynik.add(zlecenia);
        }
        stmt.close();
        return wynik;
    }
    public void insertZlecenie(String[] kolumna, String tabela, String[] wartosci) throws SQLException {
        Builder selectBuilder = new INSERT();
        Director director = new Director(selectBuilder);
        director.constructINSERT(kolumna,tabela,wartosci);
        String sql = director.getSql();
        Statement stmt = connection.createStatement();
        stmt.executeUpdate(sql);
        stmt.close();
    }
}
