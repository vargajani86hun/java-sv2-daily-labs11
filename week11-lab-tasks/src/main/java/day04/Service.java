package day04;

import java.time.LocalDate;

public class Service extends Merchandise {
    public Service(String name, int price) {
        super(name, price);
    }

    public Service(Merchandise toCopy) {
        super(toCopy);
    }

    @Override
    public LocalDate getExpireAt() {
        return getBoughtAt().plusYears(1);
    }
}
