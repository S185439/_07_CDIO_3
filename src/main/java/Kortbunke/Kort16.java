package Kortbunke;

import gui_main.GUI;

import java.io.IOException;

public class Kort16 extends Kort {
    String kortTekst;

    public Kort16(String kortTekst1) throws IOException {
        super.kortTekst = textController.getTekst("KortTekst16");
    }

    //rykker spilleren til start
    protected void kortFunktion(Spiller spiller1, GUI gui1) {
        Spiller spiller = new Spiller;
        spiller = spiller1;
        GUI gui = new GUI;
        gui = gui1;
        gui.displayChanceCard(kortTekst);
        spiller.Konto.transaktion(2);
    };
}
