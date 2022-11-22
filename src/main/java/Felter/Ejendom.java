package Felter;

import Kortbunke.KortBunke;
import Spiller.Spiller;
import gui_fields.GUI_Field;
import gui_fields.GUI_Street;
import gui_main.GUI;
import SpillePlade.SpillePlade;

import java.awt.*;
import java.io.IOException;

public class Ejendom extends Felt{

    GUI_Street ejendomsFelt;
    int koebsVaerdiInt;
    String koebsVaerdiString;
    Color farve;
    boolean koebsTilstand;
    int huslejeInt;
    String huslejeString;
    String ejer;

    public Ejendom(int koebsVaerdi, String navn, Color farve) throws IOException {
        super.titel = navn;
        super.beskrivelse = textController.getTekst("EjendomBeskrivelse");
        super.bgFarve = farve;
        super.fgFarve = Color.BLACK;
        this.farve = farve;
        this.koebsTilstand = false;
        this.koebsVaerdiInt = koebsVaerdi;
        this.koebsVaerdiString = Integer.toString(koebsVaerdi);
        this.ejer = "";
        this.huslejeInt = koebsVaerdi;
        this.huslejeString = Integer.toString(koebsVaerdi);
        super.underTekst = textController.getTekst("EjendomUnderTekst")+ ": " + this.koebsVaerdiString;
        ejendomsFelt = new GUI_Street(this.titel, super.underTekst, super.beskrivelse, this.koebsVaerdiString, super.bgFarve, super.fgFarve);
    }

    public Ejendom(int koebsVaerdi, String navn, Color bgfarve, Color fgfarve) throws IOException {
        super.titel = navn;
        super.beskrivelse = textController.getTekst("EjendomBeskrivelse");
        super.bgFarve = bgfarve;
        super.fgFarve = fgfarve;
        this.farve = bgfarve;
        this.koebsTilstand = false;
        this.koebsVaerdiInt = koebsVaerdi;
        this.koebsVaerdiString = Integer.toString(koebsVaerdi);
        this.ejer = "";
        this.huslejeInt = koebsVaerdi;
        this.huslejeString = Integer.toString(koebsVaerdi);
        super.underTekst = textController.getTekst("EjendomUnderTekst")+ ": " + this.koebsVaerdiString;
        ejendomsFelt = new GUI_Street(this.titel, super.underTekst, super.beskrivelse, this.koebsVaerdiString, super.bgFarve, super.fgFarve);
    }

    private void koebEjendom(Spiller spiller) {
        this.koebsTilstand = true;
        this.ejer = spiller.getSpillerNavn();
        spiller.spillerKonto.transaktion(-koebsVaerdiInt);
    }
    @Override
    public void landPaaFelt(Spiller spiller, GUI gui) throws IOException {
        if (this.koebsTilstand && this.ejer.equals(spiller.getSpillerNavn())) {
            gui.showMessage(textController.getTekst("EjendomTekstLandetSpillerEjerFelt"));
        } else if (this.koebsTilstand && !this.ejer.equals(spiller.getSpillerNavn())) {
            gui.showMessage(textController.getTekst("EjendomTekstLandetSpillerEjerIkkeFelt"));
            spiller.spillerKonto.transaktion(-huslejeInt);
        } else {
            gui.showMessage(textController.getTekst("EjendomTekstIkkeEjetFelt"));
            koebEjendom(spiller);
        }
    }
    public void landPaaFelt(Spiller spiller, GUI gui, Spiller[] spillerArray, SpillePlade spilleplade) throws IOException {
        if (this.koebsTilstand && this.ejer.equals(spiller.getSpillerNavn())) {
            gui.showMessage(textController.getTekst("EjendomTekstLandetSpillerEjerFelt"));
        } else if (this.koebsTilstand && !this.ejer.equals(spiller.getSpillerNavn())) {
            gui.showMessage(textController.getTekst("EjendomTekstLandetSpillerEjerIkkeFelt"));
            spiller.spillerKonto.transaktion(-huslejeInt);
            for (Spiller spillerSomEjerFelt : spillerArray) {
                if (this.ejer.equals(spillerSomEjerFelt.getSpillerNavn())) {
                    spillerSomEjerFelt.spillerKonto.transaktion(huslejeInt);
                    gui.showMessage(spillerSomEjerFelt.getSpillerNavn() + textController.getTekst("duharfaaetpengeBesked") + " " + huslejeString + "M");
                }
            }
        } else {
            gui.showMessage(textController.getTekst("EjendomTekstIkkeEjetFelt"));
            koebEjendom(spiller);
        }
    }

    @Override
    public void landPaaFelt(Spiller spiller, KortBunke kortbunke, GUI gui) throws IOException {
        if (this.koebsTilstand && this.ejer.equals(spiller.getSpillerNavn())) {
            gui.showMessage(textController.getTekst("EjendomTekstLandetSpillerEjerFelt"));
        } else if (this.koebsTilstand && !this.ejer.equals(spiller.getSpillerNavn())) {
            gui.showMessage(textController.getTekst("EjendomTekstLandetSpillerEjerIkkeFelt"));
            spiller.spillerKonto.transaktion(-huslejeInt);
        } else {
            gui.showMessage(textController.getTekst("EjendomTekstIkkeEjetFelt"));
            koebEjendom(spiller);
        }
    }

    @Override
    public GUI_Field getFelt() {
        return ejendomsFelt;
    }

    @Override
    public String getFeltType() {
        return "EjendomsFelt";
    }
}
