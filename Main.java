import com.cherish.StringsProjects.StringManips;
import com.cherish.StringsProjects.StringPosition;

public static void main(String[] args){
    String someText = "North Carolina";

    StringPosition position = new StringPosition();
    StringPosition extraction = new StringPosition();

    //Instantiating object from class StringManips
    StringManips manipStr = new StringManips();
    manipStr.extractAndInsert(someText);


//    position.getStringPosition(someText);
//        writeResult.writeResultToFile(someText);




}
