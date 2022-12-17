import javax.swing.*;
import java.util.Arrays;

public class OefArray {

    private int[] num_array = new int[5];

    @Override
    public String toString() {
        return "OefArray{" +
                "num_array=" + Arrays.toString(num_array) +
                '}';
    }

    public int inVullen() {
        int som = 0;
        for (int i = 0; i < 5; i++) {
            num_array[i] = Integer.parseInt(JOptionPane.showInputDialog("Geef een getal in deelbaar door 10"));
            if (((num_array[i] % 10) != 0) || num_array[i] == 0) {
                i--;
            } else {
                som += num_array[i];
            }
        }
        return som;
    }

    public boolean isTien() {
        boolean b = false;
        if (num_array[0] == 10 || num_array[4] == 10){
            b = true;}
        return b;
    }
}
