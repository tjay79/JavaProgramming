package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {

        Offer offer1= new Offer();
        Offer offer2= new Offer();
        Offer offer3= new Offer();
        Offer offer4= new Offer();
        Offer offer5= new Offer();


        offer1.setInfo("VA", "Amazon Inc","SDET", 110000, true, true, true, true);
        offer2.setInfo("CA", "Sony Inc", "QA", 120000, true, false, false, true);
        offer3.setInfo("FL", "Apple Inc", "QE", 125000, true, true, true, false);
        offer4.setInfo("TX", "Capital One", "SM", 115000, false, false, true, true);
        offer5.setInfo("WA", "Bank of America", "BA", 130000, true, true, true, true);

        Offer[] myoffers={offer1, offer2, offer3, offer4, offer5};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myoffers));

        fullTimeOffers.removeIf(p->!p.isFullTime);//removes if the offer is not fulltime.

        System.out.println(fullTimeOffers);

        ArrayList<Offer> localOffers=new ArrayList<>(Arrays.asList(myoffers));

        localOffers.removeIf(p->!p.location.equals("VA"));

        System.out.println(localOffers.size());








    }
}
