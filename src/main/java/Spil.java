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
        GUI gui = new GUI(felter);
        SpillerController spillerController = new SpillerController(gui.getUserInteger(textController.getTekst("startspilspillerindtast"),2,4),gui, spillePlade);
        raflebaeger.slaaAlleTerninger(gui);
    }

}
