package com.company;

public class SuitaOffice extends Software{
    String tipSistemOperare;

    public SuitaOffice() {
        super();
    }

    public SuitaOffice(int idProdus, String denumire, Double pretUnitar, String versiune, String tipSistemOperare) {
        super(idProdus, denumire, pretUnitar, versiune);
        this.tipSistemOperare = tipSistemOperare;
    }

    public String getTipSistemOperare() {
        return tipSistemOperare;
    }

    public void setTipSistemOperare(String tipSistemOperare) {
        this.tipSistemOperare = tipSistemOperare;
    }
}
