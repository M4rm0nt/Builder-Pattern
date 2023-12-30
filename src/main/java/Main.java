public class Main {

    public static void main(String[] args) {
        Pizza pizza = new PizzaBuilder()
                .teig("Cross")
                .sauce("Tomatensauce")
                .belag("Käse")
                .build();

        System.out.println(pizza);
    }

}
