package Kortbunke;

import Spiller.Spiller;
import gui_main.GUI;

import java.io.IOException;

public class Kort16 extends Kort {
    String kortTekst;

    public Kort16() throws IOException {
        super.kortTekst = textController.getTekst("KortTekst16");
    }

    //rykker spilleren til start
    public void kortFunktion(Spiller spiller, GUI gui) {
        gui.displayChanceCard(kortTekst);
        spiller.spillerKonto.transaktion(2);
    };
}
