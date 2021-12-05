package com.company;

public abstract class Hardware extends Produs{
    String numarModel;

    public Hardware() {
        super();
    }

    public Hardware(int idProdus, String denumire, Double pretUnitar, String numarModel) {
        super(idProdus, denumire, pretUnitar);
        this.numarModel = numarModel;
    }

    public String getNumarModel() {
        return numarModel;
    }

    public void setNumarModel(String numarModel) {
        this.numarModel = numarModel;
    }
}
