package com.company;

public class SistemOperare extends Software {
    String tipHardware;

    public String getTipHardware() {
        return tipHardware;
    }

    public void setTipHardware(String tipHardware) {
        this.tipHardware = tipHardware;
    }

    public SistemOperare()
    {
        super();
    }

    public SistemOperare(int idProdus, String denumire, Double pretUnitar, String versiune, String tipHardware) {
        super(idProdus, denumire, pretUnitar, versiune);
        this.tipHardware = tipHardware;
    }
}
