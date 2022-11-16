package Felter;

import gui_fields.GUI_Field;
import gui_fields.GUI_Street;
import gui_main.GUI;

import java.awt.*;

public class Ejendom extends Felt{

    GUI_Street ejendomsFelt;
    int koebsVaerdiInt;
    String koebsVaerdiString;
    Color farve;
    boolean koebsTilstand;
    int huslejeInt;
    String huslejeString;
    String ejer;

    Ejendom(int koebsVaerdi, String navn, Color farve) {
        super.titel = navn;
        super.underTekst = textController.getTekst("EjendomUndertekst");
        super.beskrivelse = textController.getTekst("EjendomBeskrivelse");;
        super.bgFarve = farve;
        super.fgFarve = Color.BLACK;
        this.farve = farve;
        this.koebsTilstand = false;
        this.koebsVaerdiInt = koebsVaerdi;
        this.koebsVaerdiString = Integer.toString(koebsVaerdi);
        this.ejer = "";
        this.huslejeInt = koebsVaerdi;
        this.huslejeString = Integer.toString(koebsVaerdi);
        ejendomsFelt = new GUI_Street(super.titel, super.underTekst, super.beskrivelse, this.koebsVaerdiString, super.bgFarve, super.fgFarve);
    }

    private <Spiller> void koebEjendom(Spiller spiller) {
        this.koebsTilstand = true;
        this.ejer = spiller.getNavn;
        spiller.transaktion(-koebsVaerdiInt);
    }
    @Override
    public <Spiller> void landPaaFelt(Spiller spiller, GUI gui) {
        if (this.koebsTilstand && this.ejer.equals(spiller.getNavn())) {
            gui.showMessage(textController.getTekst("EjendomTekstLandetSpillerEjerFelt"));
        } else if (this.koebsTilstand && !this.ejer.equals(spiller.getNavn())) {
            gui.showMessage(textController.getTekst("EjendomTekstLandetSpillerEjerIkkeFelt"));
            spiller.transaktion(-huslejeInt);
        } else {
            gui.showMessage(textController.getTekst("EjendomTekstIkkeEjetFelt"));
            koebEjendom(spiller);
        }
    }

    @Override
    public <Spiller, Kortbunke> void landPaaFelt(Spiller spiller, Kortbunke kortbunke, GUI gui) {
        if (this.koebsTilstand && this.ejer.equals(spiller.getNavn())) {
            gui.showMessage(textController.getTekst("EjendomTekstLandetSpillerEjerFelt"));
        } else if (this.koebsTilstand && !this.ejer.equals(spiller.getNavn())) {
            gui.showMessage(textController.getTekst("EjendomTekstLandetSpillerEjerIkkeFelt"));
            spiller.transaktion(-huslejeInt);
        } else {
            gui.showMessage(textController.getTekst("EjendomTekstIkkeEjetFelt"));
            koebEjendom(spiller);
        }
    }

    @Override
    public GUI_Field getFelt() {
        return ejendomsFelt;
    }
}
