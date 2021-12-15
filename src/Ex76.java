import java.util.ArrayList;

public class Ex76 {
    private ArrayList<String> meals;

    public Ex76() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        meals.add(meal);
    }

    public void printMeals(ArrayList list) {
        int counter = 0;

        if (counter < list.size()) {
            System.out.println(list.get(counter));
            counter++;
        } else if (counter == list.size()) {
            counter = 0;
        }
    }
}
