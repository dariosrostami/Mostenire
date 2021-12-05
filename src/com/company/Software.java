package com.company;

public abstract class Software extends Produs {
    private String versiune;
    public Software()
    {
        super();
    }

    public Software(int idProdus, String denumire, Double pretUnitar, String versiune) {
        super(idProdus, denumire, pretUnitar);
        this.versiune = versiune;
        System.out.println("S-au setat toate cele 4 proprietati ale prod soft");
    }

    public String getVersiune() {
        return versiune;
    }

    public void setVersiune(String versiune) {
        this.versiune = versiune;
    }
}
