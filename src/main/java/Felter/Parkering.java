package Felter;

import Kortbunke.KortBunke;
import SpillePlade.SpillePlade;
import Spiller.Spiller;
import Felter.GUI_Empty;
import gui_fields.GUI_Field;
import gui_fields.GUI_Refuge;
import gui_main.GUI;

import java.awt.*;
import java.io.IOException;

public class Parkering extends Felt{

    GUI_Refuge parkeringFelt;

    public Parkering() throws IOException {
        super.titel = textController.getTekst("ParkeringTitel");
        super.underTekst = textController.getTekst("ParkeringUndertekst");
        super.beskrivelse = textController.getTekst("ParkeringBeskrivelse");;
        super.bgFarve = Color.GRAY;
        super.fgFarve = Color.WHITE;
        super.feltBesked = textController.getTekst("ParkeringBesked");
        parkeringFelt = new GUI_Refuge("",this.titel, this.underTekst, this.beskrivelse, this.bgFarve, this.fgFarve);
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

    @Override
    public void landPaaFelt(Spiller spiller, GUI gui, Spiller[] spillerArray, SpillePlade spillePlade) throws IOException {

    }

    /**
     *
     * @return et GUI_Empty objekt med de rette indtastninger
     */
    @Override
    public GUI_Field getFelt() {
        return parkeringFelt;
    }

    @Override
    public String getFeltType() {
        return "ParkeringsFelt";
    }
}
