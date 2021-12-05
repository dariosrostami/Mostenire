package com.company;

public class Main {

    public static void main(String[] args) {
        SistemOperare p1 = new SistemOperare(1,"MS Windows", 450.0, "v10", "x86.64");
        SistemOperare p2 = new SistemOperare(2, "Apple MacOS", 1250.0, "v10.14", "MacBook Pro");
        SuitaOffice p3 = new SuitaOffice(3, "MS Office", 850.0, "v2010", "MS Windows 10");
        SistemDesktop p4 = new SistemDesktop(4, "PC Dell", 2700.0, "OptiPlex", "mini tower");
        SistemMobil p5 = new SistemMobil(5, "NB Lenovo", 4100.0, "IdeaPad", 16.0);
        SistemMobil p6 = new SistemMobil(6, "iPhone", 6500.0, "11X", 6.0);

        // Up-casting (cand pun intr-un tip de baza un obiect al unei clase derivate)
        Produs x = p3;

        System.out.println(x.getDenumire());

        // Down-casting
        // cand convertesc de la tip de baza la tip derivat
        // merge doar cand in variabila de tip de baza, de fapt memorez
        // un obiect al tipului derivat la care vreau sa fac conversia

        if (x.getClass().equals(SuitaOffice.class))
        // aici am verificat daca tipul lui x este SuitaOffice
        // daca nu este, nu pot face conversia
        {
            // am facut conversia explicita (down-casting)
            SuitaOffice y = (SuitaOffice) x;
        }
        // contraex: voi primi eroare la executie

        SistemDesktop q = (SistemDesktop) x;
    }
}

