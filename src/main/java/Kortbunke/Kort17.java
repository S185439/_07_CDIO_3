package Kortbunke;

import Spiller.Spiller;
import gui_main.GUI;

import java.io.IOException;

public class Kort17 extends Kort {
    public Kort17() throws IOException {
        super.kortTekst = textController.getTekst("KortTekst17");
        super.kortTekst1 = textController.getTekst("KortTekst17.1");
        super.kortTekst2 = textController.getTekst("KortTekst17.2");
        super.kortTekst3 = textController.getTekst("KortTekst17.3");
    }
    @Override
    public void kortFunktion(Spiller spiller, GUI gui) {
        gui.displayChanceCard(super.kortTekst);
        String valg = gui.getUserSelection(super.kortTekst1, super.kortTekst2, super.kortTekst3);
        if (valg.equals(super.kortTekst2)) {
            spiller.setPlacering(13);
        } else {
            spiller.setPlacering(14);
        };
    };
}
