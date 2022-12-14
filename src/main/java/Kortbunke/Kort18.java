package Kortbunke;

import Spiller.Spiller;
import gui_main.GUI;

import java.io.IOException;

public class Kort18 extends Kort {
    public Kort18() throws IOException {
        super.kortTekst = textController.getTekst("KortTekst18");
    }

    @Override
    public void kortFunktion(Spiller spiller, GUI gui) {
        gui.displayChanceCard(super.kortTekst);
        spiller.setPlacering(10);
    };
}
