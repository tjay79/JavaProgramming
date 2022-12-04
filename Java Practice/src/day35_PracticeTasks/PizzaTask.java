package day35_PracticeTasks;

public class PizzaTask {

    private char size;
    private int numberOfCheeseToppings;
    private int numberOfPepperoniToppings;

    public char getSize() {
        return size;
    }

    public int getNumberOfCheeseToppings() {
        return numberOfCheeseToppings;
    }

    public int getNumberOfPepperoniToppings() {
        return numberOfPepperoniToppings;
    }

    public void setSize(char size) {
        if(!(size=='S'||size=='M'||size=='L'||size=='s'||size=='m'||size=='l')){
            System.err.println("Invalid size");
            System.exit(0);
        }
        this.size = size;
    }

    public void setNumberOfCheeseToppings(int numberOfCheeseToppings) {
        if(size=='s'||size=='S'){
            if(numberOfCheeseToppings>3){
                System.err.println("Invalid number of toppings");
                System.exit(0);
            }
        }
        if(size=='m'||size=='M'){
            if(numberOfCheeseToppings>4){
                System.err.println("Invalid number of toppings");
                System.exit(0);
            }
        }
        if(size=='l'||size=='L'){
            if (numberOfCheeseToppings > 5) {
                System.err.println("Invalid number of toppings");
                System.exit(0);
            }
        }
        this.numberOfCheeseToppings = numberOfCheeseToppings;
    }

    public void setNumberOfPepperoniToppings(int numberOfPepperoniToppings) {
        if(size=='s'||size=='S'){
            if(numberOfPepperoniToppings>4){
                System.err.println("Invalid number of toppings");
                System.exit(0);
            }
        }
        if(size=='m'||size=='M'){
            if(numberOfPepperoniToppings>5){
                System.err.println("Invalid number of toppings");
                System.exit(0);
            }
        }
        if(size=='l'||size=='L'){
            if (numberOfPepperoniToppings > 6) {
                System.err.println("Invalid number of toppings");
                System.exit(0);
            }
        }

        this.numberOfPepperoniToppings = numberOfPepperoniToppings;
    }

    public PizzaTask(char size, int numberOfCheeseToppings, int numberOfPepperoniToppings) {
        setSize(size);
        setNumberOfCheeseToppings(numberOfCheeseToppings);
        setNumberOfPepperoniToppings(numberOfPepperoniToppings);
    }

    public double calcCost(){
        double totalCost=0;
        if(size=='s'||size=='S'){
            totalCost+=10;
        }
        if(size=='m'||size=='M'){
            totalCost+=12;
        }
        if(size=='l'||size=='L'){
            totalCost+=14;
        }
        totalCost+=numberOfCheeseToppings*2;
        totalCost+=numberOfPepperoniToppings*2;
        return totalCost;
    }

    public String toString() {
        return "PizzaTask{" +
                "size=" + size +
                ", numberOfCheeseToppings=" + numberOfCheeseToppings +
                ", numberOfPepperoniToppings=" + numberOfPepperoniToppings +
                ", total price=" + calcCost() +
                '}';
    }
}
/*
Pizza Task:
5.1 Create class named Pizza:
private variables:
size, numberOfCheeseTopping,
numberOfPepperoniTopping
Encapsulate all the fields
Conditions:
size of the
pizza can only be small, medium, large. case insensitive
Number of
cheese topping can not be negative, the maximum number of cheese topping
is:
small: 3
medium: 4
large: 5
Number of
pepperoni topping can not be negative, the maximum number of pepperoni
topping is:
small: 4
medium: 5
large: 6
Add a constructor that allows user to
set all the fields when the object is created.
(If the arguments not valid it should not be set to the instances)
Methods:
calcCost(): returns the
totalCost of the pizza
toString():returns a String
containing the pizza size, quantity of each topping, and the pizza cost as
calculated by calcCost()
Pizza cost is determined by:
S: $10 + $2 per topping
M: $12 + $2 per topping
L: $14 + $2 per topping
 */
