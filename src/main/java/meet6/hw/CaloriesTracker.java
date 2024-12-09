package meet6.hw;

import java.util.*;

/*Задача 7:
Спроектировать приложение по подсчету калорий за день:
1. Приложение отображает: съеденные блюда и суммарное количество калорий за день
2. Можно добавлять блюдо
3. Удалять блюдо
4. Можно получать среднее количество калорий, которое было съедено в день на основании данных за прошлые дни.

Приложение
- список блюд (+ калории)

- метод добавить блюдо в список
- метод удалить блюдо из списка
- метод по получению среднего кол-ва калорий, которое было съедено в день на основании данных за прошлые дни.

Блюдо
- калории инт измен
- дата съеденного блюда Date измен

геттеры сеттеры

*/
public class CaloriesTracker {
    private List<Dish> dishes;

    public CaloriesTracker() {
        dishes = new ArrayList<>();
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public void removeDish(Dish dish) {
        dishes.remove(dish);
    }

    public double calculateAverageCalories() {
        if (dishes.isEmpty()) {
            return 0;
        }

        int totalCalories = 0;

        Set<Date> dates = new HashSet<>();

        for (Dish dish : dishes) {
            totalCalories += dish.getCalories();
            //добавление даты
            dates.add(dish.getLog());
        }

        return (double) totalCalories / dates.size();
    }
}

class Dish {
    private int calories;
    private Date log;

    public Dish(int calories, Date log) {
        this.calories = calories;
        this.log = log;
    }

    public int getCalories() {
        return calories;
    }

    public Date getLog() {
        return log;
    }
}

class Main1 {
    public static void main(String[] args) {
        CaloriesTracker caloriesTracker = new CaloriesTracker();

        caloriesTracker.addDish(new Dish(100, new Date(2024, 12, 8)));
        caloriesTracker.addDish(new Dish(200, new Date(2024, 12, 8)));
        caloriesTracker.addDish(new Dish(300, new Date(2024, 12, 9)));

        Dish dishToRemove = new Dish(400, new Date(2024, 12, 9));
        caloriesTracker.addDish(dishToRemove);

        System.out.println(caloriesTracker.calculateAverageCalories());

        caloriesTracker.removeDish(dishToRemove);

        System.out.println(caloriesTracker.calculateAverageCalories());

        CaloriesTracker caloriesTracker1 = new CaloriesTracker();

        System.out.println(caloriesTracker1.calculateAverageCalories());
    }
}
