package Kortbunke;

import Spiller.Spiller;
import gui_main.GUI;

import java.io.IOException;

public class Kort18 extends Kort {
    String kortTekst;

    public Kort18() throws IOException {
        super.kortTekst = textController.getTekst("KortTekst18");
    }


    protected void kortFunktion(Spiller spiller1, GUI gui1) {
        Spiller spiller = new Spiller;
        spiller = spiller1;
        GUI gui = new GUI;
        gui = gui1;
        gui.displayChanceCard(kortTekst);
        spiller.setPlacering(10);
    };
}
