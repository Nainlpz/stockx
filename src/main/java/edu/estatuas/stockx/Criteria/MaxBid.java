package edu.estatuas.stockx.Criteria;

import edu.estatuas.stockx.Item.Bid;
import edu.estatuas.stockx.Item.Item;
import edu.estatuas.stockx.Item.Offer;

import java.util.Comparator;
import java.util.List;

public class MaxBid implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers()
                .stream()
                .filter(offer -> offer instanceof Bid)
                .max(Comparator.comparingInt(Offer::value))
                .stream().toList();
    };

}
