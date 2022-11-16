package Felter;

import gui_fields.GUI_Field;
import gui_fields.GUI_Jail;
import gui_main.GUI;

import java.awt.*;

public class Faengsel extends Felt{

    GUI_Jail faengselFelt;

    Faengsel() {
        String billede = textController.getTekst("FaengselBillede");
        super.titel = textController.getTekst("FaengselTitel");
        super.underTekst = textController.getTekst("FaengselUndertekst");
        super.beskrivelse = textController.getTekst("FaengselBeskrivelse");;
        super.bgFarve = Color.GRAY;
        super.fgFarve = Color.WHITE;
        super.feltBesked = textController.getTekst("FaengselFeltBesked");
        faengselFelt = new GUI_Jail(billede, super.titel, super.underTekst, super.beskrivelse, super.bgFarve, super.fgFarve);
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
        return faengselFelt;
    }
}
