package edu.estatuas.stockx.item;

import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item {

    private String style = "";
    private String name = "";
    private int sale = 0;
    private int ask = 0;
    private int bid = 0;
    private List<Offer> offers = new ArrayList<Offer>();

    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
    }

    public String getStyle() {
        return this.style;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int getBid() {
        return this.bid;
    };

    @Override
    public void setBid(int bid) {
        this.bid = bid;
    };

    @Override
    public int getAsk() {
        return this.ask;
    };

    @Override
    public void setAsk(int ask) {
        this.ask = ask;
    };

    @Override
    public int getSale() {
        return this.sale;
    };

    @Override
    public void setSale(int sale) {
        this.sale = sale;
    };

    @Override
    public void add(Offer offer) {
        this.offers.add(offer);
    }

    @Override
    public List<Offer> offers() {
        return this.offers;
    }

    @Override
    public String toString() {
        return "\t" + this.name + "\n\t\t" + this.style;
    }

}
