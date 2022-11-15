import java.util.Scanner;

public class Kort3 extends Kort {
    private String kortTekst;
    Scanner input = new Scanner(System.in);

    @Override
    protected void kortFunktion(Spiller spiller) {
        System.out.println(kortTekst);
        int orangeFelt = input.nextInt();
        spiller.setPlacering(orangeFelt);
    }
}
