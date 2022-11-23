package Kortbunke;

import Spiller.Spiller;
import gui_main.GUI;

import java.io.IOException;

public class Kort6 extends Kort {
    public class Kort5 extends Kort {

        public void Kort6() throws IOException {
            super.kortTekst = textController.getTekst("KortTekst6");
        }

        @Override
        public void kortFunktion(Spiller spiller, GUI gui) {
            gui.displayChanceCard(super.kortTekst);
            //Sæt spiller med Skib-brik til en hvis tilstand der gør at de på næste tur rykker frem til et ejendomsfelt
            //af deres valg. Derudover skal der trækkes et kort mere
            //spiller.faaTypeKort();
        }
    }
}
