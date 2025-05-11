import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 200);
        Apple redApple = new Apple(2, 100, Colour.COLOUR_RED);
        Apple greenApple = new Apple(1, 50, Colour.COLOUR_GREEN);

        Food[] products = {meat, redApple, greenApple};
        ShoppingCart cart = new ShoppingCart(products);

        System.out.println("Общая сумма товаров без скидки: " + cart.getTotalPriceWithoutDiscount());
        System.out.println("Общая сумма товаров со скидкой: " + cart.getTotalPriceWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.getTotalVegetarianPrice());
    }
}