import Kortbunke.Kort;
import Kortbunke.KortBunke;
import SpillePlade.SpillePlade;
import Spiller.Spiller;
import TextController.TextController;
import gui_fields.*;
import gui_main.GUI;

import java.io.IOException;

public class Spil {
    public static void main(String[] args) throws IOException {

        SpillePlade spillePlade = new SpillePlade();
        TextController textController = new TextController();
        GUI_Field[] felter = spillePlade.getFelter();
        Raflebaeger raflebaeger = new Raflebaeger();
        KortBunke kortBunke = new KortBunke();
        GUI gui = new GUI(felter);
        SpillerController spillerController = new SpillerController(gui.getUserInteger(textController.getTekst("startspilspillerindtast"),2,4),gui, spillePlade);
        Spiller[] spillerArray = spillerController.getSpillerArray();
        int hvisTur = 0;

        while(true) {
            //opdattere begge spiller nuværende mængde penge i guien
            for (Spiller i : spillerArray) {
                i.getGUIspiller().setBalance(i.spillerKonto.getPenge());
            }
            gui.showMessage(spillerArray[hvisTur].getSpillerNavn() + textController.getTekst("spillerturtekst"));

            int spillersForrigePlacering = spillerArray[hvisTur].getPlacering();
            //slår terning og rykker spiller til felt
            int terningSlag = raflebaeger.slaaAlleTerninger(gui);
            spillePlade.rykSpillerTilFelt(spillerArray[hvisTur], terningSlag);
            //tjekker om spiller er passeret start og hvis true giver 2M
            if (spillersForrigePlacering > spillerArray[hvisTur].getPlacering()) {
                gui.showMessage(textController.getTekst("overstart"));
                spillerArray[hvisTur].spillerKonto.transaktion(2);
            }

            //tjek felt og bruger rigtige landpaafeltfunktion ud fra dette felt
            if (spillePlade.getFeltPlacering(spillerArray[hvisTur].getPlacering()).getFeltType().equals("EjendomsFelt")) {
                spillePlade.getFeltPlacering(spillerArray[hvisTur].getPlacering()).landPaaFelt(spillerArray[hvisTur], gui, spillerArray, spillePlade);
            } else if (spillePlade.getFeltPlacering(spillerArray[hvisTur].getPlacering()).getFeltType().equals("ChanceFelt")) {
                spillePlade.getFeltPlacering(spillerArray[hvisTur].getPlacering()).landPaaFelt(spillerArray[hvisTur], kortBunke, gui);
            } else if (spillePlade.getFeltPlacering(spillerArray[hvisTur].getPlacering()).getFeltType().equals("GaaIFaengselFelt")) {
                spillePlade.getFeltPlacering(spillerArray[hvisTur].getPlacering()).landPaaFelt(spillerArray[hvisTur], gui);
                spillePlade.setSpillerPaaFelt(spillerArray[hvisTur], 6);
            } else {
                spillePlade.getFeltPlacering(spillerArray[hvisTur].getPlacering()).landPaaFelt(spillerArray[hvisTur], gui);
            }

            //opdattere begge spiller nuværende mængde penge i guien
            for (Spiller i : spillerArray) {
                i.getGUIspiller().setBalance(i.spillerKonto.getPenge());
            }




            hvisTur++;
            if (hvisTur == spillerArray.length) {
                hvisTur = 0;
            }
        }

    }

}
