package francescocristiano.U5_W1_D1;

import francescocristiano.U5_W1_D1.configurations.BeanConfiguration;
import francescocristiano.U5_W1_D1.entities.Drink;
import francescocristiano.U5_W1_D1.entities.Menu;
import francescocristiano.U5_W1_D1.entities.Pizza;
import francescocristiano.U5_W1_D1.entities.Topping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Collectors;

@SpringBootApplication
public class U5W1D1Application {

    public static void main(String[] args) {
        SpringApplication.run(U5W1D1Application.class, args);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        Menu menu = context.getBean(Menu.class);
        System.out.println();
        System.out.println("Menu");
        System.out.println();
        System.out.println("Pizze");
        for (Pizza pizza : menu.getPizzas()) {
            System.out.println(pizza.getName() + " - " + pizza.getToppings().stream().map(Topping::getName).collect(Collectors.joining(", ")) + " - " + pizza.getPrice() + "€" + " - " + pizza.getCalories() + "kcal");
        }
        System.out.println();
        System.out.println("Toppings");
        for (Topping topping : menu.getToppings()) {
            System.out.println(topping.getName() + " - " + topping.getPrice() + "€" + " - " + topping.getCalories() + "kcal");
        }
        System.out.println();
        System.out.println("Drinks");
        for (Drink drink : menu.getDrinks()) {
            String alcoholInfo = drink.getAlcoholConcentration() != null ? " - Alcohol: " + drink.getAlcoholConcentration() : "";
            System.out.println(drink.getName() + " - " + drink.getPrice() + "€" + " - " + alcoholInfo + " - " + drink.getCalories() + "kcal");
        }

    }

}
