import java.util.Scanner;

public class Kort4 extends Kort{
    private String kortTekst;
    Scanner input = new Scanner(System.in);
    @Override
    protected void kortFunktion(Spiller spiller) {
        System.out.println(kortTekst);
        int valg = input.nextInt();
        if (valg == 1) {
            spiller.rykFelter(1);
        }
    }
}
