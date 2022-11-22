package Kortbunke;

import Spiller.Spiller;
import gui_main.GUI;

import java.io.IOException;

public class Kort14 extends Kort{
    String kortTekst;

    public Kort14() throws IOException {
        super.kortTekst = textController.getTekst("KortTekst14");
    }


    public void kortFunktion(Spiller spiller, GUI gui) {
        gui.displayChanceCard(kortTekst);
        //loop der giver personen penge og tager det fra andre.

    };
}
