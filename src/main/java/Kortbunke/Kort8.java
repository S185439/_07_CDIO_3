package Kortbunke;

import Spiller.Spiller;
import gui_main.GUI;

import java.io.IOException;

public class Kort8 extends Kort {

    public Kort8() throws IOException {
        super.kortTekst = textController.getTekst("KortTekst8");
        super.kortTekst1 = textController.getTekst("KortTekst8.1");
        super.kortTekst2 = textController.getTekst("KortTekst8.2");
        super.kortTekst3 = textController.getTekst("KortTekst8.3");
        super.kortTekst4 = textController.getTekst("KortTekst8.4");
        super.kortTekst5 = textController.getTekst("KortTekst8.5");
    }
    @Override
    public void kortFunktion(Spiller spiller, GUI gui) {
        gui.displayChanceCard(super.kortTekst);
        String valg = gui.getUserSelection(super.kortTekst1, super.kortTekst2, super.kortTekst3, super.kortTekst4, super.kortTekst5);
        if (valg.equals(super.kortTekst2)) {
            spiller.setPlacering(10);
        } else if (valg.equals(super.kortTekst3)) {
            spiller.setPlacering(11);
        } else if (valg.equals(super.kortTekst4)) {
            spiller.setPlacering(19);
        } else {
            spiller.setPlacering(20);
        }
    }
}
