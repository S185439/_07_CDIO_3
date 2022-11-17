package Kortbunke;

import gui_main.GUI;

import java.io.IOException;

public class Kort11 extends Kort {
    String kortTekst;

    public Kort1() throws IOException {
        super.kortTekst = textController.getTekst("KortTekst11");
    }


    protected void kortFunktion(Spiller spiller1, GUI gui1) {
        Spiller spiller = new Spiller;
        spiller = spiller1;
        GUI gui = new GUI;
        gui = gui1;
        gui.displayChanceCard(kortTekst);
        spiller.setPlacering(23);
    };
}
