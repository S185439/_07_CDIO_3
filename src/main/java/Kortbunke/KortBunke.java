package Kortbunke;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import gui_main.GUI;

public class KortBunke {
    private Kort[] kort;
    Kort kort1 = new Kort1();
    Kort kort2 = new Kort2();
    Kort kort3 = new Kort3();
    Kort kort4 = new Kort4();
    Kort kort5 = new Kort5();
    Kort kort6 = new Kort6();
    Kort kort7 = new Kort7();
    Kort kort8 = new Kort8();
    Kort kort9 = new Kort9();
    Kort kort10 = new Kort10();
    Kort kort11 = new Kort11();
    Kort kort12 = new Kort12();
    Kort kort13 = new Kort13();
    Kort kort14 = new Kort14();
    Kort kort15 = new Kort15();
    Kort kort16 = new Kort16();
    Kort kort17 = new Kort17();
    Kort kort18 = new Kort18();
    Kort kort19 = new Kort19();
    Kort kort20 = new Kort20();

    public KortBunke() throws IOException {
        kort = new Kort[20];
        kort[0] = kort1;
        kort[1] = kort2;
        kort[2] = kort3;
        kort[3] = kort4;
        kort[4] = kort5;
        kort[5] = kort6;
        kort[6] = kort7;
        kort[7] = kort8;
        kort[8] = kort9;
        kort[9] = kort10;
        kort[10] = kort11;
        kort[11] = kort12;
        kort[12] = kort13;
        kort[13] = kort14;
        kort[14] = kort15;
        kort[15] = kort16;
        kort[16] = kort17;
        kort[17] = kort18;
        kort[18] = kort19;
        kort[19] = kort20;

        blandKort();
    }

    public Kort traekKort(){
// metode der trækker og returnerer øverste kort i bunken og herefter lægger det til sidst i bunken
        ArrayList<Kort> kortList1 = new ArrayList<>(List.of(kort));
        kortList1.add(19, kortList1.get(0));
        kortList1.remove(0);
        kortList1.toArray(kort);
        return kort[19];
    }
    public void blandKort(){
// metode der blander kortbunken
        List<Kort> kortList = Arrays.asList(kort);
        Collections.shuffle(kortList);
        kortList.toArray(kort);
    }
}
