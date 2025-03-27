package edu.estatuas.stockx.criteria;

import edu.estatuas.stockx.item.Bid;
import edu.estatuas.stockx.item.Item;
import edu.estatuas.stockx.item.Offer;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Bids implements Criteria {

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers()
                .stream()
                .filter(offer -> offer instanceof Bid)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    };

}
