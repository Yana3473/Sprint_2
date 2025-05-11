package model;

import static model.constants.Discount.DEFAULT_DISCOUNT;

public class Meat extends Food{

    public Meat(int amount, double price) { // конструктор
        super(amount, price);
        this.isVegetarian = false; // устанавливает значение isVegetarian
    }

    @Override
    public double getDiscount() { // устанавливает размер скидки
        return DEFAULT_DISCOUNT;
    }
}
