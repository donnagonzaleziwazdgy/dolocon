public class Candy {
    private String name;
    private int quantity;

    public Candy(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Candy{name='" + name + "', quantity=" + quantity + '}';
    }

    public static void main(String[] args) {
        Candy candy = new Candy("Chocolate", 5);
        System.out.println(candy);
    }
}
