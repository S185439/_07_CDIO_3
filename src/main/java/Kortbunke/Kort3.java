package Kortbunke;

import Spiller.Spiller;
import gui_main.GUI;

import java.io.IOException;

public class Kort3 extends Kort {
    String kortTekst, kortTekst1;

    public Kort3(String kortTekst1) throws IOException {
        super.kortTekst = textController.getTekst("KortTekst3");
        super.kortTekst1 = textController.getTekst("KortTekst3.1");
    }
    @Override
    public void kortFunktion(Spiller spiller, GUI gui) {
        String antalFelter = gui.getUserSelection(kortTekst1, "1","2","3","4","5");
        spiller.rykSpiller(Integer.parseInt(antalFelter));
    };
}
