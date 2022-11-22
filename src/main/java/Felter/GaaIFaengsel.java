package Felter;

import Kortbunke.KortBunke;
import SpillePlade.SpillePlade;
import Spiller.Spiller;
import gui_fields.GUI_Field;
import Felter.GUI_Empty;
import gui_fields.GUI_Jail;
import gui_main.GUI;

import java.awt.*;
import java.io.IOException;

public class GaaIFaengsel extends Felt{

    GUI_Jail gaaIFaengselFelt;
    public GaaIFaengsel() throws IOException {
        super.titel = textController.getTekst("GaaIFaengselTitel");
        super.underTekst = textController.getTekst("GaaIFaengselUndertekst");
        super.beskrivelse = textController.getTekst("GaaIFaengselBeskrivelse");;
        super.bgFarve = Color.LIGHT_GRAY;
        super.fgFarve = Color.BLACK;
        super.feltBesked = textController.getTekst("GaaIFaengselFeltBesked");
        gaaIFaengselFelt = new GUI_Jail("",super.titel, super.underTekst, super.beskrivelse, super.bgFarve, super.fgFarve);
    }

    /**
     * denne funktion ændre spiller tilstandet til at den er fængsel kun og kun hvis de ikke har et ud af fængselkort
     * @param spiller, det er et spiller object oprettet med Spiller.java
     * @param gui, det er et gui object, og skal være det gui object som bliver brugt til at oprette spillet,
     *             da metoden showMessage i guien bliver brugt i forbindelse med den
     */
    @Override
    public void landPaaFelt(Spiller spiller, GUI gui) {
        spiller.setPlacering(6);
        spiller.brugUdAfFaengselKort();
        gui.showMessage(this.feltBesked);
    }

    /**
     *  denne funktion ændre spiller tilstandet til at den er fængsel kun og kun hvis de ikke har et ud af fængselkort
     * @param spiller, det er et spiller object oprettet med Spiller.java
     * @param kortbunke, det er et kortbunke object oprette med Kortbunke.java
     * @param gui, det er et gui object, og skal være det gui object som bliver brugt til at oprette spillet,
     *             da metoden showMessage i guien bliver brugt i forbindelse med de
     */
    @Override
    public void landPaaFelt(Spiller spiller, KortBunke kortbunke, GUI gui) {
        spiller.setPlacering(6);
        spiller.brugUdAfFaengselKort();
        gui.showMessage(this.feltBesked);
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
        return gaaIFaengselFelt;
    }

    @Override
    public String getFeltType() {
        return "GaaIFaengselFelt";
    }
}
