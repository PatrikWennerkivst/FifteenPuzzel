import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Randomize {

    //en metod för att randomizera knapparna 1-15
    public static void randomizeBoard (ArrayList<JButton> buttons) {
        ArrayList<String> numbers = new ArrayList<>(); // skapar en lista för nr 1-15
        for (int i = 1; i <= 15; i++) {  //for loop för att gå fr 1-15
            numbers.add(String.valueOf(i)); // värdet av i omvandlar d till en sträng
        }

        //använder collections för enklaste sättet att slumpa ordningen av numrerna
        Collections.shuffle(numbers);

    }
}
