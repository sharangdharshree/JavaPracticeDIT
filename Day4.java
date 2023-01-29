/*
 * 
 * 
 * 
 */

enum FoodItems {
    BURGER, PIZZA, DRINKS, DESSERTS // group of constants {uppercase}

}

public class Day4 {
    public static void main(String[] args) {
        int x = 12345;
        int rot = 2;
        for (int i = 0; i < 2; i++) {
            int rem = x % 10;
            x = x / 10;
            x = rem * 10000 + x;
        }
        System.out.println(x);
    }
}
