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
        if (merchandise instanceof Service service) {
            buyService(service);
        }
        else {
            buyProduct((Product) merchandise);
        }
    }

    private void buyService(Service service) {
        boughtMerchandises.add(new Service(service));
        balance -= service.getPrice();
    }

    private void buyProduct(Product product) {
        if (balance > product.getPrice() * 3) {
            Product extended = new Product(product);
            extended.buyExtendedWarranty();
            boughtMerchandises.add(extended);
            balance -= extended.getPrice() * 110 / 100;
        }
        else {
            boughtMerchandises.add(new Product(product));
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
