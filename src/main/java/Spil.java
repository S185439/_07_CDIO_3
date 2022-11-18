import TextController.TextController;
import com.sun.java.accessibility.util.GUIInitializedListener;
import gui_fields.*;
import gui_main.GUI;

import java.awt.*;
import java.io.IOException;

public class Spil {
    public static void main(String[] args) throws IOException {

        SpillePlade spillePlade = new SpillePlade();

        GUI gui = new GUI(spillePlade.getFelter());
    }

}
