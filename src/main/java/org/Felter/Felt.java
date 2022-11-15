package org.Felter;
public abstract class Felt {
    private int placering;

    public int getPlacering() {
        return placering;
    }

    public void setPlacering(int placering) {
        this.placering = placering;
    }

    public abstract <Spiller> void landPaaFelt(Spiller spiller);
    public abstract <Spiller, Kortbunke> void landPaaFelt(Spiller spiller, Kortbunke kortbunke);
}
