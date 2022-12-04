package day35_PracticeTasks;

public class ItemTask {

    private String name;
    private double unitPrice;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            System.err.println("Invalid name: " + name);
            System.exit(0);
        }
        for (int i = 0; i < name.length(); i++) {
            if (!Character.isLetterOrDigit(name.charAt(i))) {
                if (name.charAt(i) == ' ' && Character.isLetter(name.charAt(0)))
                    continue;
                System.err.println("Invalid name");
                System.exit(0);
            } else if (!Character.isLetter(name.charAt(0))) {
                System.err.println("Invalid name");
                System.exit(0);
            }


        }
        this.name = name;
    }
    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice<=0){
            System.err.println("Invalid value");
            System.exit(0);
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity<=0){
            System.out.println("Invalid value");
            System.exit(0);
        }
        if(name.equalsIgnoreCase("toilette paper")&&quantity>1){
            System.out.println("Quantity for toilette paper can not be more than 1");
            System.exit(0);
        }

        this.quantity = quantity;
    }

    public ItemTask(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public double calcCost(){
        double totalCost=quantity*unitPrice;
        return totalCost;
    }

    public String toString() {
        return "ItemTask{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total cost=" + calcCost() +
                '}';
    }
}
/*
Item Task
4.1create a class called Item
            private variables:
            name, unitPrice, quantity
Encapsulate all the fields:
Conditions:
name can not be empty or blank
name can not contain any special
characters other than space
name must start with letters
unit price can not be negative
quantity can not be negative
if the Item name is toilet paper
(case insensitive) then the quantity can not be more than 1
Add a constructor that allows user to set all the fields when
the object is created.
(If the arguments
not valid it should not be set to the instances)
instance methods:
calcCost(): returns the total cost
toString(): returns the name, unit price, quantity and
total cost info as calculated by calcCost()
 */
