package supermarket;

import java.util.ArrayList;

public class Pr4 {
    public static void main(String[] args) {
        ArrayList<Supermarket> listn = new ArrayList<>();
        List list = new List(listn);

        Toys ball = new Toys("Игрушечный", "Заяц", "Япония", 100, "МирИгрушек.", 3, "balls");
        list.addProduct(ball);

        Fruits apple = new Fruits("Фруктовый", "Яблоко", "Германия", 20, "СпанКор.", 15, 20);
        list.addProduct(apple);

        DimensionalProduct wardrobe = new DimensionalProduct("Десертный", "Клубника в шоколаде", "Испания", 500, "ФрутГор", 210, 25, 50);
        list.addProduct(wardrobe);

        System.out.println(ball.getRetailPrice());
        System.out.println(apple.getCountry());
        System.out.println(wardrobe.getHeight());
        System.out.println(wardrobe.toString());

        list.print();
    }
}