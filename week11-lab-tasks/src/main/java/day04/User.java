package day04;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private int balance;
    private List<Merchandise> boughtMerchandises = new ArrayList<>();

    public User(String userName) {
        this.userName = userName;
    }

    public void buy(Merchandise merchandise) {
        hasEnoughBalanceToBuy(merchandise);
        if (merchandise instanceof Service) {
            buyService((Service) merchandise.getBoughtCopy());
        }
        else {
            buyProduct((Product) merchandise.getBoughtCopy());
        }
    }

    private void buyService(Service service) {
        boughtMerchandises.add(service);
        balance -= service.getPrice();
    }

    private void buyProduct(Product product) {
        if (balance > product.getPrice() * 3) {
            product.buyExtendedWarranty();
            boughtMerchandises.add(product);
            balance -= product.getPrice() * 1.1;
        }
        else {
            boughtMerchandises.add(product);
            balance -= product.getPrice();
        }
    }

    public void payIn(int amount) {
        balance += amount;
    }

    public String getUserName() {
        return userName;
    }

    private boolean hasEnoughBalanceToBuy(Merchandise merchandise) {
        if (balance < merchandise.getPrice()) {
            throw new IllegalStateException("Low balance! Can not buy " + merchandise.getName());
        }
        else {
            return true;
        }
    }
}
