public class GroceryItem
{
  String name;
  int quantity;
  double pricePerUnit;
  
  public GroceryItem (String name, int quantity, double pricePerUnit)
  {
    this.name=name;
    this.quantity=quantity;
    this.pricePerUnit=pricePerUnit;
  }
  
  public double getCost()
  {
    return quantity*pricePerUnit;
  }
  
  public  void setQuantity(int quantity)
  {
    this.quantity=quantity;
  }
  
  public String toString()
  {
    return quantity+" @ $"+pricePerUnit+" = $"+quantity*pricePerUnit;
  }
}
