package com.capgemini_training.addressbookapp.exception;

//custom exception
public class AddressNotFoundException extends RuntimeException{
    public AddressNotFoundException(String message){
        super(message);
    }
}
