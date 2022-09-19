package com.company;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void wczytajZlecenia(Baza baza) throws SQLException {
        ArrayList<Zlecenia> zlecenia = baza.wczytajZlecenia();
        System.out.println("id kupujacego id_produktu, id_zlecenia, czy_zrealizowano");
        for (int i = 0; i < zlecenia.size(); i++) {
            Zlecenia yp = zlecenia.get(i);
            Integer ID = yp.getId_kupującego();
            Integer ID1 = yp.getId_produktu();
            Integer ID2 = yp.getId_zlecenia();
            Boolean czyZrealizowano = yp.isCzy_zrealizowano();
            System.out.println(ID + "             " + ID1 + "            "+ ID2 + "            "+ czyZrealizowano);
        }
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Baza baza = new Baza();
        String[] kolumna1 = {"id_kupującego", "id_produktu","czy_zrealizowano","termin"};
        String tabela1 = "zlecenia";
        String wartosci[] = {"1","2","true", "now()"};
        Builder select1Builder = new SELECT();
        Director director1 = new Director(select1Builder);
        director1.constructSELECT(kolumna1,tabela1);

        Builder selectBuilder = new INSERT();
        Director director = new Director(selectBuilder);
        director.constructINSERT(kolumna1,tabela1, wartosci);

        String sql = director1.getSql();
        System.out.println(sql);

        sql = director.getSql();
        System.out.println(sql);

        wczytajZlecenia(baza);
        baza.insertZlecenie(kolumna1,tabela1,wartosci);
        wczytajZlecenia(baza);
    }
}
