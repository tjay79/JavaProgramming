package day36_PracticeTasks.CryptoTask;

public class CryptoToken {

    public double price;
    public int quantity;
    public String marketCap;
    public String volume;
    public String circulatingSupply;
    public boolean isMineable;

    public void setInfo(double price, int quantity, String marketCap, String volume, String circulatingSupply, boolean isMineable) {
        this.price = price;
        this.quantity = quantity;
        this.marketCap = marketCap;
        this.volume = volume;
        this.circulatingSupply = circulatingSupply;
        this.isMineable = isMineable;
    }

    public String toString() {
        return "CryptoToken{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineable=" + isMineable +
                '}';
    }

    public double totalPrice(double price, int quantity){
        double totalPrice=price*quantity;
        return totalPrice;
    }
}
