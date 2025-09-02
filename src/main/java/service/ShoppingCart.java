package service;

import model.Food;

public class ShoppingCart {
    private final Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double totalPrice() {
        double sum = 0;
        for (Food item : items) {
            sum += item.totalPrice();
            
        }
        return sum;
    }

    public double discountPrice() {
        double sum = 0;
        for (Food item : items) {
            sum += item.discountPrice();

        }
        return sum;
    }

    public double vegPrice() {
        double sum = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                sum += item.totalPrice();
            }
        }
        return sum;
    }
}