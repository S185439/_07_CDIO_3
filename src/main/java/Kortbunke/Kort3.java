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
    protected void kortFunktion(Spiller spiller1, GUI gui1) {
        Spiller spiller = new Spiller;
        spiller = spiller1;
        GUI gui = new GUI;
        gui = gui1;
        String antalFelter = gui.getUserSelection(kortTekst1, "1","2","3","4","5");
        spiller.rykSpiller(Integer.parseInt(antalFelter));
    };
}
