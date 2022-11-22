package Spiller;

public class Spiller {
    //Kode taget fra CDIO2
    public String navn;
    public Konto spillerKonto;
    public boolean iFaengsel;
    public int udAfFaengselKort;
    public int placering;
    public int startPenge;
    public boolean harTypeKort;



    //Constructor til Spiller
    public Spiller (String navn, int penge) {
        this.navn = navn;
        startPenge = penge;
        spillerKonto = new Konto(startPenge);
        this.iFaengsel = false;
        this.harTypeKort = false;
        this.placering = 0;
        this.udAfFaengselKort = 0;
    }

    public void faaUdAfFaengselKort() {
        this.udAfFaengselKort += 1;
    }

    public void brugUdAfFaengselKort() {
        if (this.udAfFaengselKort >= 0) {
            this.udAfFaengselKort -= 1;
        }
    }

    public void faaTypeKort() { this.harTypeKort = true; }

    public void brugTypeKort() {
        if (this.harTypeKort) {
            harTypeKort = false;
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
        this.spillerKonto.transaktion(2);
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
