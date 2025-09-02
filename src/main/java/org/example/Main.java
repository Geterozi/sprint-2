package org.example;

import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

var meat = new Meat(5, 100);
var red = new Apple(10, 50, Colour.RED);
var green = new Apple(8, 60, Colour.GREEN);

Food[] items = {meat, red, green};

var cart = new ShoppingCart(items);

        System.out.println("Общая сумма товаров без скидки: " + cart.totalPrice());
        System.out.println("Общая сумма товаров со скидкой: " + cart.discountPrice());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.vegPrice());
       }
    }
