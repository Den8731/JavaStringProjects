import java.util.Random;

public class RandomTextGenerator {


    public void randomNameGenerator(String stringInput){
        Random random = new Random();

        int randomNumber = random.nextInt(stringInput.length());
        String newWord = stringInput.substring(0,randomNumber +1);

        System.out.println(newWord);

    }

    public void LetterExtractor(String input){

        for(int scanString = 0; scanString < input.length(); scanString++){
             if(scanString% 3 ==0){
                 System.out.println(input.charAt(scanString));
             }
        }
    }

    public void nameGenerator(String newName){
        Random randNum = new Random();
        String firstPart, secondPart;

    for (int scanItem = 0; scanItem < newName.length(); scanItem++) {

            int middlePart =
    }

    }
    public void LetterReversal(){

    }

    public void Interweaver(){

    }


}
