package com.company;

public class Zlecenia {
    private int id_zlecenia;
    private int id_kupującego;
    private int id_produktu;
    private boolean czy_zrealizowano;

    public Zlecenia(int id_zlecenia, int id_kupującego, int id_produktu, boolean czy_zrealizowano) {
        this.id_zlecenia = id_zlecenia;
        this.id_kupującego = id_kupującego;
        this.id_produktu = id_produktu;
        this.czy_zrealizowano = czy_zrealizowano;
    }

    public int getId_zlecenia() {
        return id_zlecenia;
    }

    public void setId_zlecenia(int id_zlecenia) {
        this.id_zlecenia = id_zlecenia;
    }

    public int getId_kupującego() {
        return id_kupującego;
    }

    public void setId_kupującego(int id_kupującego) {
        this.id_kupującego = id_kupującego;
    }

    public int getId_produktu() {
        return id_produktu;
    }

    public void setId_produktu(int id_produktu) {
        this.id_produktu = id_produktu;
    }

    public boolean isCzy_zrealizowano() {
        return czy_zrealizowano;
    }

    public void setCzy_zrealizowano(boolean czy_zrealizowano) {
        this.czy_zrealizowano = czy_zrealizowano;
    }
}
