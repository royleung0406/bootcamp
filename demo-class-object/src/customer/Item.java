package customer;

public class Item {
  private double discount;
  private double price;
  private String itemName;

  public Item (double price, String itemName){
    this.price = price;
    this.itemName = itemName;
  }

  public double getPrice() {
    return this.price;
  }
  
  public void setPrice(double x) {
    this.price = x;

  }
  
    public String getItName() {
      return this.itemName;
    }
    
    public void setItName(String x) {
      this.itemName = x;
  
    }
  }

