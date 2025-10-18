package pages;

import pages.card.*;

import java.util.ArrayList;
import java.util.List;

import static pages.card.Country.RU;
import static pages.card.Country.CN;
import static pages.card.Country.US;

public class Main {

    public static void main(String [] args) {
        test(new UnionPayCard());
        List<String> aList= new ArrayList<>();
    }

    public static void test(Card card) {
        card.setBalance(100);
        card.payInCountry(RU, 75);
        System.out.println("Current balance: " + card.getBalance());
    }
}
