package bruce.sun.example;

import java.util.ArrayList;

public class Order {
    private int id;
    private String infoMsg;
    private ArrayList<LineItem> lineItems;

    public Order(int id, String infoMsg) {

        this.id = id;
        this.infoMsg = infoMsg;
        lineItems = new ArrayList<LineItem>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInfoMsg() {
        return this.infoMsg;
    }

    private double price(){
        return lineItems.stream().mapToDouble(LineItem::getPrice).sum();
    }
}
