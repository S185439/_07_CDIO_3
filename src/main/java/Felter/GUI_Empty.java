package Felter;

import gui_fields.GUI_Board;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;

import javax.swing.border.Border;
import java.awt.*;

public class GUI_Empty extends GUI_Field {
    public GUI_Empty() {
        this(GUI_Board.BASECOLOR, Color.BLACK, "", "", "");
    }

    public GUI_Empty(Color bgColor, Color fgColor, String title, String subText, String description) {
        super(bgColor, fgColor, title, subText, description, null);
    }

    protected void displayOnCenter(GUI_Player[] playerList) {
    }

    public String toString() {
        return "GUI_Empty [bgColor=" + this.bgColor + ", fgColor=" + this.fgColor + ", title=" + this.title + ", subText=" + this.subText + ", description=" + this.description + "]";
    }
}
