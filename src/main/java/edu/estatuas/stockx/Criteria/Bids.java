package edu.estatuas.stockx.Criteria;

import edu.estatuas.stockx.Item.Bid;
import edu.estatuas.stockx.Item.Item;
import edu.estatuas.stockx.Item.Offer;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Bids implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers()
                .stream()
                .filter(offer -> offer instanceof Bid)
                .sorted(Comparator.comparing(Offer::value).reversed())
                .collect(Collectors.toList());
    };

}
