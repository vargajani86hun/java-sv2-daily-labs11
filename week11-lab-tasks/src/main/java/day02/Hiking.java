package day02;

import java.util.List;

public class Hiking {

    public double getPlusElevation(List<Double> heights) {
        double sum = 0;
        for (int i = 1; i < heights.size(); i++) {
            double diff = heights.get(i) - heights.get(i-1);
            sum += diff > 0 ? diff : 0;
        }
        return sum;
    }

}
