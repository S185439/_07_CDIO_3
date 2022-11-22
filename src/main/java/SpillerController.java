import Spiller.Spiller;
import TextController.TextController;
import gui_fields.GUI_Player;
import gui_main.GUI;

import java.awt.*;
import java.io.IOException;

public class SpillerController {
    TextController textController = new TextController();
    Spiller spiller1;
    Spiller spiller2;
    Spiller spiller3;
    Spiller spiller4;
    GUI_Player[] spillerArray;

    SpillerController(int spillermaengde, GUI gui, SpillePlade spillePlade) throws IOException {
        switch (spillermaengde) {
            case 2 -> {

                String spiller1navn = gui.getUserString(textController.getTekst("spillernavn1"));
                spiller1 = new Spiller(spiller1navn, 20, Color.RED);
                String spiller2navn = gui.getUserString(textController.getTekst("spillernavn2"));
                spiller2 = new Spiller(spiller2navn, 20, Color.BLUE);
                gui.addPlayer(spiller1.getGUIspiller());
                gui.addPlayer(spiller2.getGUIspiller());
                spillerArray = new GUI_Player[]{spiller1.getGUIspiller(),spiller2.getGUIspiller()};
                spillePlade.setSpillerPaaFelt(spiller1.getGUIspiller(), 0);
                spillePlade.setSpillerPaaFelt(spiller2.getGUIspiller(), 0);
            }
            case 3 -> {

                String spiller1navn = gui.getUserString(textController.getTekst("spillernavn1"));
                spiller1 = new Spiller(spiller1navn, 20, Color.RED);
                String spiller2navn = gui.getUserString(textController.getTekst("spillernavn2"));
                spiller2 = new Spiller(spiller2navn, 20, Color.BLUE);
                String spiller3navn = gui.getUserString(textController.getTekst("spillernavn3"));
                spiller3 = new Spiller(spiller3navn, 20, Color.GREEN);
                gui.addPlayer(spiller1.getGUIspiller());
                gui.addPlayer(spiller2.getGUIspiller());
                gui.addPlayer(spiller3.getGUIspiller());
                spillerArray = new GUI_Player[]{spiller1.getGUIspiller(),spiller2.getGUIspiller(),spiller3.getGUIspiller()};
                spillePlade.setSpillerPaaFelt(spiller1.getGUIspiller(), 0);
                spillePlade.setSpillerPaaFelt(spiller2.getGUIspiller(), 0);
                spillePlade.setSpillerPaaFelt(spiller3.getGUIspiller(), 0);
            }
            case 4 -> {

                String spiller1navn = gui.getUserString(textController.getTekst("spillernavn1"));
                spiller1 = new Spiller(spiller1navn, 20, Color.RED);
                String spiller2navn = gui.getUserString(textController.getTekst("spillernavn2"));
                spiller2 = new Spiller(spiller2navn, 20, Color.BLUE);
                String spiller3navn = gui.getUserString(textController.getTekst("spillernavn3"));
                spiller3 = new Spiller(spiller3navn, 20, Color.GREEN);
                String spiller4navn = gui.getUserString(textController.getTekst("spillernavn4"));
                spiller4 = new Spiller(spiller4navn, 20, Color.MAGENTA);
                gui.addPlayer(spiller1.getGUIspiller());
                gui.addPlayer(spiller2.getGUIspiller());
                gui.addPlayer(spiller3.getGUIspiller());
                gui.addPlayer(spiller4.getGUIspiller());
                spillerArray = new GUI_Player[]{spiller1.getGUIspiller(),spiller2.getGUIspiller(),spiller3.getGUIspiller(),spiller4.getGUIspiller()};
                spillePlade.setSpillerPaaFelt(spiller1.getGUIspiller(), 0);
                spillePlade.setSpillerPaaFelt(spiller2.getGUIspiller(), 0);
                spillePlade.setSpillerPaaFelt(spiller3.getGUIspiller(), 0);
                spillePlade.setSpillerPaaFelt(spiller4.getGUIspiller(), 0);
            }
        }
    }

}
