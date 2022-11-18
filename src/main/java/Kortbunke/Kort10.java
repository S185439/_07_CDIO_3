package Kortbunke;

import Spiller.Spiller;
import gui_main.GUI;

import java.io.IOException;

public class Kort10 extends Kort{
    String kortTekst;

    public Kort10() throws IOException {
        super.kortTekst = textController.getTekst("KortTekst10");
    }


    public void kortFunktion(Spiller spiller, GUI gui) {
        gui.displayChanceCard(kortTekst);
        spiller.faaUdAfFaengselKort();
    };
}
