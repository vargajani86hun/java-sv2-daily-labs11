package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {
    private int allNumber;
    private int numbers;
    private Random rnd = new Random();

    public Lottery(int allNumber, int numbers) {
        this.allNumber = allNumber;
        this.numbers = numbers;
    }

    public List<Integer> startLottery() {
        List<Integer> winnerNumbers = new ArrayList<>(numbers);
        for (int i = 0; i < numbers; i++) {
            int rndNumber;
            while (winnerNumbers.contains(rndNumber = rnd.nextInt(1, allNumber + 1)));
            winnerNumbers.add(rndNumber);
        }
        return winnerNumbers;
    }
}
