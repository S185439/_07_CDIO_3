package Spiller;

public class Konto {
    private int penge;

    Konto(int startVaerdi1) {
        penge = startVaerdi1;
    }

    public void transaktion(int vaerdi) {
        penge += vaerdi;
    }

    public int getPenge() {
        return penge;
    }
    public int setPenge(int vaerdi) {
        penge = vaerdi;
        return penge;
    }
    public String toString() {
        return Integer.toString(penge);
    }

}
