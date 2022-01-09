package day05;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    @Test
    void testFiveLottery() {
        Lottery fiveLottery = new Lottery(90, 5);
        List<Integer> winners = fiveLottery.startLottery();
        boolean different = true;
        for (int i = 0; i < winners.size() - 1; i++) {
            for (int j = i + 1; j < winners.size(); j++) {
                different = !winners.get(i).equals(winners.get(j));
            }
        }
        assertTrue(different);
    }

    @Test
    void testSixLottery() {
        Lottery sixLottery = new Lottery(45, 6);
        List<Integer> winners = sixLottery.startLottery();

        for (int i = 0; i < winners.size() - 1; i++) {
            assertFalse(winners.subList(i+1, winners.size()).contains(winners.get(i)));
        }

    }

    @Test
    void testSkandinavLottery() {
        Lottery skandinavLottery = new Lottery(35, 7);
        List<Integer> winners = skandinavLottery.startLottery();

        for (int i = 0; i < winners.size() - 1; i++) {
            assertFalse(winners.subList(i+1, winners.size()).contains(winners.get(i)));
        }
    }
}