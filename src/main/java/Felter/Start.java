package Felter;

import Kortbunke.KortBunke;
import Spiller.Spiller;
import gui_fields.GUI_Field;
import gui_fields.GUI_Start;
import gui_main.GUI;

import java.awt.*;
import java.io.IOException;

public class Start extends Felt{

    GUI_Start startFelt;
    public Start() throws IOException {
        super.titel = textController.getTekst("StartTitel");
        super.underTekst = textController.getTekst("StartUndertekst");
        super.beskrivelse = textController.getTekst("StartBeskrivelse");;
        super.bgFarve = Color.RED;
        super.fgFarve = Color.WHITE;
        super.feltBesked = textController.getTekst("StartFeltBesked");
        startFelt = new GUI_Start(super.titel, super.underTekst, super.beskrivelse, super.bgFarve, super.fgFarve);
    }
    @Override
    public void landPaaFelt(Spiller spiller, GUI gui) {
        spiller.spillerKonto.transaktion(2);
        gui.showMessage(this.feltBesked);
    }

    @Override
    public void landPaaFelt(Spiller spiller, KortBunke kortbunke, GUI gui) {
        spiller.spillerKonto.transaktion(2);
        gui.showMessage(this.feltBesked);
    }

    @Override
    public GUI_Field getFelt() {
        return startFelt;
    }
}
