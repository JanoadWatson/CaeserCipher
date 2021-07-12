package base;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Code {


    public Code(){

    }

    public void Encode(String sentence , int numOfLetters){
        Charset utf8 = StandardCharsets.UTF_8;
        List<String> list = Arrays.asList("lone 1","line2");
        String encodedSen="";
        int newLetter;

        for (int i = 0 ; i < sentence.length();i++){
            if(Character.isWhitespace(sentence.charAt(i))==true){
                encodedSen= encodedSen + sentence.charAt(i);

            }else{
                newLetter= (int)sentence.charAt(i) +numOfLetters;
                encodedSen=encodedSen+(char)newLetter;

            }
        }
        Path filePath = Paths.get(System.getProperty("user.dir")+"\\src\\base\\encode.text");
        try {
            Files.write(filePath,encodedSen.getBytes(StandardCharsets.UTF_8),StandardOpenOption.CREATE,StandardOpenOption.APPEND);




        } catch (IOException e) {
            e.printStackTrace();
        }



        System.out.println("Your translated text is: "+ encodedSen);

    }

    public void Decode( String sentence ,int numOfLetters){


        try {
            sentence = Files.readString(Path.of(System.getProperty("user.dir")+"\\src\\base\\encode.text"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String encodedSen="";
        int newLetter;

        for (int i = 0 ; i < sentence.length();i++){
            if(Character.isWhitespace(sentence.charAt(i))==true){
                encodedSen= encodedSen + sentence.charAt(i);

            }else{
                newLetter= (int)sentence.charAt(i)-numOfLetters;
                encodedSen=encodedSen+(char)newLetter;

            }
        }
        System.out.println("Your translated text is: " + encodedSen);
    }
}

