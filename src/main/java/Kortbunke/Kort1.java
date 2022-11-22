package Kortbunke;
import Spiller.Spiller;

import gui_main.GUI;


import java.io.IOException;

public class Kort1 extends Kort{
    String kortTekst;

    public Kort1() throws IOException {
        super.kortTekst = textController.getTekst("KortTekst1");
    }

    @Override
    public void kortFunktion(Spiller spiller, GUI gui) {
        gui.displayChanceCard(kortTekst);
        //spiller.faaTypeKort();
    };
}
