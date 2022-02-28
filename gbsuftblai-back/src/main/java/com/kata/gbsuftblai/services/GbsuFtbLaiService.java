package com.kata.gbsuftblai.services;

import org.springframework.stereotype.Component;

@Component
public class GbsuFtbLaiService {

    public static final int NUMBER_5 =5;
    public static final int NUMBER_3 =3;
    public static final char CHARACTER_3 = '3';
    public static final char CHARACTER_5 = '5';
    public static final char CHARACTER_7 = '7';
    public static final String GBSU = "Gbsu";
    public static final String FTB = "Ftb";
    public static final String LAI = "Lai";


    public String convertNumber(int inputNumber) {
        String number = String.valueOf(inputNumber);
        String result = getStrResultDivisibleByNumber(inputNumber,NUMBER_5)+getStrResultDivisibleByNumber(inputNumber,NUMBER_3)+
                getStrResultContainingCharacter(number,CHARACTER_7)+getStrResultContainingCharacter(number,CHARACTER_5)+getStrResultContainingCharacter(number,CHARACTER_3);
        return !result.isEmpty() ? result:number;
    }

    public static String getStrResultDivisibleByNumber(int inputNumber,int number){
        if(inputNumber % number == 0){
            return number==3 ? "Gbsu":"Ftb";
        }
        return "";
    }

    public static String getStrResultContainingCharacter(String inputNumber,char caracter){
        long nbrCharacter = inputNumber.chars().filter(s->s==caracter).count();
        String result="";
        String strToAdd = "";

        if(caracter == CHARACTER_3){
            strToAdd=GBSU;
        }else if(caracter == CHARACTER_5){
            strToAdd=FTB;
        }else if(caracter == CHARACTER_7){
            strToAdd=LAI;
        }

        for (int i = 0; i < nbrCharacter; i++) {
            result+=strToAdd;
        }
        return result;
    }



}