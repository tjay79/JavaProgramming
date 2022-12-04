package day35_PracticeTasks;

public class CandyTask {

    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanuts;

    public String getBrand() {
        return brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setQuantity(int quantity) {
        if(quantity<=0){
            System.err.println("Invalid quantity");
            System.exit(0);
        }
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        if(price<0){
            System.err.println("Price can not be negative");
            System.exit(0);
        }
        this.price = price;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public CandyTask(String brand, int quantity, double price, boolean hasPeanuts) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);
    }



    public String toString() {
        if(price==0){
            return "CandyTask{" +
                    "brand='" + brand + '\'' +
                    ", quantity=" + quantity +
                    ", price=free"  +
                    ", hasPeanuts=" + hasPeanuts +
                    '}';
        }else {

            return "CandyTask{" +
                    "brand='" + brand + '\'' +
                    ", quantity=" + quantity +
                    ", price=" + price +
                    ", hasPeanuts=" + hasPeanuts +
                    '}';
        }
    }
}
