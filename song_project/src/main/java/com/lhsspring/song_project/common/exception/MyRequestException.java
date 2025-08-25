package com.lhsspring.song_project.common.exception;

public class MyRequestException extends RuntimeException{
    public MyRequestException() { super(); }
    public MyRequestException(String message) { super(message); }
}
