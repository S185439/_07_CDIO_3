import java.util.Scanner;

public class Kort2 extends Kort{
    private String kortTekst;
    Scanner input = new Scanner(System.in);
    @Override
    protected void kortFunktion(Spiller spiller) {
        System.out.println(kortTekst);
        int felterFrem = input.nextInt();
        Spiller.rykSpiller(felterFrem);
    }
}
