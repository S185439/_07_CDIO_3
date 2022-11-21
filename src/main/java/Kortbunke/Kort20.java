package Kortbunke;

import Spiller.Spiller;
import gui_main.GUI;

import java.io.IOException;

public class Kort20 extends Kort {
    String kortTekst, kortTekst1,kortTekst2,kortTekst3, kortTekst4, kortTekst5;

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
        gui.displayChanceCard(kortTekst);
        String valg = gui.getUserSelection(kortTekst1, kortTekst2, kortTekst3, kortTekst4, kortTekst5);
        if (valg.equals(kortTekst2)) {
            spiller.setPlacering(1);
        } else if (valg.equals(kortTekst3)) {
            spiller.setPlacering(2);
        } else if (valg.equals(kortTekst4)) {
            spiller.setPlacering(16);
        } else {
            spiller.setPlacering(17);
        }
    }
}
