import java.util.*;
public class GroceryList
{
  ArrayList<GroceryItem> list;
  public GroceryList()
  {
  list=new ArrayList<GroceryItem>();
  }
  
  public void add(GroceryItem item)
  {
    list.add(item);
  }
  
  public double getTotalCost()
  {
    double netCost=0;
    for (int i=0; i<list.size(); i++)
    {
    netCost+=list.get(i).getCost();
    }
    return netCost;
  }
  
  public String toString()
  {
    String s="";
    for (int i=0; i<list.size(); i++)
    {
      s+=list.get(i).toString()+"/n";
    }
    return s;
  }
} 
