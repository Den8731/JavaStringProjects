import java.util.Random;

public static void main(String[] args){

    RandomTextGenerator newText = new RandomTextGenerator();
    RandomTextGenerator extract = new RandomTextGenerator();

    String someText = "supercalifragilisticexpialidocious";
    newText.randomNameGenerator(someText);

        extract.LetterExtractor(someText);

}

