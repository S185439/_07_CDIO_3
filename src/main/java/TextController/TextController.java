package TextController;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextController {
    public TextController() {

    }
    public String getTekst(String navnPaaTekst) throws IOException {
        String file ="src/main/java/tekstFil.txt";
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String currentLine = reader.readLine();
        while (currentLine != null){
            if (currentLine.equals(navnPaaTekst)) {
                currentLine = reader.readLine();
                return currentLine;
            }
            currentLine = reader.readLine();
        }
        reader.close();
        return null;
    }

}
