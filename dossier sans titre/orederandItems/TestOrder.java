public class TestOrder {

    public static void main(String[] args) {

        // Create menu items
        Item item1 = new Item("mocha", 2.56);
        Item item2 = new Item("latte", 4.99);
        Item item3 = new Item("drip coffee", 3.22);
        Item item4 = new Item("cappuccino", 3.96);

        // Create order variables
        Order order1 = new Order("Cindhuri");
        Order order2 = new Order("Jimmy");
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");

        // Print order1 variable
        System.out.println("Printing order1 variable:");
        System.out.println(order1); 

        
        System.out.println("Order1 Total: " + order1.total); 

        
        order2.items.add(item1);
        order2.total += item1.price;

        
        order3.items.add(item4);
        order3.total += item4.price;

        
        order4.items.add(item2);
        order4.total += item2.price;

        
        order1.ready = true;

        // Sam order more drinks  2 lattes. 
        for (int i = 0; i < 2; i++) {
            order4.items.add(item2);
            order4.total += item2.price;
        }

        // the orfer of jimmy’s is ready. 
        order2.ready = true;

        // Display information for order1
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %.2f\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
    }
}