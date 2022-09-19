package com.company;

public class SQL {
    private String[] kolumna;
    private String tabela;
    private String[] wartosci;

    public String[] getWartosci() {
        return wartosci;
    }

    public void setWartosci(String[] wartosci) {
        this.wartosci = wartosci;
    }

    public void setKolumna(String[] kolumna) {
        this.kolumna = kolumna;
    }

    public void setTabela(String tabela) {
        this.tabela = tabela;
    }

    public String[] getKolumna() {
        return kolumna;
    }

    public String getTabela() {
        return tabela;
    }
}
