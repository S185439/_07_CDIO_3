package Kortbunke;

import Spiller.Spiller;
import gui_main.GUI;

import java.io.IOException;

public class Kort12 extends Kort {

    public Kort12() throws IOException {
        super.kortTekst = textController.getTekst("KortTekst12");
    }

    @Override
    public void kortFunktion(Spiller spiller, GUI gui) {
        gui.displayChanceCard(super.kortTekst);
        //Sæt spiller med Katte-brik til en hvis tilstand der gør at de på næste tur rykker frem til et ejendomsfelt
        //af deres valg. Derudover skal der trækkes et kort mere
        //spiller.faaTypeKort();

    };
}
