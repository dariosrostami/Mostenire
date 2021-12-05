package com.company;

public class SistemMobil extends Hardware{
    Double capacitateMemorie;

    public SistemMobil() {
        super();
    }

    public SistemMobil(int idProdus, String denumire, Double pretUnitar, String numarModel, Double capacitateMemorie) {
        super(idProdus, denumire, pretUnitar, numarModel);
        this.capacitateMemorie = capacitateMemorie;
    }

    public Double getCapacitateMemorie() {
        return capacitateMemorie;
    }

    public void setCapacitateMemorie(Double capacitateMemorie) {
        this.capacitateMemorie = capacitateMemorie;
    }
}
