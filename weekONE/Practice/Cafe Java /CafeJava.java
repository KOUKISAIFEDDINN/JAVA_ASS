public class CafeJava {
    public static void main(String[] args) {
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 3.8;
        double latte = 5.2;
        double cappuccino = 6.4;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";


        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;


        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); 
        System.out.println(pendingMessage + customer1);

        if (isReadyOrder4){
            System.out.println(customer4+readyMessage);
        }else {
            System.out.println(customer4+pendingMessage);
        }
        System.out.println(customer2 + displayTotalMessage + (latte * 2));
        if (isReadyOrder2){
            System.out.println(customer2+readyMessage);
        }else {
            System.out.println(customer2+pendingMessage);
        }
        System.out.println(customer3 + displayTotalMessage + (latte - dripCoffee));
    }
}