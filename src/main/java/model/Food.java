package model;

import model.constants.Discount;

public abstract class  Food implements Discountable {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    public Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    @Override
    public double getDiscount() {
        return Discount.DEFAULT;

    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public double totalPrice() {
        return amount * price;
    }
    public  double discountPrice () {
        double discount = (100 - getDiscount()) / 100;
        return totalPrice() * discount;
    }
}
