public class Pizza {
    private String teig;
    private String sauce;
    private String belag;

    public void setTeig(String teig) { this.teig = teig; }
    public void setSauce(String sauce) { this.sauce = sauce; }
    public void setBelag(String belag) { this.belag = belag; }

    @Override
    public String toString() {
        return "Pizza [Teig = " + teig + ", Sauce = " + sauce + ", Belag = " + belag + "]";
    }
}
