package com.company.custom.exception;

public class ProductAlreadyRegisteredException extends  Exception{
    public ProductAlreadyRegisteredException(String message){
        super(message);
    }
}
