package Kortbunke;

import Spiller.Spiller;
import gui_main.GUI;

import java.io.IOException;

public class Kort4 extends Kort {

    public Kort4() throws IOException {
        super.kortTekst = textController.getTekst("KortTekst4");
        super.kortTekst1 = textController.getTekst("KortTekst4.1");
        super.kortTekst2 = textController.getTekst("KortTekst4.2");
        super.kortTekst3 = textController.getTekst("KortTekst4.3");
    }
    @Override
    public void kortFunktion(Spiller spiller, GUI gui) {
        gui.displayChanceCard(super.kortTekst);
        String valg = gui.getUserSelection(super.kortTekst1, super.kortTekst2, super.kortTekst3);
        if (valg.equals(super.kortTekst2)) {
            spiller.setPlacering(10);
        } else {
            spiller.setPlacering(11);
        };
    };
}
