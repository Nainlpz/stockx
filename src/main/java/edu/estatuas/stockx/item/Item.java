package edu.estatuas.stockx.item;

import java.util.List;

public interface Item {

    int getBid();
    void setBid(int bid);

    int getAsk();
    void setAsk(int ask);

    int getSale();
    void setSale(int sale);

    void add(Offer offer);
    List<Offer> offers();

}
