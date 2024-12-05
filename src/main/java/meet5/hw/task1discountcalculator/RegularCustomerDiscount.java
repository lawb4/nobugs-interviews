package meet5.hw.task1discountcalculator;

public class RegularCustomerDiscount implements DiscountPolicy {
    @Override
    public double calculate(double amount) {
        return amount * 0.05;
    }
}
