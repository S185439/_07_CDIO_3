package Kortbunke;
import Spiller.Spiller;

import gui_main.GUI;


import java.io.IOException;

public class Kort1 extends Kort{

    public Kort1() throws IOException {
        super.kortTekst = textController.getTekst("KortTekst1");
    }

    @Override
    public void kortFunktion(Spiller spiller, GUI gui) {
        gui.displayChanceCard(super.kortTekst);
        //spiller.faaTypeKort();
    };
}
