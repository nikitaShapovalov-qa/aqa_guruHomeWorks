package pages.card;

public abstract class Card {

    protected String cardHolder;
    protected int balance;
    protected String cardNumber;
    protected PaymentSystem paymentSystem;

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance < 0)
            return;
        else {
            System.out.println("Added balance: " + balance);
            this.balance = balance;
        }
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setPaymentSystem(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public Card(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public PaymentSystem getPaymentSystem() {
        return paymentSystem;
    }

    protected boolean isBalanceMoreOrEqualThan(int amount) {
        return balance >= amount;
    }

    public void payInCountry(Country country, int amount) {
        if (isCountryValidForThisCard(country) && isBalanceMoreOrEqualThan(amount)) {
            balance = balance - amount;
            System.out.println("Accepted!");
        }
        else {
            System.out.println("Cancelled! Wrong country!");
        }
    }

    protected abstract boolean isCountryValidForThisCard(Country country);

    }
