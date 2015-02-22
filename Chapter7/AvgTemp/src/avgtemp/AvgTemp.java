package avgtemp;

import java.util.Scanner;

public class AvgTemp {

    public static void main(String[] args) {
        int i;
        float[] temp = new float[4];
        float sum = 0.0f, avgTemp;
        Scanner scan = new Scanner(System.in);
        for (i = 0; i < 4; i++) {
            System.out.print("temp[" + (i + 1) + "] = ");
            temp[i] = scan.nextFloat();
            sum = sum + temp[i];
        }
        avgTemp = sum / 4;
        System.out.printf("Aversge temperature = %.2f\n", avgTemp);
    }

}
