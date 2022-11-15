public class Kort1 extends  Kort {
    private String kortTekst;

    @Override
    protected void kortFunktion(Spiller spiller) {
        System.out.println(kortTekst);
        spiller.setPlacering(0);

    }
}
