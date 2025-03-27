package edu.estatuas.stockx.criteria;

import edu.estatuas.stockx.item.Ask;
import edu.estatuas.stockx.item.Item;
import edu.estatuas.stockx.item.Offer;

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
