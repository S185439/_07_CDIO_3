package Kortbunke;

import gui_main.GUI;

import java.io.IOException;

public class Kort10 extends Kort{
    String kortTekst;

    public Kort10() throws IOException {
        super.kortTekst = textController.getTekst("KortTekst10");
    }


    protected void kortFunktion(Spiller spiller1, GUI gui1) {
        Spiller spiller = new Spiller;
        spiller = spiller1;
        GUI gui = new GUI;
        gui = gui1;
        gui.displayChanceCard(kortTekst);
        spiller.FaaUdAfFaengselKort();
    };
}
