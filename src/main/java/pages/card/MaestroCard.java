package pages.card;

import static pages.card.Country.RU;

public class MaestroCard extends Card implements ICard{

    public MaestroCard() {
        super(PaymentSystem.MAESTRO);
    }

    @Override
    protected boolean isCountryValidForThisCard(Country country) {
        return RU == country;
    }
}
