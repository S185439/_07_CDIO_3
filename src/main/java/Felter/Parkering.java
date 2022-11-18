package Felter;

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
    @Override
    public <Spiller> void landPaaFelt(Spiller spiller, GUI gui) {
        gui.showMessage(this.feltBesked);
    }

    @Override
    public <Spiller, Kortbunke> void landPaaFelt(Spiller spiller, Kortbunke kortbunke, GUI gui) {

    }

    @Override
    public GUI_Field getFelt() {
        return parkeringFelt;
    }
}
