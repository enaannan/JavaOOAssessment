package com.company;

import java.time.LocalDate;
import java.util.Date;

public abstract class Product {
   protected String productID;
   protected double currentPrice;
   protected LocalDate tradeTimestamp;

    public void setTradeTimestamp(LocalDate tradeTimestamp) {
        this.tradeTimestamp = tradeTimestamp;
    }
}
