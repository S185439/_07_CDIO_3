package Felter;
import TextController.TextController;
import gui_fields.GUI_Field;
import gui_main.GUI;

import java.awt.*;
import java.io.IOException;

public abstract class Felt {

    // Dette er abstract felt til alle felterne på boardet
    String titel;
    String underTekst;
    String beskrivelse;
    Color fgFarve;
    Color bgFarve;
    String feltBesked;

    TextController textController = new TextController();
    public abstract <Spiller> void landPaaFelt(Spiller spiller, GUI gui) throws IOException;

    /**
     *
     * @param spiller, det er et spiller object oprettet med Spiller.java
     * @param kortbunke, det er et kortbunke object oprette med Kortbunke.java
     * @param gui, det er et gui object, og skal være det gui object som bliver brugt til at oprette spillet,
     *             da metoden showMessage bliver brugt i forbindelse med den
     */
    public abstract <Spiller, Kortbunke> void landPaaFelt(Spiller spiller, Kortbunke kortbunke, GUI gui) throws IOException;
    public abstract GUI_Field getFelt();

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getUnderTekst() {
        return underTekst;
    }

    public void setUnderTekst(String underTekst) {
        this.underTekst = underTekst;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }

    public Color getBgFarve() {
        return bgFarve;
    }

    public void setBgFarve(Color bgFarve) {
        this.bgFarve = bgFarve;
    }

    public Color getFgFarve() {
        return fgFarve;
    }

    public void setFgFarve(Color fgFarve) {
        this.fgFarve = fgFarve;
    }
}
