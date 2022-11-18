package Kortbunke;

import gui_main.GUI;

import java.io.IOException;

public class Kort5 extends Kort{
    String kortTekst, kortTekst1,kortTekst2,kortTekst3;

    public Kort5(String kortTekst1) throws IOException {
        super.kortTekst = textController.getTekst("KortTekst5");
        super.kortTekst1 = textController.getTekst("KortTekst5.1");
        super.kortTekst2 = textController.getTekst("KortTekst5.2");
        super.kortTekst3 = textController.getTekst("KortTekst5.3");
    }
    @Override
    protected void kortFunktion(Spiller spiller1, GUI gui1) {
        Spiller spiller = new Spiller;
        spiller = spiller1;
        GUI gui = new GUI;
        gui = gui1;
        gui.displayChanceCard(kortTekst);
        String valg = gui.getUserSelection(kortTekst1, kortTekst2,kortTekst3);
        if (valg.equals(kortTekst2)) {
            spiller.rykSpiller(1);
        } else {
            //tag et chancekort mere
        }
    };
}
