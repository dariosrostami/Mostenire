package com.company;

public class SistemDesktop extends Hardware{
    String tipArhitectura;

    public SistemDesktop() {
        super();
    }

    public SistemDesktop(int idProdus, String denumire, Double pretUnitar, String numarModel, String tipArhitectura) {
        super(idProdus, denumire, pretUnitar, numarModel);
        this.tipArhitectura = tipArhitectura;
    }

    public String getTipArhitectura() {
        return tipArhitectura;
    }

    public void setTipArhitectura(String tipArhitectura) {
        this.tipArhitectura = tipArhitectura;
    }
}
