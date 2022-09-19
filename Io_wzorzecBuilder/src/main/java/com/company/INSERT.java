package com.company;

public class INSERT implements Builder{

    private SQL sql;

    public INSERT(){
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

    public void dodajWartosci(String[] wartosci){
        sql.setWartosci(wartosci);
    }

    @Override
    public String getSql() {
        String tabela = sql.getTabela();
        String[] kolumna = sql.getKolumna();
        String[] wartosci = sql.getWartosci();
        String zapytanie = "INSERT INTO " + tabela + " ";

        int rozmiar = kolumna.length;

        if(rozmiar==1)zapytanie=zapytanie+"("+kolumna[0]+") VALUES (" +wartosci[0]+")";
        else{
            zapytanie=zapytanie+"(";
            for(int i = 0;i<rozmiar-1;i++)zapytanie=zapytanie+kolumna[i]+", ";
            zapytanie=zapytanie+kolumna[rozmiar-1]+") VALUES (";
            for(int i = 0;i<rozmiar-1;i++)zapytanie=zapytanie+wartosci[i]+", ";
            zapytanie=zapytanie+wartosci[rozmiar-1]+")";

        }
        return zapytanie;
    }
}
