package Felter;
import gui_fields.*;

import java.io.IOException;

public class SpillePlade {
     /** Opretter faengsel */
     Faengsel faengsel = new Faengsel();
     Ejendom ejendom = new Ejendom();
     GaaIFaengsel gaaIFaengsel = new GaaIFaengsel();
     Parkering parkering = new Parkering();
     ChanceFelt chanceFelt = new ChanceFelt();
     Start start = new Start();
     /** Opretter array med 24 felter til spillepladen */
     GUI_Field[] felter = new GUI_Field[24];

     public GUI_Field[] laverSpillePlade() {
          felter[0] = start.getFelt();
          felter[1] = ejendom.getFelt();
          felter[2] = ejendom.getFelt();
          felter[3] = chanceFelt.getFelt();
          felter[4] = ejendom.getFelt();
          felter[5] = ejendom.getFelt();
          felter[6] = faengsel.getFelt();
          felter[7] = ejendom.getFelt();
          felter[8] = ejendom.getFelt();
          felter[9] = chanceFelt.getFelt();
          felter[10] = ejendom.getFelt();
          felter[11] = ejendom.getFelt();
          felter[12] = parkering.getFelt();
          felter[13] = ejendom.getFelt();
          felter[14] = ejendom.getFelt();
          felter[15] = chanceFelt.getFelt();
          felter[16] = ejendom.getFelt();
          felter[17] = ejendom.getFelt();
          felter[18] = gaaIFaengsel.getFelt();
          felter[19] = ejendom.getFelt();
          felter[20] = ejendom.getFelt();
          felter[21] = chanceFelt.getFelt();
          felter[22] = ejendom.getFelt();
          felter[23] = ejendom.getFelt();
          return felter;
          }

     /**
      * Finder feltets placering og returner feltet der er på den placering
      */
     public GUI_Field getFeltPlacering (int placering) {
        return felter [placering - 1];
     }
}

