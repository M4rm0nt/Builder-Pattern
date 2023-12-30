public class PizzaBuilder {
    private String teig = "";
    private String sauce = "";
    private String belag = "";

    public PizzaBuilder teig(String teig) {
        this.teig = teig;
        return this;
    }

    public PizzaBuilder sauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public PizzaBuilder belag(String belag) {
        this.belag = belag;
        return this;
    }

    public Pizza build() {
        Pizza pizza = new Pizza();
        pizza.setTeig(teig);
        pizza.setSauce(sauce);
        pizza.setBelag(belag);
        return pizza;
    }
}
