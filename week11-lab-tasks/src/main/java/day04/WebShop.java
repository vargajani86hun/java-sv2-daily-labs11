package day04;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class WebShop {
    private List<Merchandise> stock = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void register(String userName) {
        users.add(new User(userName));
    }

    public void buy(String userName, String productName) {
        findUserByName(userName).buy(findMerchandiseByName(productName));
    }

    public LocalDate getExpireDate(String productName) {
        Merchandise searched = findMerchandiseByName(productName);
        return searched.getExpireAt();
    }

    private User findUserByName(String userName) {
        for (User actual : users) {
            if (actual.getUserName().equals(userName)) {
                return actual;
            }
        }
        throw new IllegalArgumentException("Unregistered user name " + userName);
    }

    private Merchandise findMerchandiseByName(String name) {
        for (Merchandise actual : stock) {
            if (actual.getName().equals(name)) {
                return actual;
            }
        }
        throw new IllegalArgumentException("Cannot found " + name + " product or service");
    }
}
