package Kortbunke;

import gui_main.GUI;

import java.io.IOException;

public class Kort14 extends Kort{
    String kortTekst;

    public Kort14() throws IOException {
        super.kortTekst = textController.getTekst("KortTekst14");
    }


    protected void kortFunktion(Spiller spiller1, GUI gui1) {
        Spiller spiller = new Spiller;
        spiller = spiller1;
        GUI gui = new GUI;
        gui = gui1;
        gui.displayChanceCard(kortTekst);
        //loop der giver personen penge og tager det fra andre.

    };
}
}
