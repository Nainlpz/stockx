package edu.estatuas.stockx.Criteria;

import edu.estatuas.stockx.Item.Sale;
import edu.estatuas.stockx.Item.Item;
import edu.estatuas.stockx.Item.Offer;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sales implements Criteria{

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers()
                .stream()
                .filter(offer -> offer instanceof Sale)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    };

}
