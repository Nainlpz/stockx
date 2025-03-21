package edu.estatuas.stockx.Item;

public interface Offer {

    String size();
    int value();
    int compareTo(Offer offer);

}
