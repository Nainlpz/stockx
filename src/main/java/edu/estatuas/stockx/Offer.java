package edu.estatuas.stockx;

interface Offer {

    String size();
    int value();
    int compareTo(Offer offer);

}
