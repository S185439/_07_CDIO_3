
import TextController.TextController;
import gui_fields.*;
import Felter.*;
import java.awt.*;
import java.io.IOException;

public class SpillePlade {
     TextController textController = new TextController();
     Faengsel faengsel = new Faengsel();
     Ejendom burgerbaren = new Ejendom(1, textController.getTekst("BurgerBarenFeltNavn"), Color.MAGENTA,Color.WHITE);
     Ejendom pizzeriaet = new Ejendom(1,textController.getTekst("PizzeriaetFeltNavn"), Color.MAGENTA,Color.WHITE);
     Ejendom slikbutikken = new Ejendom(1,textController.getTekst("slikbutikkenFeltNavn"), Color.cyan);
     Ejendom iskiosken = new Ejendom(1,textController.getTekst("iskioskenFeltNavn"), Color.cyan);
     Ejendom museet = new Ejendom(2,textController.getTekst("MuseetFeltNavn"), Color.pink);
     Ejendom biblioteket = new Ejendom(2,textController.getTekst("BiblioteketFeltNavn"), Color.pink);
     Ejendom skateparken = new Ejendom(2,textController.getTekst("SkateparkenFeltNavn"), Color.orange);
     Ejendom swimmingpoolen = new Ejendom(2,textController.getTekst("SwimminpoolenFeltNavn"), Color.orange);
     Ejendom spillehallen = new Ejendom(3,textController.getTekst("SpillehallenFeltNavn"), Color.red, Color.WHITE);
     Ejendom biografen = new Ejendom(3,textController.getTekst("BiografenFeltNavn"), Color.red, Color.WHITE);
     Ejendom legetoejsbutikken = new Ejendom(3,textController.getTekst("LegetøjsbutikkenFeltNavn"), Color.yellow);
     Ejendom dyrehandlen = new Ejendom(3,textController.getTekst("DyrehandlenFeltNavn"), Color.yellow);
     Ejendom bowlinghallen = new Ejendom(4,textController.getTekst("BowlinghallenFeltNavn"), Color.green);
     Ejendom zoo = new Ejendom(4,textController.getTekst("ZOOFeltNavn"), Color.green);
     Ejendom vandlandet = new Ejendom(4,textController.getTekst("VandlandetFeltNavn"), Color.blue, Color.WHITE);
     Ejendom strandpromenaden = new Ejendom(4,textController.getTekst("StrandpromenadenFeltNavn"), Color.blue, Color.WHITE);
     Parkering parkering = new Parkering();
     GaaIFaengsel gaaIFaengsel = new GaaIFaengsel();
     ChanceFelt chanceFelt1 = new ChanceFelt();
     ChanceFelt chanceFelt2 = new ChanceFelt();
     ChanceFelt chanceFelt3 = new ChanceFelt();
     ChanceFelt chanceFelt4 = new ChanceFelt();
     Start start = new Start();
     /** Opretter array med 24 felter til spillepladen */
     GUI_Field[] felter = new GUI_Field[24];

     public SpillePlade() throws IOException {
          felter[0] = start.getFelt();
         felter[1] = burgerbaren.getFelt();
          felter[2] = pizzeriaet.getFelt();
          felter[3] = chanceFelt1.getFelt();
          felter[4] = slikbutikken.getFelt();
          felter[5] = iskiosken.getFelt();
          felter[6] = faengsel.getFelt();
          felter[7] = museet.getFelt();
          felter[8] = biblioteket.getFelt();
          felter[9] = chanceFelt2.getFelt();
          felter[10] = skateparken.getFelt();
          felter[11] = swimmingpoolen.getFelt();
          felter[12] = parkering.getFelt();
          felter[13] = spillehallen.getFelt();
          felter[14] = biografen.getFelt();
          felter[15] = chanceFelt3.getFelt();
          felter[16] = legetoejsbutikken.getFelt();
          felter[17] = dyrehandlen.getFelt();
          felter[18] = gaaIFaengsel.getFelt();
          felter[19] = bowlinghallen.getFelt();
          felter[20] = zoo.getFelt();
          felter[21] = chanceFelt4.getFelt();
          felter[22] = vandlandet.getFelt();
          felter[23] = strandpromenaden.getFelt();
     }


     /**
      * Finder feltets placering og returner feltet der er på den placering
      */
     public GUI_Field getFeltPlacering (int placering) {
        return felter [placering - 1];
     }
     public GUI_Field[] getFelter() {return felter;}
}

