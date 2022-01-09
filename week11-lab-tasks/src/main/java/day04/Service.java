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
        if (getBoughtAt() == null) {
            return LocalDate.now().plusYears(1);
        }
        return getBoughtAt().plusYears(1);
    }

    @Override
    public Merchandise getBoughtCopy() {
        Service bought = new Service(this);
        bought.setBoughtAt(LocalDate.now());
        return bought;
    }
}
