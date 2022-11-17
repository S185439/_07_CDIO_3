package Kortbunke;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KortBunke {
    private final Kort[] kort;
    public KortBunke() {
        kort = new Kort[20];
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
