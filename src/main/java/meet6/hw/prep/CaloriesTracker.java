package meet6.hw.prep;

import java.util.ArrayList;
import java.util.Date;

/*Задача 7:
Спроектировать приложение по подсчету калорий за день:
Приложение отображает: съеденные блюда и суммарное количество калорий за день
Можно добавлять и удалять блюдо
Можно получать среднее количество калорий, которое было съедено в день на основании данных за прошлые дни.

Трекер
- Список блюд арэй лист

метод на добавление блюда
метод на удаление блюда
метод на получение среднего количества калорий съеденных

Блюдо
- калорийность блюда
- день когда было съедено блюдо

*/
public class CaloriesTracker {
    private ArrayList<Dish> dishes;
    private ArrayList<Date> dates;

    public CaloriesTracker() {
        dishes = new ArrayList<>();
        dates = new ArrayList<>();
    }

    public void addDish(Dish dish) {
        dishes.add(dish);
    }

    public void removeDish(Dish dish) {
        dishes.remove(dish);
    }

    public int calculateAverageCalories() {
        int result;
        for (int i = 0; i < dishes.size(); i++) {
        }
    }
}

class Dish {
    private int calories;
    private Date log;

    public Dish(int calories) {
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }
}
