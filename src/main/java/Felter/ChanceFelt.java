package Felter;
import Kortbunke.Kort;
import Kortbunke.KortBunke;
import SpillePlade.SpillePlade;
import Spiller.Spiller;
import gui_fields.GUI_Chance;
import gui_fields.GUI_Field;
import gui_main.GUI;

import java.awt.*;
import java.io.IOException;

public class ChanceFelt extends Felt{
    GUI_Chance chanceFelt;
    public ChanceFelt() throws IOException {
        super.titel = textController.getTekst("ChanceTitel");
        super.underTekst = textController.getTekst("ChanceUndertekst");
        super.beskrivelse = textController.getTekst("ChanceBeskrivelse");;
        super.bgFarve = Color.YELLOW;
        super.fgFarve = Color.BLACK;
        super.feltBesked = textController.getTekst("ChanceFeltBesked");
        chanceFelt = new GUI_Chance(super.titel, super.underTekst, super.beskrivelse, super.bgFarve, super.fgFarve);
    }

    /**
     * denne funktion gør ikke noget i i chancefeltet da den skal have et kortbunke input
     * @param spiller, det er et spiller object oprettet med Spiller.java
     * @param gui, det er et gui object, og skal være det gui object som bliver brugt til at oprette spillet,
     *             da metoden showMessage i guien bliver brugt i forbindelse med den
     */
    @Override
    public void landPaaFelt(Spiller spiller, GUI gui) {
    }

    /**
     *  Metoden tager og traekker et kort fra kortbunken og derefter bruger kortfunktionen i kortet
     *  paa det indsatte spiller objekt, til sidst viser den en besked
     * @param spiller, det er et spiller object oprettet med Spiller.java
     * @param kortbunke, det er et kortbunke object oprette med Kortbunke.java
     * @param gui, det er et gui object, og skal være det gui object som bliver brugt til at oprette spillet,
     *             da metoden showMessage i guien bliver brugt i forbindelse med de
     */
    @Override
    public void landPaaFelt(Spiller spiller, KortBunke kortbunke, GUI gui) {
        gui.showMessage(this.feltBesked);
        Kort kort = kortbunke.traekKort();
        kort.kortFunktion(spiller, gui);
    }

    @Override
    public void landPaaFelt(Spiller spiller, GUI gui, Spiller[] spillerArray, SpillePlade spillePlade) throws IOException {

    }

    /**
     *
     * @return et GUI_Chance objekt med de rette indtastninger
     */
    @Override
    public GUI_Field getFelt() {
        return chanceFelt;
    }

    @Override
    public String getFeltType() {
        return "ChanceFelt";
    }
}
