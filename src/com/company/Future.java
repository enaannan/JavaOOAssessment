package com.company;

import java.time.LocalDate;

public class Future extends Product {

   private String exchange;
    private String contractCode;
    private int month;
    private int year;
    IProductPricingService iProductPricingService;


    public Future(String productID, String exchange,String contractCode, IProductPricingService productPricingService){
       this.productID = productID;
       this.contractCode= contractCode;
       this.exchange=exchange;
       this.month = LocalDate.now().getMonthValue();
this.year = LocalDate.now().getYear();
this.iProductPricingService=productPricingService;
this.currentPrice = this.iProductPricingService.price(this.exchange,this.contractCode,this.month,this.year);
    }


    public String getContractCode() {
        return contractCode;
    }
    public double getCurrentPrice(){
        return currentPrice;
    }
    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }
}
