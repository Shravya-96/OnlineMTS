package com.cap.Omts.Exceptions;


public class IdNotFoundException extends RuntimeException{
	//This IdNotFoundException will be thrown when an id is incorrect
    public IdNotFoundException(String msg){
        super(msg);
    }

    public IdNotFoundException(String msg,Throwable e){
        super(msg,e);
    }
}
