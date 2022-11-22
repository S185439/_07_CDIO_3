package Felter;

import Kortbunke.KortBunke;
import SpillePlade.SpillePlade;
import Spiller.Spiller;
import gui_fields.GUI_Field;
import gui_fields.GUI_Jail;
import gui_main.GUI;

import java.awt.*;
import java.io.IOException;

public class Faengsel extends Felt{

    GUI_Jail faengselFelt;

    public Faengsel() throws IOException {
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
    public void landPaaFelt(Spiller spiller, GUI gui) {
        gui.showMessage(this.feltBesked);
    }

    @Override
    public void landPaaFelt(Spiller spiller, KortBunke kortbunke, GUI gui) {

    }

    @Override
    public void landPaaFelt(Spiller spiller, GUI gui, Spiller[] spillerArray, SpillePlade spillePlade) throws IOException {

    }

    @Override
    public GUI_Field getFelt() {
        return faengselFelt;
    }

    @Override
    public String getFeltType() {
        return "FaengselFelt";
    }
}
