import TextController.TextController;
import com.sun.java.accessibility.util.GUIInitializedListener;
import gui_fields.*;
import gui_main.GUI;

import java.awt.*;
import java.io.IOException;

public class Spil {
    public static void main(String[] args) throws IOException {

        TextController textController = new TextController();
        textController.getTekst("EjendomTekstIkkeEjetFelt");
        GUI_Field[] fields = new GUI_Field[] {new GUI_Start(), new GUI_Street()};

        GUI gui = new GUI(fields);
    }

}
