package Kortbunke;

import Spiller.Spiller;
import gui_main.GUI;

import java.io.IOException;

public class Kort11 extends Kort {

    public Kort11() throws IOException {
        super.kortTekst = textController.getTekst("KortTekst11");
    }

    @Override
    public void kortFunktion(Spiller spiller, GUI gui) {
        gui.displayChanceCard(super.kortTekst);
        spiller.setPlacering(23);
    };
}
