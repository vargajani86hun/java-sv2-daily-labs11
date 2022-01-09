package day04;

import java.time.LocalDate;

public class Product extends Merchandise {
    private boolean extendedWarranty;

    public Product(String name, int price) {
        super(name, price);
    }

    public Product(Merchandise toCopy) {
        super(toCopy);
    }

    public void buyExtendedWarranty() {
        this.extendedWarranty = true;
    }

    public boolean hasExtendedWarranty() {
        return extendedWarranty;
    }

    @Override
    public LocalDate getExpireAt() {
        if(extendedWarranty) {
            return getBoughtAt().plusYears(3);
        }
        else {
            return getBoughtAt().plusMonths(3);
        }
    }
}
