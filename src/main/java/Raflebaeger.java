import TextController.TextController;
import gui_main.GUI;

import java.io.IOException;

public class Raflebaeger {
    TextController textController = new TextController();
    private Terning terning;
    private int sumAfTerninger;

    /**
     * Constructor til et RafleBaeger, opretter 1 terninge object, og saetter sumAfTerninger til 0
     */
    public Raflebaeger() {
        this.terning = new Terning();
        this.sumAfTerninger = 0;
    }

    /**
     * Bruger slaaTerning på terningen, og saetter sumAfTerninge til terningens oejenVaerdi
     * @return Den nye sumAfTerninger efter terninger er slaaet
     */
    public int slaaAlleTerninger(GUI gui) throws IOException {
        terning.slaaTerning();
        this.sumAfTerninger = terning.getOejenVaerdi();
        gui.showMessage(textController.getTekst("slaaTerning"));
        gui.setDie(sumAfTerninger);
        return sumAfTerninger;
    }

    /**
     * Tjekker om sumAfTerninger er lig 0, giver fejlbesked, da man ikke kan have en sum af 0
     * @return Hvis ikke sumAfTerninger lig 0, returnere SumAfTerninger
     */
    public int getSumAfTerninger() {
        if (sumAfTerninger == 0) {
            System.out.println("Terningen er ikke blevet slået, der er ikke nogen sum vaerdi");
            return sumAfTerninger;
        } else {
            return sumAfTerninger;
        }
    }
}