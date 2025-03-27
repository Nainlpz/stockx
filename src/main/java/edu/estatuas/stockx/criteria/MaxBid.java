package edu.estatuas.stockx.criteria;

import edu.estatuas.stockx.item.Bid;
import edu.estatuas.stockx.item.Item;
import edu.estatuas.stockx.item.Offer;

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
