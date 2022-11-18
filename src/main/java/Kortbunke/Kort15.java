package Kortbunke;

import Spiller.Spiller;
import gui_main.GUI;

import java.io.IOException;

public class Kort15 extends Kort {
    String kortTekst, kortTekst1,kortTekst2,kortTekst3, kortTekst4, kortTekst5;

    public Kort15(String kortTekst1) throws IOException {
        super.kortTekst = textController.getTekst("KortTekst15");
        super.kortTekst1 = textController.getTekst("KortTekst15.1");
        super.kortTekst2 = textController.getTekst("KortTekst15.2");
        super.kortTekst3 = textController.getTekst("KortTekst15.3");
        super.kortTekst4 = textController.getTekst("KortTekst15.4");
        super.kortTekst5 = textController.getTekst("KortTekst15.5");
    }
    @Override
    protected void kortFunktion(Spiller spiller1, GUI gui1) {
        Spiller spiller = new Spiller;
        spiller = spiller1;
        GUI gui = new GUI;
        gui = gui1;
        gui.displayChanceCard(kortTekst);
        String valg = gui.getUserSelection(kortTekst1, kortTekst2, kortTekst3, kortTekst4, kortTekst5);
        if (valg.equals(kortTekst2)) {
            spiller.setPlacering(13);
        } else if (valg.equals(kortTekst3)) {
            spiller.setPlacering(14);
        } else if (valg.equals(kortTekst4)) {
            spiller.setPlacering(19);
        } else {
            spiller.setPlacering(20);
        }
    }
}
