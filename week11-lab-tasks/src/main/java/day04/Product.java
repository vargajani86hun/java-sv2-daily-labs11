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
        if (getBoughtAt() == null) {
            return LocalDate.now().plusMonths(3);
        }
        if(extendedWarranty) {
            return getBoughtAt().plusYears(3);
        }
        else {
            return getBoughtAt().plusMonths(3);
        }
    }

    @Override
    public Merchandise getBoughtCopy() {
        Product bought = new Product(this);
        bought.setBoughtAt(LocalDate.now());
        return bought;
    }
}
