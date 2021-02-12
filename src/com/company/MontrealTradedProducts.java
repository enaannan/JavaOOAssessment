package com.company;

import com.company.custom.exception.ProductAlreadyRegisteredException;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class MontrealTradedProducts implements IMontrealTradedProducts{

    HashMap<Product,Integer> productSet = new HashMap<Product, Integer>(); // holds added products



    @Override
    public void addNewProduct(Product product) throws ProductAlreadyRegisteredException {


if(productSet.containsKey(product)){
    throw new ProductAlreadyRegisteredException("The product is already being monitored");
}
product.setTradeTimestamp(LocalDate.now()) ;
        productSet.put(product,1);

    }

    @Override
    public void trade(Product product, int quantity) {
if (productSet.containsKey(product)){
    productSet.put(product,productSet.get(product)+quantity);




}

    }

    @Override
    public int totalTradeQuantityForDay() {
        Set<Product> keySet = productSet.keySet();
        List filtered = keySet.stream().filter(p-> p.tradeTimestamp == LocalDate.now()).collect(Collectors.toList());

        int total=0;
        for(int i =0;i<filtered.size();i++){
         total+= productSet.get(filtered.get(i));
        }
        return total;
    }

    @Override
    public double totalValueOfDaysTradedProducts() {
        return 0;
    }
}
