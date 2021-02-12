package com.company;

import com.company.custom.exception.ProductAlreadyRegisteredException;

import java.time.LocalDate;
import java.util.*;

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
    // product is registered



}

    }

    @Override
    public int totalTradeQuantityForDay() {

        return 0;
    }

    @Override
    public double totalValueOfDaysTradedProducts() {
        return 0;
    }
}
