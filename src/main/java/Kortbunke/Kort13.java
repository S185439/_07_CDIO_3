package Kortbunke;

import Spiller.Spiller;
import gui_main.GUI;

import java.io.IOException;

public class Kort13 extends Kort{
    String kortTekst;

    public Kort13() throws IOException {
        super.kortTekst = textController.getTekst("KortTekst13");
    }


    public void kortFunktion(Spiller spiller, GUI gui) {
        gui.displayChanceCard(kortTekst);
        //Sæt spiller med Hunde-brik til en hvis tilstand der gør at de på næste tur rykker frem til et ejendomsfelt
        //af deres valg. Derudover skal der trækkes et kort mere
    };
}
