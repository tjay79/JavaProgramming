package day35_PracticeTasks;

public class CarpetTask {

    private double length, width, unitPrice;
    private boolean isPersian;

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public boolean isPersian() {
        return isPersian;
    }

    public void setLength(double length) {
        if(length<=0){
            System.err.println("Invalid value: "+length);
            System.exit(0);
        }
        this.length = length;
    }

    public void setWidth(double width) {
        if(width<=0) {
            System.err.println("Invalid value: " + width);
            System.exit(0);
        }
        this.width = width;
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice<=0){
            System.err.println("Invalid value: "+unitPrice);
            System.exit(0);
        }
        this.unitPrice = unitPrice;
    }

    public void setPersian(boolean persian) {
        this.isPersian = persian;
    }

    public CarpetTask(double length, double width, double unitPrice, boolean isPersian) {
        setLength(length);
        setWidth(width);
        setUnitPrice(unitPrice);
        setPersian(isPersian);
    }

    public double totalPrice(){
        double totalPrice=0;
        totalPrice=(width*length)*unitPrice;
        if(isPersian){
            totalPrice+=200;
        }
        return totalPrice;
    }

    public String toString() {
        return "CarpetTask{" +
                "length=" + length +
                ", width=" + width +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total cost=" + totalPrice() +
                '}';
    }
}
/*
Carpet Task
3.1create a class named Carpet:
private variables:
width, length, unitPrice, isPersian (boolean)
Encapsulate all the fields:
Conditions:
width can not be negative
width can not be negative
unit price can not be negative
Add a constructor to set all the instances
instance methods:
calcCost(): should be able to calculate the total
cost of the carpet and return it as double
toString(): should be able to display all the info
of the carpet including the total cost of the carpet as calculated by
calcCost()
total price of carpet = (width*length)*unitPrice
if the carpet is persian  carpet, add 200$ to the totalPrice
 */
