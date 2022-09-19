package com.company;

public interface Builder {
    public void dodajkolumne(String[] kolumna);
    public void dodajtabele(String tabela);
    public void dodajWartosci(String[] wartosci);
    public String getSql();
}
