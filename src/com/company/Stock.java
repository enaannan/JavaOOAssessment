package com.company;

public class Stock extends Product {

private String ticker;
private String exchange;
private IProductPricingService productPricingService;


public Stock (String productID, String ticker,String exchange, IProductPricingService productPricingService){
    this.productID = productID;
    this.ticker=ticker;
    this.exchange=exchange;
    this.productPricingService= productPricingService;
    this.currentPrice = this.productPricingService.price(this.exchange,this.ticker);
}
public double getCurrentPrice(){
    return currentPrice;
}
    public String getTicker() {
        return ticker;
    }


    public String getExchange() {
        return exchange;
    }


}
