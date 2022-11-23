package Kortbunke;

import Spiller.Spiller;
import gui_main.GUI;

import java.io.IOException;

public class Kort2 extends Kort {

    public Kort2() throws IOException {
        super.kortTekst = textController.getTekst("KortTekst2");
    }

    //rykker spilleren til start
    @Override
    public void kortFunktion(Spiller spiller, GUI gui) {
        gui.displayChanceCard(super.kortTekst);
        spiller.setPlacering(0);
    };
}
