package edu.estatuas.stockx.criteria;

import edu.estatuas.stockx.item.Ask;
import edu.estatuas.stockx.item.Item;
import edu.estatuas.stockx.item.Offer;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Asks implements Criteria{

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers()
                .stream()
                .filter(offer -> offer instanceof Ask)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    };
}
