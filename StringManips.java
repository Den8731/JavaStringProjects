package com.cherish.StringsProjects;

import java.util.Random;

public class StringManips {
    StringBuilder manipStr;
Random randomAction;
    public void extractAndInsert(String extractStr){

        int start, end;

        randomAction = new Random();
        start = randomAction.nextInt(extractStr.length());


        //Select a random substring length
        int strLength = randomAction.nextInt(extractStr.length() - start + 1);


        String str = extractStr.substring(start, start+ strLength);
        manipStr = new StringBuilder(extractStr);
        manipStr.delete(start,start +strLength);

        // Generate random insertion position
        int insertPos = randomAction.nextInt(manipStr.length()+1);

        // Reinsert substring
        manipStr.insert(insertPos,str);


        System.out.println("Original word: " + extractStr);
        System.out.println("Extracted substring: " + str);
        System.out.println("Modified word: " + manipStr.toString());


    }
}
