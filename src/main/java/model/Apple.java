package model;

import static model.constants.Colour.COLOUR_RED;
import static model.constants.Discount.APPLE_RED_DISCOUNT;
import static model.constants.Discount.DEFAULT_DISCOUNT;

public class Apple extends Food{
    private String colour;

    public Apple(int amount, double price, String color){ // конструктор
        super(amount, price);
        this.colour = color;
        this.isVegetarian = true; // устанавливает значение isVegetarian
    }

    public String getColor() { // получаем цвет яблок
        return colour;
    }

    @Override
    public double getDiscount() { // устанавливает размер скидки
        if(colour == COLOUR_RED) {
            return APPLE_RED_DISCOUNT;
        } else return DEFAULT_DISCOUNT;
    }
}
