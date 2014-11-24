11-24-Groceries
===============

## Objectives
- Understand how to represent an object's state as *fields*
- Understand how to represent an object's behavior as instance *methods*
- Be able to implement a class with *constructors, Accessors and Mutators*

## Assignment - Due Tuesday morning 11/25 before class

Write a program Groceries with a class named GroceryList that represents a list of items to buy from the market, and another class named GroceryItem that represents a request to purchase a particular item in a given quantity (example: four boxes of cookies). 

### GroceryItem (GroceryItem.java)
The GroceryItem class should store an item's name, quantity and a price per unit. A GroceryItem object should have the following methods:
- **public GroceryItem(String name, int quantity, double pricePerUnit)**: Constructs an item order to purchase the item with the given name, in the given quantity, which costs the given price per unit.
- **public double getCost()**: Returns the total cost of this item in its given quantity. For example, four boxes of cookies that cost 2.30 per unit have a total cost of 9.20.
- **public void setQuantity(int quantity)**: Sets this grocery item’s quantity to be the given value.
- **public String toString()**: Returns a string <quantity> <name> @ <pricePerUnit> = <getCost>, i.e. "3 Oreos @ $2.5 = $7.5"

### GroceryList (GroceryList.java)
The GroceryList class should use an ArrayList field to store the grocery items and to keep track of its size (number of items in the list so far). A GroceryList object should have the following methods:
- **public GroceryList()**: Constructs a new empty grocery list.
- **public void add(GroceryItem item)**: Adds the given item order to this list.
- **public double getTotalCost()**: Returns the total sum cost of all grocery item orders in this list.
- **public String toString()**: Returns a string with each item's name, quantity and unit price and total on a new line (HINT: use GroceryItem's toString() method and add "\n").

### Groceries (Groceries.java)
This is the main program, i.e. `public static void main(String[] args)...`
- create a new instance of GroceryList
- add at least five (5) GroceryItems to the GroceryList
- print out the GroceryList
- print out the GroceryList total cost

## Output (example)
Your output when running *Groceries* should be similar to [output.txt](./output.txt)...
```
Grocery List:
3 Oreos @ $2.5 = $7.5
2 Goldfish Crakers @ $1.75 = $3.5
8 Apple @ $0.23 = $1.84
2 Fruit Loops @ $4.32 = $8.64
4 Pop Tarts @ $3.67 = $14.68

Total: $36.16
```
