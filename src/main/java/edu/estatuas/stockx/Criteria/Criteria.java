package edu.estatuas.stockx.Criteria;

import edu.estatuas.stockx.Item.Item;
import edu.estatuas.stockx.Item.Offer;

import java.util.List;

public interface Criteria {

    List<Offer> checkCriteria(Item item);

}
