package pages.card;

import static pages.card.Country.RU;

public class MirCard  extends Card{

    public MirCard() {
        super(PaymentSystem.MIR);
    }

    protected boolean isCountryValidForThisCard(Country country) {
        if (country == RU)
            return true;
        else
            return false;
    }
}
