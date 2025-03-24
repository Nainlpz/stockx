package edu.estatuas.stockx.Criteria;

import edu.estatuas.stockx.Item.Ask;
import edu.estatuas.stockx.Item.Item;
import edu.estatuas.stockx.Item.Offer;

import java.util.Comparator;
import java.util.List;

public class MinAsk implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers()
                .stream()
                .filter(offer -> offer instanceof Ask)
                .min(Comparator.comparingInt(Offer::value))
                .stream().toList();
    };

}
