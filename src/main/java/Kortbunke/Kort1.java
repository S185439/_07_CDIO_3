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
        //Sæt spiller med bil-brik til en hvis tilstand der gør at de på næste tur rykker frem til et ejendomsfelt
        //af deres valg. Derudover skal der trækkes et kort mere

    };
}
