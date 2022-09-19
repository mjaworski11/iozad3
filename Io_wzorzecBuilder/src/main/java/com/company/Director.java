package com.company;

public class Director {
    private Builder builder;

    public Director(Builder builder)
    {
        this.builder = builder;
    }

    public String getSql()
    {
        return this.builder.getSql();
    }

    public void constructSELECT(String[] kolumna, String tabela)
    {
        this.builder.dodajkolumne(kolumna);
        this.builder.dodajtabele(tabela);
    }
    public void constructINSERT(String[]kolumna, String tabela, String[] wartosci){
        this.builder.dodajkolumne(kolumna);
        this.builder.dodajtabele(tabela);
        this.builder.dodajWartosci(wartosci);
    }
}
