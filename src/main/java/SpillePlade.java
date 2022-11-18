
import TextController.TextController;
import gui_fields.*;
import Felter.*;
import java.awt.*;
import java.io.IOException;

public class SpillePlade {
     TextController textController = new TextController();
     Faengsel faengsel = new Faengsel();
     Ejendom burgerbaren = new Ejendom(1, textController.getTekst("BurgerBaren"), Color.MAGENTA);
     Ejendom pizzeriaet = new Ejendom(1,textController.getTekst("Pizzeriaet"), Color.MAGENTA);
     Ejendom slikbutikken = new Ejendom(1,textController.getTekst("slikbutikken"), Color.cyan);
     Ejendom iskiosken = new Ejendom(1,textController.getTekst("iskiosken"), Color.cyan);
     Ejendom museet = new Ejendom(2,textController.getTekst("Museet"), Color.pink);
     Ejendom biblioteket = new Ejendom(2,textController.getTekst("Biblioteket"), Color.pink);
     Ejendom skateparken = new Ejendom(2,textController.getTekst("Skateparken"), Color.orange);
     Ejendom swimmingpoolen = new Ejendom(2,textController.getTekst("Swimminpoolen"), Color.orange);
     Ejendom spillehallen = new Ejendom(3,textController.getTekst("Spillehallen"), Color.red);
     Ejendom biografen = new Ejendom(3,textController.getTekst("Biografen"), Color.red);
     Ejendom legetoejsbutikken = new Ejendom(3,textController.getTekst("Legetøjsbutikken"), Color.yellow);
     Ejendom dyrehandlen = new Ejendom(3,textController.getTekst("Dyrehandlen"), Color.yellow);
     Ejendom bowlinghallen = new Ejendom(4,textController.getTekst("Bowlinghallen"), Color.green);
     Ejendom zoo = new Ejendom(4,textController.getTekst("ZOO"), Color.green);
     Ejendom vandlandet = new Ejendom(4,textController.getTekst("Vandlandet"), Color.blue);
     Ejendom strandpromenaden = new Ejendom(4,textController.getTekst("Strandpromenaden"), Color.blue);
     GaaIFaengsel gaaIFaengsel = new GaaIFaengsel();
     Parkering parkering = new Parkering();
     ChanceFelt chanceFelt = new ChanceFelt();
     Start start = new Start();
     /** Opretter array med 24 felter til spillepladen */
     GUI_Field[] felter = new GUI_Field[24];

     public SpillePlade() throws IOException {
          felter[0] = start.getFelt();
          felter[1] = burgerbaren.getFelt();
          felter[2] = pizzeriaet.getFelt();
          felter[3] = chanceFelt.getFelt();
          felter[4] = slikbutikken.getFelt();
          felter[5] = iskiosken.getFelt();
          felter[6] = faengsel.getFelt();
          felter[7] = museet.getFelt();
          felter[8] = biblioteket.getFelt();
          felter[9] = chanceFelt.getFelt();
          felter[10] = skateparken.getFelt();
          felter[11] = swimmingpoolen.getFelt();
          felter[12] = parkering.getFelt();
          felter[13] = spillehallen.getFelt();
          felter[14] = biografen.getFelt();
          felter[15] = chanceFelt.getFelt();
          felter[16] = legetoejsbutikken.getFelt();
          felter[17] = dyrehandlen.getFelt();
          felter[18] = gaaIFaengsel.getFelt();
          felter[19] = bowlinghallen.getFelt();
          felter[20] = zoo.getFelt();
          felter[21] = chanceFelt.getFelt();
          felter[22] = vandlandet.getFelt();
          felter[23] = strandpromenaden.getFelt();
     }


     /**
      * Finder feltets placering og returner feltet der er på den placering
      */
     public GUI_Field getFeltPlacering (int placering) {
        return felter [placering - 1];
     }
}

