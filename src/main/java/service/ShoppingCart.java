package service;

import model.Food;

public class ShoppingCart {
    private Food[] products;

    public ShoppingCart(Food[] products){
            this.products = products;
    }

    public double getTotalPriceWithoutDiscount() {
        double sum1 = 0;
        for (Food product : products) {
            sum1 += product.getTotalPrice();
        }
        return sum1;
    }

    public double getTotalPriceWithDiscount() {
        double sum2 = 0;
        for (Food product: products) {
            double discount = product.getDiscount();
            double total = product.getTotalPrice();
            total -= total * (discount / 100);
            sum2 += total;
        }
        return sum2;
    }

    public double getTotalVegetarianPrice() {
        double sum3 = 0;
        for (Food product: products) {
            if (product.isVegetarian()) {
                sum3 += product.getTotalPrice();
            }
        }
        return sum3;
    }
}
