package _2_oop._7_inner_and_nested_classes;

//static nested class
public class App_1 {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.addItem("квартплата", 1, 10);
        invoice.addItem("кредит", 5, 100);
        System.out.println(invoice.totalPrice());

        //не скомпилируется
//        Invoice.Item newItem = new Invoice.Item("новый счет", 1, 15);
//        invoice.add(newItem);
        Response.Ok ok = new Response.Ok();
        Response.Fail fail = new Response.Fail();
    }
}
interface Response{
    class Ok{}
    class Fail{}
}
class Response2{
    static class Ok{}
    static class Fail{}
}


interface A{
    static class I{
        interface A2{
        }
    }
}

class Invoice {

    int offset = 0;

    private Item[] items = new Item[100];

    public void addItem(String description, int quantity,
                        double unitPrice) {
        Item newItem = new Item();
        newItem.description = description;
        newItem.quantity = quantity;
        newItem.unitPrice = unitPrice;
        items[offset++] = newItem;
    }

    public void add(Item item) {
        items[offset++] = item;
    }

    public int totalPrice() {
        int sum = 0;
        int i = 0;
        while (items[i] != null)
            //обращение к приватному методу
            sum += items[i++].price();

        return sum;
    }

    private static class Item {
        String description;
        int quantity;
        double unitPrice;

        public Item() {
        }

        public Item(String description, int quantity, double unitPrice) {
            this.description = description;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
        }

        private double price() {
            return quantity * unitPrice;
        }
    }
}
