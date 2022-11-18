package Spiller;

public class Spiller {
    //Kode taget fra CDIO2
    public String navn;
    public Konto Spillerkonto;
    public boolean iFaengsel;
    public int udAfFaengselKort;
    public int placering;
    public int startPenge;



    //Constructor til Spiller
    public Spiller (String navn, int penge) {
        this.navn = navn;
        startPenge = penge;
        Spillerkonto = new Konto(startPenge);
        this.iFaengsel = false;
        this.placering = 0;
        this.udAfFaengselKort = 0;
    }

    public void faaUdAfFaengselKort() {
        this.udAfFaengselKort += 1;
    }

    public boolean brugFaengselKort() {
        if (this.udAfFaengselKort >= 0) {
            this.udAfFaengselKort -= 1;
            return true;
        } else {
            return false;
        }
    }

    public void rykSpiller(int felterFrem) {
        for (int i = 0; i<felterFrem; i++) {
            this.placering += 1;
            if (this.placering > 23) {
                this.placering = 0;
            }
        }
    }

    public void overStart() {
        this.Spillerkonto.transaktion(2);
    }

    // Getter og Setter for spillerens navn
    public void setSpillerNavn(String navn){
        this.navn = navn;
    }
    public String getSpillerNavn(){
        return navn;
    }

    public boolean isiFaengsel() {
        return iFaengsel;
    }

    public void setiFaengsel(boolean iFaengsel) {
        this.iFaengsel = iFaengsel;
    }

    public int getUdAfFaengselKort() {
        return udAfFaengselKort;
    }

    public void setUdAfFaengselKort(int udAfFaengselKort) {
        this.udAfFaengselKort = udAfFaengselKort;
    }

    public int getPlacering() {
        return placering;
    }

    public void setPlacering(int placering) {
        this.placering = placering;
    }
}
