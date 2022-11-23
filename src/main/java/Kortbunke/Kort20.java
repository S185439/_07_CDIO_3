package Kortbunke;

import Spiller.Spiller;
import gui_main.GUI;

import java.io.IOException;

public class Kort20 extends Kort {

    public Kort20() throws IOException {
        super.kortTekst = textController.getTekst("KortTekst20");
        super.kortTekst1 = textController.getTekst("KortTekst20.1");
        super.kortTekst2 = textController.getTekst("KortTekst20.2");
        super.kortTekst3 = textController.getTekst("KortTekst20.3");
        super.kortTekst4 = textController.getTekst("KortTekst20.4");
        super.kortTekst5 = textController.getTekst("KortTekst20.5");
    }
    @Override
    public void kortFunktion(Spiller spiller, GUI gui) {
        gui.displayChanceCard(super.kortTekst);
        String valg = gui.getUserSelection(super.kortTekst1, super.kortTekst2, super.kortTekst3, super.kortTekst4, super.kortTekst5);
        if (valg.equals(super.kortTekst2)) {
            spiller.setPlacering(1);
        } else if (valg.equals(super.kortTekst3)) {
            spiller.setPlacering(2);
        } else if (valg.equals(super.kortTekst4)) {
            spiller.setPlacering(16);
        } else {
            spiller.setPlacering(17);
        }
    }
}
