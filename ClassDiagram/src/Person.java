public class Person {
    int age;
    int weight;

    void eat(Food food) {
        weight += food.getCalorie() / 100;
    }
}

class Food {
    int calorie;

    int getCalorie() {
        return calorie;
    }

}

