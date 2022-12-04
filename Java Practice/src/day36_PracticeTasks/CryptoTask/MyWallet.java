package day36_PracticeTasks.CryptoTask;

public class MyWallet {

    public static void main(String[] args) {

        Bitcoin bitcoin= new Bitcoin();
        bitcoin.setInfo(16101.36, 10, "6.1B","8B","19.22M",true);

        Cardano cardano = new Cardano();
        cardano.setInfo(.2987,1200, "10.6B","6.67B", "33.82B", true);

        Ethereum ethereum = new Ethereum();
        ethereum.setInfo(1277.28, 59, "156.28B","15.23B", "122.37M", true);

        XRP xrp= new XRP();
        xrp.setInfo(.39, 2000, "18.05B", "1.96B", "46.14B", true);

        Doge doge = new Doge();
        doge.setInfo(.09437, 4000,"13.19B", "840M", "132.67B", true );



        double totalAssets= bitcoin.totalPrice(bitcoin.price, bitcoin.quantity)+ cardano.totalPrice(cardano.price, cardano.quantity)+
                ethereum.totalPrice(ethereum.price, ethereum.quantity)+ doge.totalPrice(doge.price, doge.quantity)+ xrp.totalPrice(xrp.price, xrp.quantity);


        System.out.println(bitcoin);
        System.out.println(ethereum);
        System.out.println(doge);
        System.out.println(cardano);
        System.out.println(xrp);
        System.out.println(bitcoin.totalPrice(bitcoin.price, bitcoin.quantity));
        System.out.println(ethereum.totalPrice(ethereum.price, ethereum.quantity));
        System.out.println(cardano.totalPrice(cardano.price, cardano.quantity));
        System.out.println(doge.totalPrice(doge.price, doge.quantity));
        System.out.println(xrp.totalPrice(xrp.price, xrp.quantity));
        System.out.println(totalAssets);









    }
}
