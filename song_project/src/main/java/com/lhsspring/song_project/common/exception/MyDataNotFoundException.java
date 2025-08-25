package com.lhsspring.song_project.common.exception;

public class MyDataNotFoundException extends RuntimeException {
    public MyDataNotFoundException() {super();}

    public MyDataNotFoundException(String message) {super(message);}

    public MyDataNotFoundException(Exception e, String message) {super(message, e);}
}
