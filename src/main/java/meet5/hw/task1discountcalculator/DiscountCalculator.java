package meet5.hw.task1discountcalculator;

import java.util.HashMap;
import java.util.Map;

/*Задание: подумать над улучшением кода
Пример 1:

public class DiscountCalculator {
    public double calculateDiscount(String customerType, double amount) {
        if (customerType.equals("regular")) {
            return amount * 0.05;
        } else if (customerType.equals("vip")) {
            return amount * 0.10;
        } else if (customerType.equals("employee")) {
            return amount * 0.30;
        } else {
            return 0;
        }
    }
}
*/
public class DiscountCalculator {
    private final Map<String, DiscountPolicy> discountPolicies;

    public DiscountCalculator() {
        discountPolicies = new HashMap<>();
        discountPolicies.put("default", new NoDiscount());
        discountPolicies.put("regular", new RegularCustomerDiscount());
        discountPolicies.put("vip", new VipCustomerDiscount());
        discountPolicies.put("employee", new EmployeeDiscount());
    }

    public double calculateDiscount(String customerType, double amount) {
        DiscountPolicy discountPolicy = discountPolicies.getOrDefault(customerType, discountPolicies.get("default"));
        return discountPolicy.calculate(amount);
    }
}
