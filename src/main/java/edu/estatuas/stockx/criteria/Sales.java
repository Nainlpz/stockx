package edu.estatuas.stockx.criteria;

import edu.estatuas.stockx.item.Sale;
import edu.estatuas.stockx.item.Item;
import edu.estatuas.stockx.item.Offer;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sales implements Criteria{

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers()
                .stream()
                .filter(offer -> offer instanceof Sale)
                .collect(Collectors.toList());
    };

}
