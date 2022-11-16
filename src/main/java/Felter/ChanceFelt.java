package Felter;

import gui_fields.GUI_Chance;
import gui_fields.GUI_Field;
import gui_main.GUI;

import java.awt.*;
import java.io.IOException;

public class ChanceFelt extends Felt{
    GUI_Chance chanceFelt;
    ChanceFelt() throws IOException {
        super.titel = textController.getTekst("ChanceTitel");
        super.underTekst = textController.getTekst("ChanceUndertekst");
        super.beskrivelse = textController.getTekst("ChanceBeskrivelse");;
        super.bgFarve = Color.YELLOW;
        super.fgFarve = Color.BLACK;
        super.feltBesked = textController.getTekst("ChanceFeltBesked");
        chanceFelt = new GUI_Chance(super.titel, super.underTekst, super.beskrivelse, super.bgFarve, super.fgFarve);
    }
    @Override
    public <Spiller> void landPaaFelt(Spiller spiller, GUI gui) {
    }

    @Override
    public <Spiller, KortBunke> void landPaaFelt(Spiller spiller, KortBunke kortbunke, GUI gui) {
        //Kort kort = kortbunke.traekKort();
        //kort.kortFunktion(spiller);
        gui.showMessage(this.feltBesked);
    }

    @Override
    public GUI_Field getFelt() {
        return chanceFelt;
    }
}
