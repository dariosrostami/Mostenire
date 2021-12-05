package com.company;

public class Produs {
    private int idProdus;
    private String denumire;
    private Double pretUnitar;

    public Produs(int idProdus, String denumire, Double pretUnitar) {
        this.idProdus = idProdus;
        this.denumire = denumire;
        this.pretUnitar = pretUnitar;
        System.out.println("S-a initializat produsul :D");
    }

    public Produs() {
    }

    public int getIdProdus() {
        return idProdus;
    }

    public void setIdProdus(int idProdus) {
        this.idProdus = idProdus;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public Double getPretUnitar() {
        return pretUnitar;
    }

    public void setPretUnitar(Double pretUnitar) {
        this.pretUnitar = pretUnitar;
    }
}
