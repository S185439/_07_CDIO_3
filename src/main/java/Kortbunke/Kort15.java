package Kortbunke;

import Spiller.Spiller;
import gui_main.GUI;

import java.io.IOException;

public class Kort15 extends Kort {

    public Kort15() throws IOException {
        super.kortTekst = textController.getTekst("KortTekst15");
        super.kortTekst1 = textController.getTekst("KortTekst15.1");
        super.kortTekst2 = textController.getTekst("KortTekst15.2");
        super.kortTekst3 = textController.getTekst("KortTekst15.3");
        super.kortTekst4 = textController.getTekst("KortTekst15.4");
        super.kortTekst5 = textController.getTekst("KortTekst15.5");
    }
    @Override
    public void kortFunktion(Spiller spiller, GUI gui) {
        gui.displayChanceCard(super.kortTekst);
        String valg = gui.getUserSelection(super.kortTekst1, super.kortTekst2, super.kortTekst3, super.kortTekst4, super.kortTekst5);
        if (valg.equals(super.kortTekst2)) {
            spiller.setPlacering(13);
        } else if (valg.equals(super.kortTekst3)) {
            spiller.setPlacering(14);
        } else if (valg.equals(super.kortTekst4)) {
            spiller.setPlacering(19);
        } else {
            spiller.setPlacering(20);
        }
    }
}
