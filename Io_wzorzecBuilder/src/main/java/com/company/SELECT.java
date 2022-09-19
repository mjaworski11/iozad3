package com.company;

public class SELECT implements Builder{

    private SQL sql;

    public SELECT(){
        this.sql = new SQL();
    }
    @Override
    public void dodajkolumne(String[] kolumna) {
        sql.setKolumna(kolumna);
    }


    @Override
    public void dodajtabele(String tabela) {
        sql.setTabela(tabela);
    }

    @Override
    public void dodajWartosci(String[] wartosci) {
        sql.setWartosci(wartosci);
    }

    @Override
    public String getSql(){
        String tabela = sql.getTabela();
        String[] kolumna = sql.getKolumna();
        int rozmiar = kolumna.length;
        String zapytanie = null;

        zapytanie = "SELECT ";

        if(rozmiar==1)zapytanie=zapytanie+kolumna[0]+" ";
        else {
            for (int i = 0; i < rozmiar-1; i++) zapytanie = zapytanie + kolumna[i] + ", ";
            zapytanie=zapytanie+kolumna[rozmiar-1]+" ";
        }
        zapytanie = zapytanie + "FROM " + tabela;
        return zapytanie;
    }
}
