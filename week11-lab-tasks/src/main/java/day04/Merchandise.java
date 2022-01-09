package day04;

import java.time.LocalDate;

public abstract class Merchandise {
    private String name;
    private int price;
    private LocalDate boughtAt;

    protected Merchandise(String name, int price) {
        this.name = name;
        this.price = price;
    }

    protected Merchandise(Merchandise toCopy) {
        this(toCopy.name, toCopy.price);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public LocalDate getBoughtAt() {
        return boughtAt;
    }

    public void setBoughtAt(LocalDate boughtAt) {
        this.boughtAt = boughtAt;
    }

    public abstract LocalDate getExpireAt();

    public abstract Merchandise getBoughtCopy();
}
