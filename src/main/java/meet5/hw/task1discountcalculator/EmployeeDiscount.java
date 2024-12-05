package meet5.hw.task1discountcalculator;

public class EmployeeDiscount implements DiscountPolicy {
    @Override
    public double calculate(double amount) {
        return amount * 0.3;
    }
}
