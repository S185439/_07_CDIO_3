package Felter;

import gui_fields.GUI_Empty;
import gui_fields.GUI_Field;
import gui_main.GUI;

import java.awt.*;

public class GaaIFaengsel extends Felt{

    GUI_Empty gaaIFaengselFelt;
    GaaIFaengsel() {
        super.titel = textController.getTekst("GaaIFaengselTitel");
        super.underTekst = textController.getTekst("GaaIFaengselUndertekst");
        super.beskrivelse = textController.getTekst("GaaIFaengselBeskrivelse");;
        super.bgFarve = Color.LIGHT_GRAY;
        super.fgFarve = Color.BLACK;
        super.feltBesked = textController.getTekst("GaaIFaengselFeltBesked");
        gaaIFaengselFelt = new GUI_Empty(super.bgFarve, super.fgFarve, super.titel, super.underTekst, super.beskrivelse);
    }
    @Override
    public <Spiller> void landPaaFelt(Spiller spiller, GUI gui) {
        if (spiller.getUdAfFaengselKort <= 0) {
            spiller.setIFaengsel(True);
        } else {
            spiller.brugUdAfFaengselKort();
        }
        gui.showMessage(this.feltBesked);
    }

    @Override
    public <Spiller, Kortbunke> void landPaaFelt(Spiller spiller, Kortbunke kortbunke, GUI gui) {
        if (spiller.getUdAfFaengselKort <= 0) {
            spiller.setIFaengsel(True);
        } else {
            spiller.brugUdAfFaengselKort();
        }
        gui.showMessage(this.feltBesked);
    }

    @Override
    public GUI_Field getFelt() {
        return gaaIFaengselFelt;
    }
}
