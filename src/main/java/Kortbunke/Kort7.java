package Kortbunke;

import Spiller.Spiller;
import gui_main.GUI;

import java.io.IOException;

public class Kort7 extends Kort {

    public Kort7() throws IOException {
        super.kortTekst = textController.getTekst("KortTekst7");
    }
    @Override
    //rykker spilleren til start
    public void kortFunktion(Spiller spiller, GUI gui) {
        gui.displayChanceCard(super.kortTekst);
        spiller.spillerKonto.transaktion(-2);
    };
}
