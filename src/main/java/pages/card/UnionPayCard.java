package pages.card;

import static pages.card.Country.CN;

public class UnionPayCard  extends Card {

    public UnionPayCard() {
        super(PaymentSystem.UNION_PAY);
    }

    protected boolean isCountryValidForThisCard(Country country) {
        if (country == CN)
            return true;
        else
            return false;
    }
}
