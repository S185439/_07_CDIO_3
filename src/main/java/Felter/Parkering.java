package Felter;

import Kortbunke.KortBunke;
import Spiller.Spiller;
import gui_fields.GUI_Empty;
import gui_fields.GUI_Field;
import gui_main.GUI;

import java.awt.*;
import java.io.IOException;

public class Parkering extends Felt{

    GUI_Empty parkeringFelt;

    public Parkering() throws IOException {
        super.titel = textController.getTekst("ParkeringTitel");
        super.underTekst = textController.getTekst("ParkeringUndertekst");
        super.beskrivelse = textController.getTekst("ParkeringBeskrivelse");;
        super.bgFarve = Color.GRAY;
        super.fgFarve = Color.WHITE;
        super.feltBesked = textController.getTekst("ParkeringBesked");
        parkeringFelt = new GUI_Empty( super.bgFarve, super.fgFarve, super.titel, super.underTekst, super.beskrivelse);
    }
    /**
     * denne funktion gør ikke andet end at sende en besked til brugeren, da det er et parkeringsfelt
     * @param spiller, det er et spiller object oprettet med Spiller.java
     * @param gui, det er et gui object, og skal være det gui object som bliver brugt til at oprette spillet,
     *             da metoden showMessage i guien bliver brugt i forbindelse med den
     */
    @Override
    public void landPaaFelt(Spiller spiller, GUI gui) {
        gui.showMessage(this.feltBesked);
    }

    @Override
    public void landPaaFelt(Spiller spiller, KortBunke kortbunke, GUI gui) {

    }

    /**
     *
     * @return et GUI_Empty objekt med de rette indtastninger
     */
    @Override
    public GUI_Field getFelt() {
        return parkeringFelt;
    }
}
