package ArrayClass;

import java.util.Arrays;

public class MaxMinAvg {

    public int getMax(int[] s) {
        Arrays.sort(s);
        int max = s[s.length - 1];
        return max;
    }

    public int getMin(int[] s) {
        Arrays.sort(s);
        int min = s[0];
        return min;
    }

    public float getAvg(int[] s) {
        float sum = 0.0f, avg;
        for (int i = 0; i < s.length; i++) {
            sum = sum + s[i];
        }
        avg = sum / s.length;
        return avg;
    }
}
