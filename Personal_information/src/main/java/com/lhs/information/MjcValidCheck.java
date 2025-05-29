package com.lhs.information;

public class MjcValidCheck {

    private String PhoneNumber;
    private String Email;
    private String ZipNumber;

    public MjcValidCheck(String PhoneNumber, String Email, String ZipNumber){
        this.PhoneNumber = PhoneNumber;
        this.Email = Email;
        this.ZipNumber = ZipNumber;
    }


    public boolean isValidPhoneNumber(String text){
        if(text == null){
            return false;
        }
        return text.matches("^010-\\d{4}-\\d{4}$");
    }

    public boolean isValidZipNumber(String text){
        if(text == null){
            return false;
        }
        return text.matches("^[1-9]\\d{4}$");
    }

    public boolean isValidEmail(String text){
        if(text == null){
            return false;
        }
        return text.matches("\\w+@\\w+\\.\\w+(\\.\\w+)?");
    }
}