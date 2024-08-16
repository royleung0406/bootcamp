package customer;

import java.util.Arrays;

public class Order {
  private Item [] items;
//
public Order(Item[] items) {
this.items = items;
}

    public Item[] getItems() {
    return this.items;
  }
  public static void main(String[] args) {
      Item i1 = new Item(10, "Apple");
      Item i2 = new Item(12, "Orange");
      Item i3 = new Item(13, "Pineapple");
      Item i4 = new Item(14, "Watermelon");
      Order o1 = new Order(new Item[] {i1, i2, i3, i4});


  }
}
