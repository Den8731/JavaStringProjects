package com.cherish.StringsProjects;

import java.io.FileWriter;
import java.io.IOException;

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
    public void extractString(String extractStr){

        randomAction = new Random();
        int randomPos = randomAction.nextInt(extractStr.length() + 1);

        String strIndexOf = extractStr.substring(0, randomPos);
        System.out.println(strIndexOf);
        System.out.println("Successfully wrote to the file.");

        try (FileWriter writeFile = new FileWriter("stringOutput.txt")){

            writeFile.write(strIndexOf);

            writeFile.flush();
            writeFile.close();


        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();

        }
    }

    public void writeResultToFile(String writeStr){


    }
    public static void main(String[] args){
        String someText = "California";

        StringPosition position = new StringPosition();
        StringPosition extraction = new StringPosition();


        extraction.extractString(someText);
        position.getStringPosition(someText);
//        writeResult.writeResultToFile(someText);

    }

}
