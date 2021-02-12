package com.company;

public interface IProductPricingService {
    double price(String exchange, String ticker);
    double price(String exchange, String contractCode, int month, int year);
}
