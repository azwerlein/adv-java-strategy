package discount;

public enum Discount {
    NONE(0.0),
    SALE(0.1),
    DISCOUNT(0.5),
    LIQUIDATION(0.75);

    private final double discount;

    Discount(double discount) {
        this.discount = discount;
    }

    public double applyDiscount(double billAmount) {
        return billAmount - (billAmount * discount);
    }
}
