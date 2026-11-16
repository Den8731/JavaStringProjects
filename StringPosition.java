package com.cherish.StringsProjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StringPosition {

    Random randomAction;//Instantiating random object



    public void getStringPosition(String stringInput){
        String firstPart, secondPart;

        String temp;
        int pos = stringInput.length();

        randomAction = new Random();
        int randomPosition = randomAction.nextInt(pos);

        char randomLetter = stringInput.charAt(randomPosition);
        int retrieveIndex = stringInput.indexOf(randomPosition);
        System.out.println(retrieveIndex);

        System.out.println("Your new letter is: "+ randomLetter +
                " at position: " + "  " + randomPosition);
    }
    public static void main(String[] args){

        StringPosition position = new StringPosition();
        position.getStringPosition("supercalifragilisticexpialidocious");
    }
}
