package meet5.hw.task1discountcalculator;

public class NoDiscount implements DiscountPolicy {
    @Override
    public double calculate(double amount) {
        return 0;
    }
}
